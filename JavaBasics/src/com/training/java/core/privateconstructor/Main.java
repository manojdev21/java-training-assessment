package com.training.java.core.privateconstructor;

public class Main {

    public static void main(String[] args) {
        Adder adder = Adder.getAdder(); // accessing the object of Adder from static method

        int sum = adder.addAll(1, 2, 3, 4, 5);
        System.out.println(sum);
    }

}
