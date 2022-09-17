package com.company;

import java.util.Scanner;

public class Programm {
    private static int finalChoise=1;

    public static void main(String[] args) {

        while (finalChoise == 1) {
            ListTest listTestPerson = new ListTest();
            Test test = new Test();

            Person testUser3 = new Person("testUser1", "123", listTestPerson.getWrong(), listTestPerson.getRight(), listTestPerson.getCount(), 4);//добавлянм существующих пользователей
            Person testUser2 = new Person("testUser2", "12", listTestPerson.getWrong(), listTestPerson.getRight(), listTestPerson.getCount(), 3);//добавлянм существующих пользователей
            Person testUser1 = new Person("testUser1", "1", listTestPerson.getWrong(), listTestPerson.getRight(), listTestPerson.getCount(), 2);//добавлянм существующих пользователей
            Person admin = new Person("admin", "admin", listTestPerson.getWrong(), listTestPerson.getRight(), listTestPerson.getCount(), 1);//добавлянм существующих пользователей

            admin.setNextPerson(testUser1);//Устанав
            testUser1.setNextPerson(testUser2);
            testUser2.setNextPerson(testUser3);

            Test test0 = new Test("Сколько цветов у светофора?", "1.три", "2.два", "3.один", "4.не горит", 1, test.getRatingQuestion());
            Test test1 = new Test("На какой цвет можно переходить дорогу?", "1.На зеленый", "2.На красный", "3.На синий", "4.на желтый", 1, test.getRatingQuestion());
            Test test2 = new Test("На какой цвет нельзя переходить дорогу", "1.На красный", "2.На зеленый", "3.Ждать когда светофор перестанет светиться разными цветами", "4.На желтый", 1, test.getRatingQuestion());
            Test test3 = new Test("Какой формы предупреждающие знаки?", "1.Треугольные", "2.Куруглые", "3.Квадратные", "4.Восьмигранные", 1, test.getRatingQuestion());

            test0.setNextTest(test1);
            test1.setNextTest(test2);
            test2.setNextTest(test3);

            System.out.print("Чтобы приступить к тестированию нажмите" + "\n" + "1 для того чтобы зарегистрироваться" + "\n" + "2 чтобы авторизоваться."
                    + "\n" + "3 чтобы зайти под администратором");
            System.out.println();
            Scanner in = new Scanner(System.in);
            int choice = in.nextInt();//выбор действий вход или регистрация
            if (choice != 2 & choice != 1 & choice != 3) {
                System.out.println("Вы выбрали несуществующее дейстие");
            }
            ListTest listTest = new ListTest(test0);
            ListPersons listPersons = new ListPersons(admin);
            if (choice == 1) {
                System.out.println("Введите ваше имя на русском языке");
                String newUserName = in.next();
                System.out.println("Введите пароль, состоящий из пяти символов");
                String newPassword = in.next();
                listTest.printListTest();
                listPersons.pushHead(newUserName, newPassword, listTest.getWrong());
                listPersons.printList(listTest);
            }

            if (choice == 2) {
                System.out.println("Введите ваше имя на русском языке");
                String userName = in.next();
                System.out.println("Введите пароль, состоящий из пяти символов");
                String password = in.next();
                User user = new User(userName, password);
                listPersons.verification(user);
                listTest.printListTest();
                listPersons.refresh(userName, password, listTest.getWrong());
                listPersons.printList(listTest);
            }
            if (choice == 3) {
                System.out.println("Введите ваше имя на русском языке");
                String userName = in.next();
                System.out.println("Введите пароль, состоящий из пяти символов");
                String password = in.next();
                User user = new User(userName, password);
                listPersons.verification(user);

                if (listPersons.getChoiceAdmin() == 1) {
                    System.out.println("Рейтинг вопросов:" + "\n");
                    listTest.printRatingQustions();

                }
                if (listPersons.getChoiceAdmin() == 2) {
                    System.out.println("Введите новый вопрос:" + "\n");
                    // добавить новый вопрос

                }
                if (listPersons.getChoiceAdmin() == 3) {
                    System.out.println("Укажите номер вопроса для удаления" + "\n");
                    int indexDel=in.nextInt();
                    listTest.delTest(indexDel);

                }
                if (listPersons.getChoiceAdmin() == 4) {
                    System.out.println("Рейтинг пользователей:" + "\n");
                    listPersons.printRatingUser(listTest);

                }
            }
            Scanner sc = new Scanner(System.in);
            System.out.println("Выберите дальнейшее действие:" + "\n" + "1 Повторить тестирование" + "\n" + "2 Закончить тестирование" + "\n");
            finalChoise = sc.nextInt();
        }
        System.out.println("Тест окончен");
    }


}