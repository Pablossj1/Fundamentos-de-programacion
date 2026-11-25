package com.w3resource.strings;

/**
 * Exercise 97: Chars at Indices 0-2, 5-7, etc.
 * Write a Java program to return a string with characters at index positions 0,1,2, 5,6,7, ... from a given string.
 */
public class Tarea11_097 {
    public static void main(String[] args) {
        String str = "w3resource.com";
        System.out.println("The given string is: " + str);
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i += 5) {
            int end = Math.min(i + 3, str.length());
            sb.append(str.substring(i, end));
        }
        System.out.println("The new string is: " + sb.toString());
    }
}
