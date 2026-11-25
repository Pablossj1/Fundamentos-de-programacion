package com.w3resource.strings;

/**
 * Exercise 18: Generate Hash from String
 * Write a Java program to create a distinct identifier for a given string.
 */
public class Tarea11_018 {
    public static void main(String[] args) {
        String str = "Python Exercises.";
        int hash_code = str.hashCode();
        System.out.println("The hash for " + str + " is " + hash_code);
    }
}
