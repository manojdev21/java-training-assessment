package com.training.java.core.overloadingoverriding;

public class Main {

    public static void main(String[] args) {
        Counter counter = new Counter();
        counter.increment(10);
        counter.increment();
        counter.decrement(4);
        counter.decrement();
        counter.printCount();
    }

}
