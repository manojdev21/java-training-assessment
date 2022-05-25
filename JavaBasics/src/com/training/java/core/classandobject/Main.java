package com.training.java.core.classandobject;

public class Main {

    public static void main(String[] args) {
        Animal tom = new Animal("Tom", 12);
        Animal mark = new Animal("Mark", 6);

        tom.sleep();
        mark.walk();

        // tom and mark are the objects having the behavior described in the class Animal
    }

}
