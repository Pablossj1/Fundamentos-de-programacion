package com.w3resource.strings;

/**
 * Exercise 8: Contains Specified Sequence
 * Write a Java program to test if a given string contains the specified sequence of char values.
 */
public class Tarea11_008 {
    public static void main(String[] args) {
        String str = "PHP Exercises and Python Exercises";
        String seq = "and";
        
        System.out.println("Original String: " + str);
        System.out.println("Specified sequence of char values: " + seq);
        System.out.println(str.contains(seq));
    }
}
