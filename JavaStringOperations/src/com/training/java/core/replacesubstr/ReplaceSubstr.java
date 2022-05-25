package com.training.java.core.replacesubstr;

public class ReplaceSubstr {

    public static void main(String[] args) {
        String substringToBeReplaced = "Java";
        String substringToBeReplacedBy = "Python";
        char characterToBeReplaced = 'Y';
        char characterToBeReplacedBy = 'M';
        String sentence = "The name Java comes from Yonty Java. When Guido van Rossum was creating Java, he was also reading the scripts from BBC’s Yonty Java’s Flying Circus. He thought the name Java was appropriately short and slightly mysterious.";

        sentence = sentence.replaceAll(String.valueOf(characterToBeReplaced),
                String.valueOf(characterToBeReplacedBy));
        sentence = sentence.replaceAll(substringToBeReplaced, substringToBeReplacedBy);

        System.out.println(sentence);
    }

}
