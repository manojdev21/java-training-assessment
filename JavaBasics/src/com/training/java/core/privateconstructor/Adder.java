package com.training.java.core.privateconstructor;

public class Adder {
    private static Adder adder;

    public int addAll(int... values) {
        int sum = 0;
        for (int value : values) {
            sum += value;
        }

        return sum;
    }

    public static Adder getAdder() {
        if (adder != null) {
            return adder;
        }
        adder = new Adder();
        return adder;
    }

}
