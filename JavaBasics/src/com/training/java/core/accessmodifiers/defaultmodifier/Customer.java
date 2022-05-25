package com.training.java.core.accessmodifiers.defaultmodifier;

import java.time.LocalDateTime;

public class Customer {
    private long customerId;
    private String name;
    private LocalDateTime lastLogin;

    public Customer(long customerId, String name, LocalDateTime lastLogin) {
        this.customerId = customerId;
        this.name = name;
        this.lastLogin = lastLogin;
    }

 // this method(default method) is package protected means cannot be accessed outside the package
    void printCustomer() {
        System.out.println("Customer Details:");
        System.out.println("Customer ID: " + customerId);
        System.out.println("Customer Name: " + name);
        System.out.println("Customer Last Login Time: " + lastLogin);
    }

}
