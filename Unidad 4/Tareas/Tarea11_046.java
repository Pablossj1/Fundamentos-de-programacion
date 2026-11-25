package com.w3resource.strings;

/**
 * Exercise 46: Reverse Every Word
 * Write a Java program to reverse every word in a string using methods.
 */
public class Tarea11_046 {
    public static void main(String[] args) {
        String str = "This is a test string";
        System.out.println("The given string is: " + str);
        
        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            StringBuilder word = new StringBuilder(words[i]);
            result.append(word.reverse().toString());
            if (i < words.length - 1) result.append(" ");
        }
        System.out.println("The string reversed word by word is: ");
        System.out.println(result.toString());
    }
}
