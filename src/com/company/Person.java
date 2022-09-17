package com.company;


public class Person {
    ListTest listTest = new ListTest();

    public void setPassword(String password) {
        this.password = password;
    }


    public String getPassword() {
        return password;//newPassword
    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {

    }
    private String userName;
    private String password;
    private Person nextPerson;
    private int wrong;
    private int right;
    private int count;
    private int rating;

    public Person() {
        userName = null;
        password = null;
        nextPerson = null;
        wrong = 0;
        right = 0;
        count = 0;
    }
    public Person(String userName, String password, int wrong, int right, int count, int rating) {
        this.userName = userName;
        this.password = password;
        this.wrong = wrong;
        this.right = right;
        this.count = count;
        this.rating = rating;
    }
    public Person(String userName, String password, int wrong, Person nextPerson) {

        this.userName = userName;
        this.password = password;
        this.wrong = wrong;
        this.nextPerson = nextPerson;
    }

    public Person(String userName, String password, Person nextPerson) {

        this.userName = userName;
        this.password = password;
        this.nextPerson = nextPerson;
    }


    public Person getNextPerson() {
        return this.nextPerson;
    }

    public void setNextPerson(Person nextPerson) {
        this.nextPerson = nextPerson;
    }

}
