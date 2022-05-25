package com.training.java.core.localandinstancevariable;

public class Calculator {
    private int result; // instance variable, can be accessed throughout the instance

    private int sumAll(int... values) {
        int sum = 0; // local variable, only available inside the block
        for (int value : values) {
            sum += value;
        }
        return sum;
    }

    public void add(int... values) {
        result += sumAll(values);
    }

    public void subract(int... values) {
        result -= sumAll(values);
    }

    public void multiply(int... values) {
        for (int value : values) {
            result *= value;
        }
    }

    public void divide(int... values) {
        for (int value : values) {
            result /= value;
        }
    }

    public void printResult() {
        System.out.println("Result: " + result);
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.add(1, 2, 3);
        calc.subract(1);
        calc.multiply(4, 5);
        calc.divide(2, 1);
        calc.printResult();
    }

}
