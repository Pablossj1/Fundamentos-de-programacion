package com.w3resource.strings;

/**
 * Exercise 2: Get Unicode Code Point at Index
 * Write a Java program to get the character (Unicode code point) at the given index within the string.
 */
public class Tarea11_002 {
    public static void main(String[] args) {
        String str = "w3resource.com";
        System.out.println("Original String : " + str);
        
        int val1 = str.codePointAt(1);
        int val2 = str.codePointAt(10);
        
        System.out.println("Character(unicode point) = " + val1);
        System.out.println("Character(unicode point) = " + val2);
    }
}
