package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.content.SharedPreferences;
import android.widget.Toast;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import com.example.project.databinding.ActivityMain4Binding;

public class MainActivity4 extends AppCompatActivity {
    private ActivityMain4Binding binding;
    private String topicName;
    private int check;
    QuestionBank questionBank;
    private ManagerPoint ManagerPoint;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMain4Binding.inflate(getLayoutInflater());
        View viewview = binding.getRoot();
        setContentView(viewview);
        Intent intent = getIntent();
        topicName = intent.getStringExtra("topicName3to4");
        check = intent.getIntExtra("check3to4", 0);
        questionBank = (QuestionBank) intent.getSerializableExtra("questionBank3to4");
        int countCorect = intent.getIntExtra("count", 0);
        TextView diem = findViewById(R.id.textView6);
        diem.setText(String.valueOf(countCorect));
        //Xu ly su kien hoan thanh
        binding.button3.setOnClickListener(view->{
            Intent intent1 = new Intent(MainActivity4.this, MainActivity.class);
            startActivity(intent1);
            finish();
        });
        binding.button4.setOnClickListener(view->{
            Intent intent2 = new Intent(MainActivity4.this, MainActivity3.class);
            intent2.putExtra("topicName", topicName);
            intent2.putExtra("questionBank", questionBank);
            intent2.putExtra("check", check);
            startActivity(intent2);
            finish();
        });
        binding.button5.setOnClickListener(view->{
            Intent sendIntent = new Intent(Intent.ACTION_SEND);
            sendIntent.setType("text/plain");
            String subject = "Chia sẻ Điểm Số";
            String body = "Tôi đã đạt được " + countCorect;
            sendIntent.putExtra(Intent.EXTRA_SUBJECT, subject);
            sendIntent.putExtra(Intent.EXTRA_TEXT, body);
            if (sendIntent.resolveActivity(getPackageManager()) != null) {
                startActivity(Intent.createChooser(sendIntent, "Chia sẻ điểm số với"));
            } else {
                Toast.makeText(MainActivity4.this, "Không tìm thấy ứng dụng để chia sẻ", Toast.LENGTH_SHORT).show();
            }
        });
        ManagerPoint.capNhatDiemSo(this, countCorect);
    }
}