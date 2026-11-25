package com.w3resource.strings;

/**
 * Exercise 107: Count Character Occurrences
 * Write a Java program to count occurrences of a certain character in a given string.
 */
public class Tarea11_107 {
    public static void main(String[] args) {
        String str = "Red Green Blue Yellow";
        char ch = 'e';
        
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        System.out.println("Original String: " + str);
        System.out.println("Character '" + ch + "' occurs " + count + " times.");
    }
}
