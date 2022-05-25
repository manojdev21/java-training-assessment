package com.training.java.core.checkpalindrome;

public class CheckPalindrome {

    public static void main(String[] args) {
        String givenSentence = "Able was I saw Elba";

        int last = givenSentence.length() - 1;
        for (int i = 0; i < last; i++) {
            // getting the first and last character and converting into lower case and checking both are equal, and reducing the last, the loop breaks when crosses the mid index
            if (String.valueOf(givenSentence.charAt(i)).toLowerCase()
                    .equals(String.valueOf(givenSentence.charAt(last--)).toLowerCase())) {
                continue;
            } else {
                System.out.println("The given sentence is not a palindrome");
                return;
            }
        }
        System.out.println("The given sentence is a palindrome!");
    }

}
