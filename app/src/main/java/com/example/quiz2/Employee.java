package com.example.quiz2;

public class Employee {

    private String name;
    private double salary;
    private String type;

    public Employee(String name, double salary, String type){
        this.name = name;
        this.salary = salary;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }



}
