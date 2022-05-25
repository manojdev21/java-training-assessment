package com.training.java.core.accessmodifiers.publicmodifier;

public class Subractor { // public class can be accessed anywhere inside the project
    public int result;

    public void subract(int subractBy) { // public method can be accessed anywhere
        result -= subractBy;
    }

    public int getResult() {
        return result;
    }

}
