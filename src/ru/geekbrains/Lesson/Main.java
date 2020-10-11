package ru.geekbrains.Lesson;


public class Main {

    public static void main(String[] args) {
        //Написано с целью тренировки
        Employee employee = new Employee();
        employee.fullName = "F Yulia";
        employee.job = "Student";
        employee.email = "hello@mailbox.com";
        employee.phoneNumber = "+71234567";
        employee.salary = 100000;
        employee.yearOfBirth = 1984;
        System.out.print("Test 1");
        employee.information();
        System.out.print("Test 2");
        employee.setName("New Name", "New Job", "New email", "New Phone", 120000);
        employee.information();
        Employee employee2 = new Employee("F Yulia", "Student", "hello@mailbox.com", "+71234567", 100000, 1984);
        System.out.print("Test 3");
        employee2.information();
        System.out.println();

//        Создать массив из 5 сотрудников.
        System.out.println("The List of Employees");
        Employee[] employees = new Employee[5]; // Вначале объявляем массив объектов
        employees[0] = new Employee("Ivanov Ivan", "Engineer", "1@mailbox.com", "892312311", 30000, 1990);
        employees[1] = new Employee("Petrov Petr", "Doctor", "2@mailbox.com", "892312312", 40000, 2002);
        employees[2] = new Employee("Sidorov Sergey", "Lawer", "3@mailbox.com", "892312313", 50000, 1972);
        employees[3] = new Employee("Nikolaev Nikolay", "Economist", "4@mailbox.com", "892312314", 30000, 1996);
        employees[4] = new Employee("Vasilyev Vasily", "Manager", "5@mailbox.com", "892312315", 50000, 1955);

        for (int i = 0; i < employees.length; i++) {
            employees[i].information();
        }
        System.out.println();

        //4. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.
        System.out.println("Employees Over Forty");
        for (int i = 0; i < employees.length; i++) {
            employees[i].fortyPlus();
        }

    }

}
