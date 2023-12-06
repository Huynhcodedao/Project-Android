package com.example.project;
import java.util.List;
import java.io.Serializable;
public class Question implements Serializable {
    private  int ID;
    private String questionText;
    private List<String> options;
    private int correctOptionIndex;
    private int dokho;

    public Question(int ID,String questionText, List<String> options, int correctOptionIndex, int  dokho) {
        this.ID = ID;
        this.questionText = questionText;
        this.options = options;
        this.correctOptionIndex = correctOptionIndex;
        this.dokho = dokho;
    }

    public String getQuestionText() {
        return questionText;
    }

    public List<String> getOptions() {
        return options;
    }

    public int getCorrectOptionIndex() {
        return correctOptionIndex;
    }

    public int getDokho() {
        return dokho;
    }
    public int getID() {return ID ;  }
}
