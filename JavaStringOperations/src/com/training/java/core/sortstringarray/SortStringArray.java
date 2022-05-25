package com.training.java.core.sortstringarray;

import java.util.Arrays;
import java.util.Collections;

public class SortStringArray {

    public static void main(String[] args) {
        String[] arr = {"write", "a", "program", "to", "sort", "the", "string", "array"};
        String[] arr1 = {"write", "a", "program", "to", "sort", "the", "string", "array"};
        String[] arr2 = {"write", "a", "program", "to", "sort", "the", "string", "array"};

        Arrays.sort(arr); // sorting using Arrays
        System.out.println(Arrays.toString(arr));

        Collections.sort(Arrays.asList(arr1)); // using Collections
        System.out.println(Arrays.toString(arr1));

        for (int i = 0; i < arr2.length - 1; i++) { // using String's compareTo
            for (int j = 0; j < arr2.length - i - 1; j++) {
                if (arr2[j].compareTo(arr2[j + 1]) > 0) {
                    String temp = arr2[j + 1];
                    arr2[j + 1] = arr2[j];
                    arr2[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr2));
    }
}
