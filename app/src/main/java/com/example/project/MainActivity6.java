package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.graphics.Color;
import android.widget.ListView;

import com.google.android.material.textfield.TextInputLayout;
import com.example.project.databinding.ActivityMain6Binding;

import java.util.ArrayList;
import java.util.List;
import android.widget.ArrayAdapter;
import android.widget.RadioButton;
import android.widget.Toast;
import java.util.Arrays;

public class MainActivity6 extends AppCompatActivity {
    private ActivityMain6Binding binding;
    private int dapan = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMain6Binding.inflate(getLayoutInflater());
        View viewview = binding.getRoot();
        setContentView(viewview);
        Intent intent = getIntent();
        String cauhoiDetail = intent.getStringExtra("name");
        int dokhoDetail = intent.getIntExtra("dokho",0);
        int dapan = intent.getIntExtra("dapan",0);
        String dokho ="Dễ";
        if(dokhoDetail==1){
            dokho="Khó";
            binding.btnkho.setBackgroundColor(Color.RED);
        }

            // Nhận mảng chuỗi String[] từ Intent
            String[] receivedStringArray = intent.getStringArrayExtra("option");
            // Trong Activity B, sau khi nhận danh sách từ Intent
            if (receivedStringArray != null) {
                List<String> receivedStringList = new ArrayList<>(Arrays.asList(receivedStringArray));
                for(int i =0; i<receivedStringList.size(); i++){
                    if(i==dapan){
                        binding.txtDapan.setText("Đáp án đúng là: " +receivedStringList.get(i));
                    }
                }
                // Tìm đến ListView trong layout của bạn
                ListView listView = findViewById(R.id.listFieldActivity);
                // Tạo một ArrayAdapter để hiển thị danh sách chuỗi trong ListView
                ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, receivedStringList);
                listView.setAdapter(adapter);

        }
        binding.btnkho.setText(dokho);
        binding.txtCauhoi.setText(cauhoiDetail);
    }
}