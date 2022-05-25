package com.training.java.core.staticmethod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class User {
    private static List<User> users = new ArrayList<>();
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
        users.add(this);
    }

    public static void loadUsers() { // static method
        Arrays.asList(
            new User("John", 12),
            new User("Mary", 23),
            new User("Henry", 44),
            new User("Harry", 24)
        );
    }

    public static void printUserList() { // static method
        if (users.size() == 0) {
            System.out.println("No users found!");
            return;
        }
        users.forEach(System.out::println);
    }

    @Override
    public String toString() {
        return "User [name=" + name + ", age=" + age + "]";
    }

    public static void main(String[] args) {
        System.out.println("Before loading users");
        User.printUserList(); // calling the function with class name

        User.loadUsers();
        new User("Tom", 34);

        System.out.println("After loading users");
        User.printUserList();
    }

}
