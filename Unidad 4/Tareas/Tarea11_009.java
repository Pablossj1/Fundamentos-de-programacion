package com.w3resource.strings;

/**
 * Exercise 9: Compare with Char Sequence
 * Write a Java program to compare a given string to the specified character sequence.
 */
public class Tarea11_009 {
    public static void main(String[] args) {
        String str1 = "example.com";
        CharSequence cs1 = "example.com";
        CharSequence cs2 = "Example.com";
        
        System.out.println("Comparing " + str1 + " and " + cs1 + ": " + str1.contentEquals(cs1));
        System.out.println("Comparing " + "Example.com and " + cs1 + ": " + "Example.com".contentEquals(cs1));
    }
}
