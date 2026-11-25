package com.w3resource.strings;

/**
 * Exercise 27: Get Substring by Position
 * Write a Java program to get a substring of a given string at two specified positions.
 */
public class Tarea11_027 {
    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog.";
        String new_str = str.substring(10, 26);
        
        System.out.println("old = " + str);
        System.out.println("new = " + new_str);
    }
}
