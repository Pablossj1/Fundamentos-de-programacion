package com.w3resource.strings;

/**
 * Exercise 24: Replace Character
 * Write a Java program to replace a specified character with another character.
 */
public class Tarea11_024 {
    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog.";
        String new_str = str.replace('d', 'f');
        
        System.out.println("Original string: " + str);
        System.out.println("New String: " + new_str);
    }
}
