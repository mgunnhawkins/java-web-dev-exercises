package org.launchcode.java.studios.funwithquizzes;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


//collects user info and grades it
public class MultipleChoiceQuestion extends Question {
    //fields- data types
    private Choice choices[] = new Choice[4]; //only will have 4 choices
    private String userAnswer;


    //constructor

    public MultipleChoiceQuestion(String prompt, Choice[] choices)
    {   super(prompt);
        this.choices = choices;
    }

    public void display(){
        System.out.println(getPrompt());
        for(int i = 0; i< choices.length; i++){
            System.out.println(choices[i].getLetter() + ": " + choices[i].getText());
        }
    }
}

    //methods
    //create question
    //display choices
    //ask user for answer
    //put answer somewhere

    //check for correct answer




    //if computer answer equals user answer then correct answer is true.  Let user know their answer is correct.   If
    // false let them know their answer is incorrect.





