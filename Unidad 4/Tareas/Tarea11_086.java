package com.w3resource.strings;

/**
 * Exercise 86: Count Triples in String
 * Write a Java program to count the number of triples (characters appearing three times in a row) in a given string.
 */
public class Tarea11_086 {
    public static void main(String[] args) {
        String str = "welllcommmmeee";
        System.out.println("The given string is: " + str);
        
        int count = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) == str.charAt(i + 1) && str.charAt(i) == str.charAt(i + 2)) {
                count++;
            }
        }
        System.out.println("The number of triples in the string is: " + count);
    }
}
