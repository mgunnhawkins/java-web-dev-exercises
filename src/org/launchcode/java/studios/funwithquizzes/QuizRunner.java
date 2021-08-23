package org.launchcode.java.studios.funwithquizzes;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class QuizRunner {

    public static void main(String[] args) {
        //instantiate a new quiz
        //hard code quiz questions here
        Quiz quiz = new Quiz();

        //question 1
        Choice choice1 = new Choice("A", "green", false);
        Choice choice2 = new Choice("B", "blue", true);
        Choice choice3 = new Choice("C", "purple", false);
        Choice choice4 = new Choice("D", "orange", true);
        Choice[] choices = {choice1, choice2, choice3, choice4};

        quiz.addQuestion("What color is the sky?", choices, "multiple choice");


    }

}
