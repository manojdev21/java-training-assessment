package com.training.java.core.stringcopyconcat;

public class StringConcat {

    public static void main(String[] args) {
        String stringA = "Hello";
        String stringB = "World!";

        // concat using + operator
        String concatStringUsingOperator = stringA + stringB; // this converts the null to string
        System.out.println("Using + operator: " + concatStringUsingOperator);

        // concat using "concat" method
        String concatStringUsingMethod = stringA.concat(stringB); // this throws NullPointerException if stringA is null
        System.out.println("Using \"concat\" method: " + concatStringUsingMethod);
    }

}
