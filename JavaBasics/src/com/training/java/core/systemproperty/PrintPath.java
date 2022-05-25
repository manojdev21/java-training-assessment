package com.training.java.core.systemproperty;

public class PrintPath {

    public static void main(String[] args) {

        // Prints all the properties
        System.out.println(System.getProperties() + "\n");

        // Prints the current working directory
        System.out.println(System.getProperty("user.dir"));
    }
}
