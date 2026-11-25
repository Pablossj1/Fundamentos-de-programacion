package com.w3resource.strings;

/**
 * Exercise 36: Check Interleaving of Two Strings
 * Write a Java program to check whether two strings interleave of a given string.
 */
public class Tarea11_036 {
    public static void main(String[] args) {
        String str1 = "PMQNO";
        String s1 = "MNO";
        String s2 = "PQ";
        
        System.out.println("The given string is: " + str1);
        System.out.println("The interleaving strings are " + s1 + " and " + s2);
        System.out.println("The given string is interleaving: " + isInterleaved(s1, s2, str1));
        
        String str2 = "PNQMO";
        System.out.println("\nThe given string is: " + str2);
        System.out.println("The interleaving strings are " + s1 + " and " + s2);
        System.out.println("The given string is interleaving: " + isInterleaved(s1, s2, str2));
    }
    
    static boolean isInterleaved(String a, String b, String c) {
        if (a.length() + b.length() != c.length()) return false;
        int i = 0, j = 0, k = 0;
        while (k < c.length()) {
            if (i < a.length() && a.charAt(i) == c.charAt(k)) {
                i++;
            } else if (j < b.length() && b.charAt(j) == c.charAt(k)) {
                j++;
            } else {
                return false;
            }
            k++;
        }
        return i == a.length() && j == b.length();
    }
}
