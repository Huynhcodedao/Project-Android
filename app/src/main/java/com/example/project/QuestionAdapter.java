package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class QuestionAdapter extends BaseAdapter {

    private List<Question> listQuestion;

    public QuestionAdapter(List<Question> listQuestion) {
        this.listQuestion = listQuestion;

    }

    @Override
    public int getCount() {
        return listQuestion.size();
    }

    @Override
    public Object getItem(int i) {
        //i la so thu tu cau item trong danh sach
        return listQuestion.get(i) ;
    }

    @Override
    public long getItemId(int i) {
        return listQuestion.get(i).getID();
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View viewItem;

        if (view == null)
            viewItem = View.inflate(viewGroup.getContext(), R.layout.layout_listview, null);
        else
            viewItem = view;
        Question product = listQuestion.get(i);
        //Cau hoir
        ((TextView) viewItem.findViewById(R.id.field_name1)).setText(product.getQuestionText());
        //thu tuwj
        ((TextView) viewItem.findViewById(R.id.thutu)).setText(String.valueOf(product.getID()));

        return viewItem;
    }
}