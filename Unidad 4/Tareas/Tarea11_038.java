package com.w3resource.strings;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Exercise 38: Remove Duplicate Characters
 * Write a Java program to print the result of removing duplicates from a given string.
 */
public class Tarea11_038 {
    public static void main(String[] args) {
        String str = "w3resource";
        System.out.println("The given string is: " + str);
        
        Set<Character> set = new LinkedHashSet<>();
        for (char c : str.toCharArray()) {
            set.add(c);
        }
        
        StringBuilder sb = new StringBuilder();
        for (Character c : set) {
            sb.append(c);
        }
        System.out.println("After removing duplicates characters the new string is: " + sb.toString());
    }
}
