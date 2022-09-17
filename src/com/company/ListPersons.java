package com.company;


import java.util.Scanner;

public class ListPersons {
    private int choiceAdmin;

    public int getChoiceAdmin() {
        return choiceAdmin;
    }

    public void setChoiceAdmin(int choiceAdmin) {
        this.choiceAdmin = choiceAdmin;
    }

    public Person head;
    //ListTest listTest=new ListTest();
    //int wrong=listTest.getWrong();

    public ListPersons() {
        this.head = null;
    }

    public ListPersons(Person head) {
        this.head = head;
    }

//    public Person getHead() {
//        return head;
//    }
//
//    public void setHead(Person head) {
//        this.head = head;
//    }

//    public void push(String userName, String password) {
//        Person nodeTmp = this.head;
//        while (nodeTmp.getNextPerson() != null) {
//            nodeTmp = nodeTmp.getNextPerson();
//        }
//        nodeTmp = new Person(userName, password);
//    }


    public void pushHead(String userName, String password, int wrong) {
        Person person = new Person(userName, password, wrong, this.head);
        this.head = person;
    }

    public void refresh(String userName, String password, int wrong) {
        Person person = new Person(userName, password, wrong, this.head);
        this.head = person;
    }

    public void printList(ListTest listTest) {
       Person user = this.head;
       // while (personTmp != null) {
            System.out.println(user.getUserName()+", из "+ listTest.getCount()+" вопросов " + "Вы дали "+ listTest.getRight()+"правильных ответов и " + listTest.getWrong() + " неверных ответов"+"\n");//вывести на экран переменную из временной переменной
            //personTmp = personTmp.getNextPerson();
        }

    public void printRatingUser(ListTest listTest) {
        Person personTmp01 = this.head;
        while (personTmp01 != null) {
            System.out.println(personTmp01.getUserName() + ", из " + listTest.getCount() + " вопросов " + " дал " + listTest.getRight() + " правильных ответов и " + listTest.getWrong() + " неверных ответов" + "\n");//вывести на экран переменную из временной переменной
            personTmp01 = personTmp01.getNextPerson();
        }
    }

        public void verification (User user){
            Person personTmp03 = this.head;
            int check = 0;
            int index = 0;//количество пользователей
            while (personTmp03 != null) {
                index++;
                personTmp03 = personTmp03.getNextPerson();
            }

            personTmp03 = this.head;
            while (personTmp03 != null) {
                Scanner sc = new Scanner(System.in);
                if (user.getUser().equals("admin") & user.getPass().equals("admin")) {
                    System.out.println("\n" +"Вы вошли как администратор, выберите действие:" + "\n" + "1. Посмотреть статистику вопросов" + "\n" + "2. Добавить новый вопрос," + "\n" +
                             "3. Удалить вопрос" + "\n" + "4.Просмотреть статистику пользователей."+ "\n");
                    choiceAdmin = sc.nextInt();
                    break;
                }
                personTmp03 = personTmp03.getNextPerson();
            }

            personTmp03 = this.head;
            while (personTmp03 != null) {
                if (personTmp03.getUserName().equals(user.getUser()) & personTmp03.getPassword().equals(user.getPass())) {
                    System.out.println("\n" + "Приветствую " + user.getUser() + ". В тесте указан вопрос и четыре варианта ответа, для ответа на вопрос укажите цифру ответа нажмите Enter и перейдите к следующему вопросу" + "\n");
                    check++;
                    break;
                }
                check++;
                personTmp03 = personTmp03.getNextPerson();
            }

            if (check == index) {
                System.out.println("Вы ввели неправильный пароль или логин" + "\n");
            }
        }
    }


