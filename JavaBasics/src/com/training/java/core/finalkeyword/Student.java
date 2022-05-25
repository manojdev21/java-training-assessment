package com.training.java.core.finalkeyword;

public final class Student extends User { // the class Student can't be inherited by other classes
    private final int registerNumber; // the value of the property can't be changed once object is created
    private String name;
    private String department;

    public Student(int registerNo, String name, String department, String email, String password) {
        super(email, password);
        this.registerNumber = registerNo;
        this.name = name;
        this.department = department;
    }

    public void printStudent() {
        System.out.println("Student's details:");
        System.out.println("register number: " + registerNumber);
        System.out.println("name: " + name);
        System.out.println("department: " + department);
    }

    public static void main(String[] args) {
        Student manoj = new Student(7113, "Manoj S", "ECE", "manoj@gmail.com", "12345");
        Student jeff = new Student(7110, "Jeff", "IT", "jeff@gmail.com", "jeff234");

        manoj.printStudent();
        jeff.printStudent();
        jeff.authenticate();
    }

}
