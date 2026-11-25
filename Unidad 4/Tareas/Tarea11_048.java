package com.w3resource.strings;

/**
 * Exercise 48: Remove 'b' and 'ac' from String
 * Write a Java program to remove "b" and "ac" from a given string.
 */
public class Tarea11_048 {
    public static void main(String[] args) {
        String str = "abrambabasc";
        System.out.println("The given string is: " + str);
        
        // Remove 'b' and 'ac'
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'b') {
                continue;
            } else if (str.charAt(i) == 'a' && i + 1 < str.length() && str.charAt(i + 1) == 'c') {
                i++; // skip 'c'
                continue;
            }
            sb.append(str.charAt(i));
        }
        System.out.println("After removing the new string is: " + sb.toString());
    }
}
