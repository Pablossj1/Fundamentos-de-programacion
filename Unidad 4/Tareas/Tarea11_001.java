package com.w3resource.strings;

/**
 * Exercise 1: Get Character at Index
 * Write a Java program to get the character at the given index within the string.
 */
public class Tarea11_001 {
    public static void main(String[] args) {
        String str = "Java Exercises!";
        System.out.println("Original String = " + str);
        
        int index1 = 0;
        int index2 = 10;
        
        System.out.println("The character at position " + index1 + " is " + (char) str.charAt(index1));
        System.out.println("The character at position " + index2 + " is " + (char) str.charAt(index2));
    }
}
