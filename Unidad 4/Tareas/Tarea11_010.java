package com.w3resource.strings;

/**
 * Exercise 10: Compare with StringBuffer
 * Write a Java program to compare a given string to a specified string buffer.
 */
public class Tarea11_010 {
    public static void main(String[] args) {
        String str1 = "example.com";
        StringBuffer sb1 = new StringBuffer("example.com");
        StringBuffer sb2 = new StringBuffer("Example.com");
        
        System.out.println("Comparing " + str1 + " and " + sb1 + ": " + str1.contentEquals(sb1));
        System.out.println("Comparing " + "Example.com and " + sb1 + ": " + "Example.com".contentEquals(sb1));
    }
}
