package ru.geekbrains.Lesson;

//1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
public class Employee {
    String fullName;
    String job;
    String email;
    String phoneNumber;
    int salary;
    int yearOfBirth;

//2. Конструктор класса должен заполнять эти поля при создании объекта.
    public Employee (String fullName, String job, String email, String phoneNumber, int salary, int yearOfBirth) {
        this.fullName = fullName;
        this.job = job;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.yearOfBirth = yearOfBirth;

    }
    public Employee () {

    }
    //3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
    void information() {
            System.out.println("\tFull Name:" + fullName + "\tJob:" + job + "\temail:" + email +
                    "\tPhone Number:" + phoneNumber + "\tSalary:" + salary + "\tAge:" + this.getAge());
    }

    //4. Создать массив из 5 сотрудников - в Main.

    //5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.
    void fortyPlus() {
        if (this.getAge() > 40) {
            System.out.println("\t" + fullName + " - " + this.getAge());
        }
    }

    //Написано с целью тренировки
    int getAge () {
        final int currentYear = 2020;
        return (currentYear - yearOfBirth);
    }
    void setName(String fullName, String job, String email, String phoneNumber, int salary) {
        this.fullName = fullName;
        this.job = job;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
    }
}




