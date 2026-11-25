package com.w3resource.strings;

/**
 * Exercise 108: Check Consecutive Identical Letters
 * Write a Java program to check whether there are two consecutive, identical letters in a given string.
 */
public class Tarea11_108 {
    public static void main(String[] args) {
        checkAndPrint("Follow");
        checkAndPrint("Java");
        checkAndPrint("Yellow");
    }
    
    static void checkAndPrint(String str) {
        System.out.println("Original word: " + str);
        boolean hasConsecutive = false;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                hasConsecutive = true;
                break;
            }
        }
        System.out.println("If there are two consecutive identical letters in the said string: " + hasConsecutive);
    }
}
