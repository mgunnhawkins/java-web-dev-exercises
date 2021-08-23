package org.launchcode.java.studios.funwithquizzes;



//BASE CLASS
public class Question {
    //fields
    //private String questionType;
    private String prompt;
    private Boolean correct;

    //constructor
    public Question(String prompt){
        this.prompt = prompt;
        this.correct = false;
    }

    //getters and setters

    public String getPrompt() { return prompt; }

    public void setPrompt(String prompt) { this.prompt = prompt; }

    public Boolean isCorrect(){ return correct;} //changed naming of getter for readability

    public void setCorrect(Boolean answerCorrect) { this.correct = answerCorrect; }





}
