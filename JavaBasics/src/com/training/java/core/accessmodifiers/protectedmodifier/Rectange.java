package com.training.java.core.accessmodifiers.protectedmodifier;

public class Rectange {
    private int length;
    private int breadth;

    // the findArea() method can be accessed across the package or by the sub classes regardless of the package
    protected int findArea() {
        return length * breadth;
    }

}
