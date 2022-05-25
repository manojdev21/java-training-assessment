package com.training.java.core.splitstring;

public class StringSplit {

    public static void main(String[] args) {
        String sentence = "Split the string into two/more with a delimiter";
        String[] texts = sentence.split("/"); //using split method
        for (String text : texts) {
            System.out.println("-> " + text);
        }
    }

}
