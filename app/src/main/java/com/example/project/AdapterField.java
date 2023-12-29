package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class AdapterField extends BaseAdapter {

    private ArrayList<Field> listField;
    private QuestionBank questionBank;
    public AdapterField(ArrayList<Field> listField, QuestionBank questionBank) {
        this.listField = listField;
        this.questionBank = questionBank;
    }

    @Override
    public int getCount() {
        return listField.size();
    }

    @Override
    public Object getItem(int i) {
        //i la so thu tu cau item trong danh sach
        return listField.get(i) ;
    }

    @Override
    public long getItemId(int i) {
        return listField.get(i).ID;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View viewItem;
        if (view == null)
            viewItem = View.inflate(viewGroup.getContext(), R.layout.field_view, null);
        else
            viewItem = view;
        Field product = listField.get(i);
        //Ten linh vuc
        ((TextView) viewItem.findViewById(R.id.field_name)).setText(product.topic);
        //Anh cua linh vuc
        ((ImageView) viewItem.findViewById(R.id.field_image)).setImageResource(product.image);
        //Noi dung chi tiet tung linh vuc
        ((TextView) viewItem.findViewById(R.id.detail)).setText(String.format("Mô tả: %s", product.field_detail));
        return viewItem;
    }
}