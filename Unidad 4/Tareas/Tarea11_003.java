package com.w3resource.strings;

/**
 * Exercise 3: Get Unicode Code Point Before Index
 * Write a Java program to get the character (Unicode code point) before the specified index within the string.
 */
public class Tarea11_003 {
    public static void main(String[] args) {
        String str = "w3resource.com";
        System.out.println("Original String : " + str);
        
        int val1 = str.codePointBefore(1);
        int val2 = str.codePointBefore(9);
        
        System.out.println("Character(unicode point) = " + val1);
        System.out.println("Character(unicode point) = " + val2);
    }
}
