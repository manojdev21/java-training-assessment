package com.training.java.core.stringcopyconcat;

public class StringCopy {

    public static void main(String[] args) {
        String string = "String to be copied";
        String stringCopy = String.copyValueOf(string.toCharArray());
        System.out.println(string == stringCopy); // prints false, because both points to different memory locations
    }

}
