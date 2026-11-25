package com.w3resource.strings;

/**
 * Exercise 58: Ends With Specific Two Characters
 * Write a Java program to read a string and return true if it ends with a specified string of length 2.
 */
public class Tarea11_058 {
    public static void main(String[] args) {
        String str1 = "string";
        String str2 = "strign";
        String target = "ng";
        
        System.out.println("The given strings is: " + str1);
        System.out.println("The string containing " + target + " at last: " + str1.endsWith(target) + "\n");
        
        System.out.println("The given strings is: " + str2);
        System.out.println("The string containing " + target + " at last: " + str2.endsWith(target));
    }
}
