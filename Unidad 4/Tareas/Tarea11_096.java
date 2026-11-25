package com.w3resource.strings;

/**
 * Exercise 96: Remove Char Except First and Last
 * Write a Java program to create a new string after removing a specified character from a given string except first and last position.
 */
public class Tarea11_096 {
    public static void main(String[] args) {
        String str = "zebrazone";
        char target = 'z';
        System.out.println("The given string is: " + str);
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (i > 0 && i < str.length() - 1 && str.charAt(i) == target) {
                continue;
            }
            sb.append(str.charAt(i));
        }
        System.out.println("The new string is: " + sb.toString());
    }
}
