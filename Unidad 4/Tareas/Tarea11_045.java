package com.w3resource.strings;

/**
 * Exercise 45: Reverse Words in String
 * Write a Java program to reverse words in a given string.
 */
public class Tarea11_045 {
    public static void main(String[] args) {
        String str = "Reverse words in a given string";
        System.out.println("The given string is: " + str);
        
        String[] words = str.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            if (i > 0) sb.append(" ");
        }
        System.out.println("The new string after reversed the words: " + sb.toString());
    }
}
