package org.launchcode.java.studios.funwithquizzes;

import java.util.ArrayList;

//stores info about the choices
public class Choice {
    //fields
    private String letter;
    private String text;
    private Boolean correctAnswer;


    //constructor

    public Choice(String letter, String text, Boolean correctAnswer) {
        this.letter = letter;
        this.text = text;
        this.correctAnswer = correctAnswer;
    }

    //getters - do not need setters because choice is not going to change after it has been instantiated

    public String getLetter() { return letter; }

    public String getText() { return text; }

    public Boolean getCorrectAnswer() { return correctAnswer; }

}
