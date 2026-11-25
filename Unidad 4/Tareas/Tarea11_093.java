package com.w3resource.strings;

/**
 * Exercise 93: Longest Prefix and Suffix Substring
 * Write a Java program to find the longest substring that appears at both ends of a given string.
 */
public class Tarea11_093 {
    public static void main(String[] args) {
        String str = "playersplay";
        System.out.println("The given string is: " + str);
        
        String longest = "";
        for (int i = 1; i <= str.length() / 2; i++) {
            String prefix = str.substring(0, i);
            String suffix = str.substring(str.length() - i);
            if (prefix.equals(suffix)) {
                longest = prefix;
            }
        }
        System.out.println("The longest substring in the string is: " + longest);
    }
}
