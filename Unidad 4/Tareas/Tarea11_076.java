package com.w3resource.strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Exercise 76: Count 'life' or 'li?e' Substrings
 * Write a Java program to count how many times 'life' or 'li?e' appears anywhere in a given string.
 */
public class Tarea11_076 {
    public static void main(String[] args) {
        String str = "liveonwildlife";
        System.out.println("The given string is: " + str);
        
        Pattern pattern = Pattern.compile("li.e");
        Matcher matcher = pattern.matcher(str);
        int count = 0;
        while (matcher.find()) {
            count++;
        }
        System.out.println("The substring life or li?e appear number of times: " + count);
    }
}
