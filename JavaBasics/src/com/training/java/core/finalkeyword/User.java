package com.training.java.core.finalkeyword;

import java.util.ArrayList;
import java.util.List;

public class User {
    private static int uid;
    private static final List<User> users = new ArrayList<>();

    private int id;
    private String email;
    private String password;

    public User(String email, String password) {
        this.id = ++uid;
        this.email = email;
        this.password = password;
        users.add(this);
    }

    public final void authenticate() { // the method authenticate could not be overridden
        User authenticatedUser = users.stream()
                .filter(user -> user.email.equals(email))
                .filter(user -> user.password.equals(password))
                .findFirst().get();
        if (authenticatedUser != null) {
            System.out.println(authenticatedUser);
        } else {
            System.out.println("User not found!");
        }
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", email=" + email + ", password=" + password + "]";
    }

}