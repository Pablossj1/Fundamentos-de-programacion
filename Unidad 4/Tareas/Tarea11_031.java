package com.w3resource.strings;

/**
 * Exercise 31: Trim Whitespace
 * Write a Java program to trim leading or trailing whitespace from a given string.
 */
public class Tarea11_031 {
    public static void main(String[] args) {
        String str = " Java Exercises ";
        String new_str = str.trim();
        
        System.out.println("Original String: " + str);
        System.out.println("New String: " + new_str);
    }
}
