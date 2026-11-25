package com.w3resource.strings;

/**
 * Exercise 65: Remove Same First and Last Char
 * Write a Java program to read a given string and return the string without the first or last characters if they are the same.
 */
public class Tarea11_065 {
    public static void main(String[] args) {
        String str = "testcricket";
        System.out.println("The given strings is: " + str);
        
        String res = str;
        if (str.length() >= 2 && str.charAt(0) == str.charAt(str.length() - 1)) {
            res = str.substring(1, str.length() - 1);
        }
        System.out.println("The new string is: " + res);
    }
}
