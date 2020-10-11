package ru.geekbrains.Catch_the_drop;

public class employee {

    String fio;
    String position;
    String Email;
    String phoneNumber;
    int salary;
    int age;


    public int getAge() {
        return age;
    }
    public employee(String fio, String position, String Email, String phoneNumber, int salary, int age){
        this.fio =fio;
        this.position =position;
        this.Email =Email;
        this.phoneNumber =phoneNumber;
        this.salary =salary;
        this.age =age;
    }

    void info() {
        System.out.println("Имя: " + fio + "Должность: " + position + "Email: " + Email + "Номер телефона: " + phoneNumber
                + "Зарплата: " + salary + "Возраст " + age);
    }
}