package org.launchcode.java.studios.funwithquizzes;

import java.util.ArrayList;

public class Quiz {
    //fields- data types
    private ArrayList<Question> questions = new ArrayList<>();


    //getter

    public ArrayList<Question> getQuestions() {
        System.out.println(questions);
        return questions;
    }

    //methtods
    public void addQuestion(String prompt, Choice[] choices, String type){
        if(type == "multiple choice"){
            MultipleChoiceQuestion multipleChoiceQuestion = new MultipleChoiceQuestion(prompt, choices);
            questions.add(multipleChoiceQuestion);
        }
    }

    public void runQuiz(){
        for(Question question:questions){
            //Display question
            //question.display();
            //collect input
            //scpre
        }
    }


}




