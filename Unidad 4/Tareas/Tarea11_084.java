package com.w3resource.strings;

/**
 * Exercise 84: Repeated Truncating Prefixes
 * Write a Java program to make an original string made of p characters, followed by p-1 characters till p > 0.
 */
public class Tarea11_084 {
    public static void main(String[] args) {
        String str = "welcome";
        int p = 4;
        System.out.println("The given string is: " + str);
        System.out.println("Number of repetition characters and repetition: " + p);
        
        StringBuilder sb = new StringBuilder();
        for (int i = p; i > 0; i--) {
            sb.append(str.substring(0, i));
        }
        System.out.println("The new string is: " + sb.toString());
    }
}
