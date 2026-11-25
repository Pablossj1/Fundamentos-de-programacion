package com.w3resource.strings;

/**
 * Exercise 103: Remove Specified Character from String
 * Write a Java program to remove a specified character from a given string.
 */
public class Tarea11_103 {
    public static void main(String[] args) {
        String str = "abcdefabcdeabcdaaa";
        char ch = 'a';
        System.out.println("Original string:\n" + str + "\n");
        
        String result = str.replace(Character.toString(ch), "");
        System.out.println("Second string:\n" + result);
    }
}
