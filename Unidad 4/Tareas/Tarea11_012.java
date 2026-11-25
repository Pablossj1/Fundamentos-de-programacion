package com.w3resource.strings;

/**
 * Exercise 12: Ends With Substring
 * Write a Java program to check whether a given string ends with another string.
 */
public class Tarea11_012 {
    public static void main(String[] args) {
        String str1 = "Python Exercises";
        String str2 = "Python Exercise";
        String end_str = "se";
        
        System.out.println("\"" + str1 + "\" ends with \"" + end_str + "\"? " + str1.endsWith(end_str));
        System.out.println("\"" + str2 + "\" ends with \"" + end_str + "\"? " + str2.endsWith(end_str));
    }
}
