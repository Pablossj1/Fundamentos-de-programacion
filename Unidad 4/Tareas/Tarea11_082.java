package com.w3resource.strings;

/**
 * Exercise 82: Duplicate Each Character
 * Write a Java program to create a string containing every character twice of a given string.
 */
public class Tarea11_082 {
    public static void main(String[] args) {
        String str = "welcome";
        System.out.println("The given string is: " + str);
        
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            sb.append(c).append(c);
        }
        System.out.println("The new string is: " + sb.toString());
    }
}
