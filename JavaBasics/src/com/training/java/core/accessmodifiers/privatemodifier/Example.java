package com.training.java.core.accessmodifiers.privatemodifier;

public class Example {

    // private method, to separate common functionality or reusable code
    private boolean checkEmailValid(String email) {
        return "example@gmail.com".equals(email) ? true : false;
    }

    public void addNewUser(String name, String email) {
        if (!checkEmailValid(email)) {
            throw new IllegalStateException("Could not create user, email already exists!");
        }
        System.out.println("New user " + name + " added to the database.");
    }

}
