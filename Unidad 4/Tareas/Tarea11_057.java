package com.w3resource.strings;

/**
 * Exercise 57: Swap Last Two Characters
 * Write a Java program to create a string from a given string by swapping the last two characters.
 */
public class Tarea11_057 {
    public static void main(String[] args) {
        String str = "string";
        System.out.println("The given strings is: " + str);
        
        if (str.length() >= 2) {
            String res = str.substring(0, str.length() - 2) + 
                         str.charAt(str.length() - 1) + 
                         str.charAt(str.length() - 2);
            System.out.println("The string after swap last two characters are: " + res);
        } else {
            System.out.println("The string after swap last two characters are: " + str);
        }
    }
}
