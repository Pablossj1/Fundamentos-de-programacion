package com.w3resource.strings;

/**
 * Exercise 63: First Two Chars at End
 * Write a Java program to check whether the first two characters appear at the end of a given string.
 */
public class Tarea11_063 {
    public static void main(String[] args) {
        String str = "educated";
        System.out.println("The given strings is: " + str);
        
        boolean result = false;
        if (str.length() >= 2) {
            String first2 = str.substring(0, 2);
            String last2 = str.substring(str.length() - 2);
            result = first2.equals(last2);
        }
        System.out.println("The first two characters appear in the last is: " + result);
    }
}
