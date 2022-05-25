package com.training.java.core.removesubstr;

public class RemoveSubstring {

    public static void main(String[] args) {
        String substringToBeRemoved = "object";
        String sentence = "Java8 is a 12high-level, object-oriented4 programming30 language";

        sentence = sentence.replaceAll("[0-9]+", ""); // to remove all numeric values
        sentence = sentence.replaceAll(substringToBeRemoved, ""); // to remove substring

        System.out.println(sentence);
    }

}
