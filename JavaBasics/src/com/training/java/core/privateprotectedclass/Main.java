package com.training.java.core.privateprotectedclass;

public class Main {

    public static void main(String[] args) {

        // Example for private class
        System.out.println("\n------ Example of Private Class------\n");

        Student manoj = new Student(21, "Manoj.S");
        manoj.printLaptops();

        manoj.addNewLaptop("Lenovo", 4, "500GB");
        manoj.addNewLaptop("HP", 2, "1TB");

        manoj.printLaptops();

        // Example for protected class
        System.out.println("\n------ Example of Protected Class------\n");

        Employee jay = new Employee(200, "Jay", "Web Product", "Software Developer");
        System.out.println(jay);

        User john = new User(411, "John");
        System.out.println(john);

        jay.updateProfile("jay@gmail.com", "78887888", "India");
        System.out.println(jay);
    }

}
