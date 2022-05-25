package com.training.java.core.convertion;

public class NumberConvertion {

    public static void main(String[] args) {
        // convert float to integer
        float variableA = 5.5f;
        int convertedInteger = Float.valueOf(variableA).intValue();

        // convert float to double
        float variableB = 3.16f;
        double convertedDouble = Float.valueOf(variableB).doubleValue();

        System.out.println("Float value: " + variableA + ", Converted integer: " + convertedInteger);
        System.out.println("Float value: " + variableB + ", Converted double: " + convertedDouble);

    }

}
