package com.w3resource.strings;

/**
 * Exercise 94: Longest Mirror Image Substring
 * Write a Java program to find the longest mirror image string at both ends of a given string.
 */
public class Tarea11_094 {
    public static void main(String[] args) {
        String str = "rotavator";
        System.out.println("The given string is: " + str);
        
        StringBuilder mirror = new StringBuilder();
        int len = str.length();
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) == str.charAt(len - 1 - i)) {
                mirror.append(str.charAt(i));
            } else {
                break;
            }
        }
        System.out.println("The longest mirror image string in the string is: " + mirror.toString());
    }
}
