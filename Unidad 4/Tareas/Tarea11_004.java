package com.w3resource.strings;

/**
 * Exercise 4: Count Unicode Points in Range
 * Write a Java program to count Unicode code points in the specified text range of a string.
 */
public class Tarea11_004 {
    public static void main(String[] args) {
        String str = "w3rsource.com";
        System.out.println("Original String : " + str);
        
        int count = str.codePointCount(1, 10);
        System.out.println("Codepoint count = " + count);
    }
}
