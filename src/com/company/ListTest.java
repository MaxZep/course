package com.company;


import java.util.Scanner;

public class ListTest {
    public ListTest() {
    }

    public Test head;

    public ListTest(Test head) {
        this.head = head;
    }

    public void setRight(int right) {
        this.right = right;
    }

    public int getWrong() {
        return wrong;
    }

    public void setWrong(int wrong) {
        this.wrong = wrong;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getRight() {
        return right;
    }

    private int right = 0;
    private int wrong = 0;
    private int count = 0;
    private int ratingQuestion = 0;
    private int qustionNumber=1;

    public int getRatingQuestion() {
        return ratingQuestion;
    }

    public void setRatingQuestion(int ratingQuestion) {
        this.ratingQuestion = ratingQuestion;
    }

    public void printListTest() {//вывод вопросов
        Test testTmp = this.head;
        Scanner sc = new Scanner(System.in);
        while (testTmp != null) {
            System.out.println("Вопрос " + qustionNumber + ":" + "\n" + testTmp.getQuestion() + "\n" + "\n" + "Варианты ответов: " +
                    "\n" + testTmp.getAnswer() + "\n" + testTmp.getAnswer1() + "\n" + testTmp.getAnswer2() + "\n" +
                    testTmp.getAnswer3() + "\n" + "\n" + "Укажите номер вашего ответа:" + "\n");
            int answNumbr = sc.nextInt();
            if (testTmp.getRightAnswer() == answNumbr) {
                System.out.println("Это правильный ответ" + "\n");
                right++;
            } else {
                System.out.println("Ответ неверный" + "\n");
                wrong++;
            }
            testTmp = testTmp.getNextTest();
            qustionNumber++;
            count++;
        }
    }
    public void delTest(int index) {
        if (index == 0) {
            this.head = this.head.getNextTest();
        } else {
            Test nodeTmp = this.head;
            for (int i = 0; i < index - 1 && nodeTmp.getNextTest().getNextTest() != null; i++) {
                nodeTmp = nodeTmp.getNextTest();
            }
            nodeTmp.setNextTest(nodeTmp.getNextTest().getNextTest());
        }

    }
    public void printRatingQustions() {//вывод вопросов
        Test testTmp = this.head;
        while (testTmp != null) {
            System.out.println("Вопрос " + qustionNumber + ":" + "\n" + testTmp.getQuestion() +"\n"+ "рейтинг вопроса " + ratingQuestion+"\n");
            testTmp = testTmp.getNextTest();
        }

    }

}