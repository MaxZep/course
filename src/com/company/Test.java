package com.company;

public class Test {//
    private String question;
    private String answer;
    private String answer1;
    private String answer2;
    private String answer3;
    private int rightAnswer;
    private Test nextTest;
    private int ratingQuestion;

    public int getRatingQuestion() {
        return ratingQuestion;
    }

    public void setRatingQuestion(int ratingQuestion) {
        this.ratingQuestion = ratingQuestion;
    }

    public void setRightAnswer(int rightAnswer) {
        this.rightAnswer = rightAnswer;
    }

    public int getRightAnswer() {
        return rightAnswer;
    }

    public String getAnswer1() {
        return answer1;
    }

    public void setAnswer1(String answer1) {
        this.answer1 = answer1;
    }

    public String getAnswer2() {
        return answer2;
    }

    public void setAnswer2(String answer2) {
        this.answer2 = answer2;
    }

    public String getAnswer3() {
        return answer3;
    }

    public void setAnswer3(String answer3) {
        this.answer3 = answer3;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {

        this.answer = answer;
    }

    public Test(int rightAnswer) {
        this.rightAnswer = rightAnswer;
    }

    public Test() {
        question = null;
        answer = null;
        answer1 = null;
        answer2 = null;
        answer3 = null;
    }

    public Test(String question, String answer, String answer1, String answer2, String answer3, int rightAnswer, int ratingQuestion) {
        this.question = question;
        this.answer = answer;
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.answer3 = answer3;
        this.rightAnswer = rightAnswer;
        this.ratingQuestion = ratingQuestion;
    }

    public Test(String question, String answer, Test nextTest) {
        this.question = question;
        this.answer = answer;
        this.nextTest = nextTest;
    }


    public Test getNextTest() {
        return nextTest;
    }

    public void setNextTest(Test nextTest) {
        this.nextTest = nextTest;
    }
}
