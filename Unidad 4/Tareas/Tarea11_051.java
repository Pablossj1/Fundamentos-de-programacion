package com.w3resource.strings;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Exercise 51: Count and Print Duplicate Characters
 * Write a Java program to count and print all duplicates in the input string.
 */
public class Tarea11_051 {
    public static void main(String[] args) {
        String str = "w3resource";
        System.out.println("The given string is: " + str);
        System.out.println("The duplicate characters and counts are: ");
        
        Map<Character, Integer> counts = new LinkedHashMap<>();
        for (char c : str.toCharArray()) {
            counts.put(c, counts.getOrDefault(c, 0) + 1);
        }
        
        for (Map.Entry<Character, Integer> entry : counts.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + "  appears  " + entry.getValue() + "  times");
            }
        }
    }
}
