package com.w3resource.strings;

/**
 * Exercise 64: Remove Duplicate Start and End Substring
 * Write a Java program to read a string. If a substring of length two appears at both its beginning and end,
 * return a string without the substring at the beginning; otherwise, return original.
 */
public class Tarea11_064 {
    public static void main(String[] args) {
        String str = "educated";
        System.out.println("The given strings is: " + str);
        
        String res = str;
        if (str.length() >= 2) {
            String first2 = str.substring(0, 2);
            String last2 = str.substring(str.length() - 2);
            if (first2.equals(last2)) {
                res = str.substring(2);
            }
        }
        System.out.println("The new string is: " + res);
    }
}
