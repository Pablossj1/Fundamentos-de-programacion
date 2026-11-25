package com.w3resource.strings;

/**
 * Exercise 25: Replace Substring with Regex
 * Write a Java program to replace each substring of a given string that matches the given regular expression with the given replacement.
 */
public class Tarea11_025 {
    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog.";
        String new_str = str.replaceAll("fox", "cat");
        
        System.out.println("Original string: " + str);
        System.out.println("New String: " + new_str);
    }
}
