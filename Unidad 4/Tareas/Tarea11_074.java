package com.w3resource.strings;

/**
 * Exercise 74: Prefix Appears Elsewhere
 * Write a Java program to check whether a prefix string of specified length appears elsewhere in the string.
 */
public class Tarea11_074 {
    public static void main(String[] args) {
        checkAndPrint("MrsJemsmrsam", 3);
        checkAndPrint("MrsJemsMrsam", 3);
    }
    
    static void checkAndPrint(String str, int len) {
        System.out.println("The given strings is: " + str);
        System.out.println("The prefix string length is: " + len);
        String prefix = str.substring(0, len);
        String remainder = str.substring(len);
        boolean found = remainder.contains(prefix);
        System.out.println("Is '" + prefix + "' appear else where in the string? " + found + "\n");
    }
}
