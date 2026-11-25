package com.w3resource.strings;

/**
 * Exercise 44: Reverse String Recursively
 * Write a Java program to reverse a string using recursion.
 */
public class Tarea11_044 {
    public static void main(String[] args) {
        String str = "The quick brown fox jumps";
        System.out.println("The given string is: " + str);
        System.out.println("The string in reverse order is:");
        System.out.println(reverseRecursively(str));
    }
    
    static String reverseRecursively(String s) {
        if (s == null || s.length() <= 1) {
            return s;
        }
        return reverseRecursively(s.substring(1)) + s.charAt(0);
    }
}
