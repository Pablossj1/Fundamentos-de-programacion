package com.w3resource.strings;

/**
 * Exercise 60: Append Strings Equal Length
 * Write a Java program to read two strings, truncate the longer to the length of the shorter, and append them.
 */
public class Tarea11_060 {
    public static void main(String[] args) {
        String str1 = "Welcome";
        String str2 = "home";
        System.out.println("The given strings is: " + str1 + " and " + str2);
        
        int minLen = Math.min(str1.length(), str2.length());
        String sub1 = str1.substring(str1.length() - minLen);
        String sub2 = str2.substring(str2.length() - minLen);
        
        System.out.println("The new string is: " + sub1 + sub2);
    }
}
