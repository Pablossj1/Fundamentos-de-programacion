package com.w3resource.strings;

/**
 * Exercise 83: Alternate Chars from Two Strings
 * Write a Java program to create a string from two given strings alternating each character.
 */
public class Tarea11_083 {
    public static void main(String[] args) {
        String str1 = "welcome";
        String str2 = "w3resource";
        System.out.println("The given strings  are: " + str1 + "  and  " + str2);
        
        StringBuilder sb = new StringBuilder();
        int maxLen = Math.max(str1.length(), str2.length());
        for (int i = 0; i < maxLen; i++) {
            if (i < str1.length()) sb.append(str1.charAt(i));
            if (i < str2.length()) sb.append(str2.charAt(i));
        }
        System.out.println("The new string is: " + sb.toString());
    }
}
