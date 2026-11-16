package com.example;

import java.util.ArrayList;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<>(List.of(
                new Employee("Жмышенко Валерий", 30, "IT", 100_000.0),
                new Employee("Зубенко Михаил", 19, "HR", 80_000.0),
                new Employee("Обабков Илья", 50, "IT", 1_000_000.0),
                new Employee("Новиков Максим", 25, "IT", 120_000.0),
                new Employee("Лещенко Лев", 61, "HR", 200_000.0)
                ));

        list.stream()
                .filter(emp -> emp.getAge() > 30)
                .forEach(emp -> System.out.println(emp.getFullName()));
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

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}
