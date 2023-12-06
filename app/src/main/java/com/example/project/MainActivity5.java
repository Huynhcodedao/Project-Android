package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.android.material.textfield.TextInputLayout;
import com.example.project.databinding.ActivityMain5Binding;

import java.util.ArrayList;
import java.util.List;
import android.widget.AutoCompleteTextView;
import android.widget.Toast;
public class MainActivity5 extends AppCompatActivity {

    private ActivityMain5Binding binding;

    private QuestionBank questionBank;
    private List<Question> questions;
    private String topicName ="all";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMain5Binding.inflate(getLayoutInflater());
        View viewview = binding.getRoot();
        setContentView(viewview);
        TextInputLayout textInputLayout = findViewById(R.id.textField);


        AutoCompleteTextView autoCompleteTextView = findViewById(R.id.select);
        QuestionBank questionBank = new QuestionBank();
        questions = getQuestionsForTopic(questionBank, topicName);
        QuestionAdapter adapter = new QuestionAdapter(questions);
        //hien thị tất cả ccâu hỏi lên listView
        binding.listField.setAdapter(adapter);
        //Hiển thị câu hỏi theo chủ đề
        String[] suggestedItems = getResources().getStringArray(R.array.array_chose);
        ArrayAdapter<String> adapter1 = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, suggestedItems);
        autoCompleteTextView.setAdapter(adapter1);
        autoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    topicName = (String) parent.getItemAtPosition(position);
                    questions = getQuestionsForTopic(questionBank, topicName);
                    QuestionAdapter adapter = new QuestionAdapter(questions);
                    binding.listField.setAdapter(adapter);
                    Toast.makeText(MainActivity5.this, "Các câu hỏi chủ đề " + topicName, Toast.LENGTH_SHORT).show();
            }
        });
        //Chọn detail cau hoi
        ListView listView = findViewById(R.id.listField);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id){
                Question product =(Question) adapter.getItem(position);
                Intent intent = new Intent(MainActivity5.this, MainActivity6.class);
                intent.putExtra("name",questions.get(position).getQuestionText());
                intent.putExtra("dokho",questions.get(position).getDokho());
                intent.putExtra("dapan",questions.get(position).getCorrectOptionIndex());
                String[] stringArray = questions.get(position).getOptions().toArray(new String[0]);
                intent.putExtra("option",stringArray);
                startActivity(intent);
            }
        });
    }
    private List<Question> getQuestionsForTopic(QuestionBank questionBank, String topicName) {
        switch (topicName) {
            case "all":
                return questionBank.getAll();
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
    }
