package com.w3resource.strings;

/**
 * Exercise 91: Count Words Ending with m or n
 * Write a Java program to count the number of words ending in 'm' or 'n' (not case sensitive) in a given text.
 */
public class Tarea11_091 {
    public static void main(String[] args) {
        String str = "mam is in the room";
        System.out.println("The given string is: " + str);
        
        String[] words = str.split("\\s+");
        int count = 0;
        for (String w : words) {
            String lower = w.toLowerCase();
            if (lower.endsWith("m") || lower.endsWith("n")) {
                count++;
            }
        }
        System.out.println("The number of words ends eith m or n is: " + count);
    }
}
