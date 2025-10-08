package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Task3 {

    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<>(Arrays.asList(
                new Employee("Зубенко Михаил Петрович", 74, "HR", 30_000.00),
                new Employee("Жмышенко Валерий Альбертович", 52, "PR", 70_000.00),
                new Employee("Обабков Илья Николаевич", 33, "IT", 100_000.00),
                new Employee("Шадрин Денис Борисович", 29, "IT", 130_000.00),
                new Employee("Городничев Илья Витальевич", 20, "IT", 50.33)
        ));

        ArrayList<Employee> filteredList = filterByAge(list, 30);
        writeArrayList(filteredList);

    }

    public static void writeArrayList(ArrayList<Employee> list) {
        System.out.println("\u001B[35mДАННЫЕ О СОТРУДНИКАХ\u001B[0m");
        System.out.println("\u001B[37m-------------------------------------\u001B[0m");
        for (Employee employee : list) {
            System.out.println("\u001B[36mПолное имя: \u001B[0m" + employee.getFullName());
            System.out.println("\u001B[36mВозраст: \u001B[0m" + employee.getAge());
            System.out.println("\u001B[36mОтдел: \u001B[0m" + employee.getDepartment());
            System.out.println("\u001B[36mЗарплата: \u001B[0m" + employee.getSalary() + "₽");
            System.out.println("\u001B[33m-------------------------------------\u001B[0m");
        }
    }

    public static ArrayList<Employee> filterByAge(ArrayList<Employee> list, Integer age) {
        return (ArrayList<Employee>)list.stream()
                .filter(e -> e.getAge() > age)
                .collect(Collectors.toList());
    }
}

class Employee {
    private String fullName;
    private Integer age;
    private String department;
    private Double salary;

    public Employee(String fullName, Integer age, String department, Double salary) {
        this.fullName = fullName;
        this.age = age;
        this.department = department;
        this.salary = salary;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Double getSalary() {
        return salary;
    }
}
