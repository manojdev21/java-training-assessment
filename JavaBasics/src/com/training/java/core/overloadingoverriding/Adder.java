package com.training.java.core.overloadingoverriding;

public class Adder {
    private int sum;

    public int increment() {
        sum++;
        System.out.println("Adder: " + sum);
        return sum;
    }

    public int increment(int incrementBy) { // overloading
        sum += incrementBy;
        System.out.println("Adder: " + sum);
        return sum;
    }

}
