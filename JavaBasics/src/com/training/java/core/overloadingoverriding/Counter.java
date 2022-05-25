package com.training.java.core.overloadingoverriding;

public class Counter extends Adder {
    private int count;

    public int increment() { // overridden method
        ++count;
        printCount();
        return count;
    }

    public int increment(int incrementBy) { // overridden from the parent class, overloaded in the same class
        count += incrementBy;
        printCount();
        return count;
    }

    public int decrement() {
        --count;
        printCount();
        return count;
    }

    public int decrement(int decrementBy) { // overloaded
        count -= decrementBy;
        printCount();
        return count;
    }

    public void printCount() {
        System.out.println("Counter: " + count);
    }
}
