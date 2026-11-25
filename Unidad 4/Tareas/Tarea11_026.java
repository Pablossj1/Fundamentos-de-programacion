package com.w3resource.strings;

/**
 * Exercise 26: Starts With Substring
 * Write a Java program to check whether a given string starts with another string.
 */
public class Tarea11_026 {
    public static void main(String[] args) {
        String str1 = "Red is favorite color.";
        String str2 = "Orange is also my favorite color.";
        String startStr = "Red";
        
        System.out.println(str1 + " starts with " + startStr + "? " + str1.startsWith(startStr));
        System.out.println(str2 + " starts with " + startStr + "? " + str2.startsWith(startStr));
    }
}
