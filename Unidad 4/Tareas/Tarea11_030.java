package com.w3resource.strings;

/**
 * Exercise 30: Convert to Uppercase
 * Write a Java program to convert all characters in a string to uppercase.
 */
public class Tarea11_030 {
    public static void main(String[] args) {
        String str = "The Quick BroWn FoX!";
        String upperStr = str.toUpperCase();
        
        System.out.println("Original String: " + str);
        System.out.println("String in uppercase: " + upperStr);
    }
}
