package com.example.project;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.Toast;
import android.content.Intent;
import android.widget.TextView;
import java.io.Serializable;
import java.util.ArrayList;
import android.adservices.topics.Topic;

import com.example.project.databinding.ActivityMain2Binding;
import com.example.project.databinding.ActivityMain4Binding;

public class MainActivity2 extends AppCompatActivity {
    private QuestionBank questionBank;
    private int check=0;
    private ArrayList<Field> list;
    private ActivityMain2Binding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMain2Binding.inflate(getLayoutInflater());
        View viewview = binding.getRoot();
        setContentView(viewview);
        questionBank = new QuestionBank();
        list = new ArrayList<>();
        list. add(new Field("Địa lý",1,R.drawable.dialy,"Các câu hỏi về các vùng đất, địa hình, dân cư và các hiện tượng trên Trái Đất."));
        list. add(new Field("Môi trường",2,R.drawable.moitruong,"Thảo luận về tình hình biến đổi khí hậu, nguyên nhân và tác động của nó đối với hệ sinh thái và cuộc sống con người."));
        list. add(new Field("Khoa học",2,R.drawable.khoahoc,"Các câu hỏi về những định luật, cấu trúc và cách vận hành của thế giới tự nhiên."));
        list. add(new Field("Nghệ thuật",2,R.drawable.nghethuat,"Nói về các phong cách và kỹ thuật nghệ thuật khác nhau, cũng như cách các nghệ sĩ sử dụng chúng để diễn đạt ý tưởng và cảm xúc."));
        list. add(new Field("Thể thao",2,R.drawable.thethao,"Thảo luận về lợi ích của hoạt động thể thao đối với sức khỏe tinh thần và thể chất của con người."));
        list. add(new Field("Văn học",2,R.drawable.vanhoc,"Nghiên cứu về cách văn học thể hiện tư duy và trải nghiệm con người qua các nhân vật và câu chuyện."));
        list. add(new Field("Toán học",2,R.drawable.toanhoc,"Các câu hỏi về sự kiện liên quan đến con người."));
        list. add(new Field("Tiếng anh",2,R.drawable.tienganh,"Các câu hỏi về sự kiện liên quan đến con người."));
        list. add(new Field("Lịch sử",2,R.drawable.llichsu,"Các câu hỏi về sự kiện liên quan đến con người."));
        Switch s2 = findViewById(R.id.switchKho);
        s2.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if(isChecked){
                check=1;
            }else {
                check = 0;
            }
        });
        AdapterField adapter = new AdapterField(list,questionBank);
        binding.listFieldActivity.setAdapter(adapter);
        binding.listFieldActivity.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id){
                Field product =(Field) adapter.getItem(position);
                Field selectedTopic = list.get(position);
                Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
                intent.putExtra("topicName", selectedTopic.topic);
                intent.putExtra("questionBank", questionBank);
                intent.putExtra("check", check);
                startActivity(intent);
                Toast.makeText(MainActivity2.this,product.topic, Toast.LENGTH_SHORT).show();
            }
        });
        int diemSoHienTai = ManagerPoint.getDiemSo(this);

        // Hiển thị điểm số trong TextView hoặc nơi khác tùy thuộc vào giao diện của bạn
        TextView textViewDiemSo = findViewById(R.id.textView);
        textViewDiemSo.setText("Total Score " + diemSoHienTai+" pts");
        binding.btnDanhsach.setOnClickListener(view->{
            Intent intent1 = new Intent(MainActivity2.this,MainActivity5.class);
            startActivity(intent1);
        });
    }
}