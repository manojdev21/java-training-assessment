package com.training.java.core.countcharacters;

public class CountChar {

    public static void main(String[] args) {
        int lowerCaseCount = 0;
        int upperCaseCount = 0;
        int digitCount = 0;
        int specialCharacterCount = 0;

        String sentence = "Pa$s w0rd@123s";
        sentence = sentence.replaceAll(" ", "");

        for (char c : sentence.toCharArray()) {
            int ascii = (int) c;
            if (ascii >= 97 && ascii <= 122) {
                lowerCaseCount++;
            } else if (ascii >= 65 && ascii <= 90) {
                upperCaseCount++;
            } else if (ascii >= 48 && ascii <= 57) {
                digitCount++;
            } else {
                specialCharacterCount++;
            }
        }

        System.out.println("Lowercase count - " + lowerCaseCount);
        System.out.println("Uppercase count - " + upperCaseCount);
        System.out.println("Digit count - " + digitCount);
        System.out.println("Special character count - " + specialCharacterCount);
    }

}
