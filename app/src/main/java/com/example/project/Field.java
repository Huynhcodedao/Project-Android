package com.example.project;

public class Field {
    public String topic;
    public int ID;
    public int image;
    public String field_detail;


    public Field(String topic, int ID,int image, String field_detail) {
        this.ID = ID;
        this.topic = topic;
        this.field_detail = field_detail;
        this.image = image;
    }

}