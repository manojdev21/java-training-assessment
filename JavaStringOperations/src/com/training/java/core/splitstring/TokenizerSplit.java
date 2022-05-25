package com.training.java.core.splitstring;

import java.util.StringTokenizer;

public class TokenizerSplit {

    public static void main(String[] args) {
        String sentence = "Split the string into two/more with a delimiter";

        StringTokenizer tokenizer = new StringTokenizer(sentence, " "); //using StringTokenizer
        while (tokenizer.hasMoreTokens()) {
            System.out.println("Token: " + tokenizer.nextToken());
        }
    }
}
