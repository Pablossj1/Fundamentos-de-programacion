package com.w3resource.strings;

/**
 * Exercise 39: First Non-Repeating Character
 * Write a Java program to find the first non-repeating character in a string.
 */
public class Tarea11_039 {
    public static void main(String[] args) {
        String str = "gibblegabbler";
        System.out.println("The given string is: " + str);
        
        int[] count = new int[256];
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
        }
        
        char result = ' ';
        for (int i = 0; i < str.length(); i++) {
            if (count[str.charAt(i)] == 1) {
                result = str.charAt(i);
                break;
            }
        }
        System.out.println("The first non repeated character in String is: " + result);
    }
}
