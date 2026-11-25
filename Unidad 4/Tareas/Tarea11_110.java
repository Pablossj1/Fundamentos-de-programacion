package com.w3resource.strings;

import java.util.HashMap;
import java.util.Map;

/**
 * Exercise 110: Count Duplicates Occurring More Than Twice
 * Write a Java program to count the number of characters (alphanumeric only) that occur more than twice in a given string.
 */
public class Tarea11_110 {
    public static void main(String[] args) {
        countMoreThanTwice("abcdaa");
        countMoreThanTwice("Create a Date Calendar.");
    }
    
    static void countMoreThanTwice(String str) {
        System.out.println("Original String: " + str);
        Map<Character, Integer> counts = new HashMap<>();
        for (char c : str.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                char lower = Character.toLowerCase(c);
                counts.put(lower, counts.getOrDefault(lower, 0) + 1);
            }
        }
        int count = 0;
        for (int freq : counts.values()) {
            if (freq > 2) {
                count++;
            }
        }
        System.out.println("Number of duplicate characters in the said String (Occurs more than twice.): " + count + "\n");
    }
}
