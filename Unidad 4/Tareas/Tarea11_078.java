package com.w3resource.strings;

/**
 * Exercise 78: Repeat Last N Characters
 * Write a Java program to repeat a specific number of characters for a specific number of times from the last part of a string.
 */
public class Tarea11_078 {
    public static void main(String[] args) {
        String str = "string";
        int n = 3;
        int times = 3;
        
        System.out.println("The given string is: " + str);
        String lastPart = str.substring(str.length() - n);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < times; i++) {
            sb.append(lastPart);
        }
        System.out.println("The new string after repetition: " + sb.toString());
    }
}
