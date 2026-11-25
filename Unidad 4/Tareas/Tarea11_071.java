package com.w3resource.strings;

/**
 * Exercise 71: One String at End of Other
 * Write a Java program to check two given strings whether any of them appears at the end of the other string.
 */
public class Tarea11_071 {
    public static void main(String[] args) {
        checkAndPrint("xyz", "pqrxyz");
        checkAndPrint("pqrxyz", "xyz");
    }
    
    static void checkAndPrint(String s1, String s2) {
        System.out.println("The given strings are: " + s1 + "  and " + s2);
        String lower1 = s1.toLowerCase();
        String lower2 = s2.toLowerCase();
        boolean match = lower1.endsWith(lower2) || lower2.endsWith(lower1);
        System.out.println("Is one string appears at the end of other? " + match + "\n");
    }
}
