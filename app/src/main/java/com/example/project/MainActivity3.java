package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.io.Serializable;
import java.util.List;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Toast;
import android.widget.TextView;
import android.content.Intent;
import java.util.ArrayList;
import java.util.Arrays;
import android.widget.RadioGroup;
import android.widget.RadioButton;
import android.adservices.topics.Topic;

import com.example.project.databinding.ActivityMain3Binding;
import com.example.project.databinding.ActivityMain4Binding;

import java.util.Collections;
public class MainActivity3 extends AppCompatActivity {
    private List<Question> listFilter;
    private List<Question> questions;
    private QuestionBank questionBank;
    private int currentQuestionIndex = 0;
    private List<Question> muoicauHoiNgauNhien;
    private int point = 0;
    private int check=0;
    private int x=-1;
    private String topicName;

    private int selectedRadioButtonId;
    private int selectedOptionIndex;
    private RadioButton radioButton;
    private RadioGroup radioGroupAnswers;
    public static final String remainCount_story = "remainCount_story_VALUE";
    public static final String currnetQuestion_story = "currentQuestion_story_VALUE";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        radioGroupAnswers = findViewById(R.id.radio_group);
        Intent intent = getIntent();
        topicName = intent.getStringExtra("topicName");
        check = intent.getIntExtra("check", 0);
        questionBank = (QuestionBank) intent.getSerializableExtra("questionBank");
        listFilter = new ArrayList<>();
        // Tạo danh sách câu hỏi dựa trên chủ đề và QuestionBank
        questions = getQuestionsForTopic(questionBank, topicName);
        //Lây câu khó hoặc dễ
        if(check==1){
            for (Question question : questions) {
                if (question.getDokho() == 1) {
                    listFilter.add(question);
                }
            }
        }else {
            for (Question question : questions) {
                if (question.getDokho() == 0) {
                    listFilter.add(question);
                }
            }
        }
        // Trộn ngẫu nhiên danh sách câu hỏi
        Collections.shuffle(listFilter);
        // Lấy 10 câu hỏi đầu tiên sau khi trộn
        muoicauHoiNgauNhien = new ArrayList<>();
        muoicauHoiNgauNhien = listFilter.subList(0, 6);
        // Hiển thị câu hỏi đầu tiên
        if (savedInstanceState != null) {
            currentQuestionIndex= savedInstanceState.getInt(currnetQuestion_story);
            muoicauHoiNgauNhien = (ArrayList<Question>) savedInstanceState.getSerializable("KEY_QUESTION_LIST");
        }
        showQuestion(currentQuestionIndex);
    }

    private void showQuestion(int questionIndex) {
        Question currentQuestion = muoicauHoiNgauNhien.get(questionIndex);
        // Hiển thị câu hỏi và các lựa chọn
        TextView textViewQuestion = findViewById(R.id.textView2);
        textViewQuestion.setText(currentQuestion.getQuestionText());

        radioGroupAnswers = findViewById(R.id.radio_group);
        //radioGroupAnswers.removeAllViews();

//        for (int i = 0; i < currentQuestion.getOptions().size(); i++) {
//            radioButton = new RadioButton(this);
//        radioButton.setText(currentQuestion.getOptions().get(i));
//        radioGroupAnswers.addView(radioButton);
//
//    }
        RadioButton radioButton1 = findViewById(R.id.rtn1);
        radioButton1.setText(currentQuestion.getOptions().get(0));
        RadioButton radioButton2 = findViewById(R.id.rtn2);
        radioButton2.setText(currentQuestion.getOptions().get(1));
        RadioButton radioButton3 = findViewById(R.id.rtn3);
        radioButton3.setText(currentQuestion.getOptions().get(2));
        RadioButton radioButton4 = findViewById(R.id.rtn4);
        radioButton4.setText(currentQuestion.getOptions().get(3));
        Button buttonSubmit = findViewById(R.id.btnTraloi);
        buttonSubmit.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                checkAnswerAndProceed(questionIndex);
            }
        });
    }

    private void checkAnswerAndProceed(int questionIndex) {
        Question currentQuestion = muoicauHoiNgauNhien.get(questionIndex);
        radioGroupAnswers = findViewById(R.id.radio_group);
        // Lấy id của RadioButton được chọn
        selectedRadioButtonId = radioGroupAnswers.getCheckedRadioButtonId();

        // Kiểm tra xem RadioButton có được chọn không
        if (selectedRadioButtonId != -1) {
           selectedOptionIndex = radioGroupAnswers.indexOfChild(radioGroupAnswers.findViewById(selectedRadioButtonId));
            // Kiểm tra xem đáp án có đúng không
            if ((selectedOptionIndex) == currentQuestion.getCorrectOptionIndex()) {
                if(check==1){
                 point=point+2;
                }else{
                    point++;
                }
                currentQuestionIndex++;
                if (currentQuestionIndex < muoicauHoiNgauNhien.size()) {
                    radioGroupAnswers.clearCheck();
                    showQuestion(currentQuestionIndex);
                }
                else {
                    radioGroupAnswers.clearCheck();
                    Intent intent = new Intent(MainActivity3.this, MainActivity4.class);
                    intent.putExtra("topicName3to4", topicName);
                    intent.putExtra("questionBank3to4", questionBank);
                    intent.putExtra("check3to4", check);
                    intent.putExtra("count", point);
                    startActivity(intent);
                }
            }
            else {
                radioGroupAnswers.clearCheck();
                Intent intent = new Intent(MainActivity3.this, MainActivity4.class);
                intent.putExtra("topicName3to4", topicName);
                intent.putExtra("questionBank3to4", questionBank);
                intent.putExtra("check3to4", check);
                intent.putExtra("count", point);
                startActivity(intent);
            }
        } else {
            Toast.makeText(MainActivity3.this, "Vui lòng chọn một đáp án", Toast.LENGTH_SHORT).show();
        }
    }

    private List<Question> getQuestionsForTopic(QuestionBank questionBank, String topicName) {
        switch (topicName) {
            case "Lịch sử":
                return questionBank.getLichsu();
            case "Địa lý":
                return questionBank.getDialy();
            case "Khoa học":
                return questionBank.getKhoahoc();
            case "Thể thao":
                return questionBank.getThethao();
            case "Tiếng anh":
                return questionBank.getTienganh();
            case "Toán học":
                return questionBank.getToanhoc();
            case "Nghệ thuật":
                return questionBank.getNghethuat();
            case "Văn học":
                return questionBank.getVanhoc();
            case "Môi trường":
                return questionBank.getMoitruong();
            default:
                return new ArrayList<>();
        }
    }
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("aa", radioGroupAnswers.getCheckedRadioButtonId());
        outState.putInt(currnetQuestion_story, currentQuestionIndex);
        ArrayList<Question> subList = new ArrayList<>(muoicauHoiNgauNhien.subList(0, muoicauHoiNgauNhien.size()));
        outState.putSerializable("KEY_QUESTION_LIST", (Serializable) subList);
    }
    }


