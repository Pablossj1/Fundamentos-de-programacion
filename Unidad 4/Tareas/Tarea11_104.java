package com.w3resource.strings;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Exercise 104: Sort Strings by Length
 * Write a Java program to sort in ascending and descending order by the length of the given array of strings.
 */
public class Tarea11_104 {
    public static void main(String[] args) {
        String[] colors = {"Green", "White", "Black", "Pink", "Orange", "Blue", "Champagne", "Indigo", "Ivory"};
        System.out.println("Original unsorted colors: " + Arrays.toString(colors) + "\n");
        
        String[] desc = Arrays.copyOf(colors, colors.length);
        Arrays.sort(desc, Comparator.comparingInt(String::length).reversed());
        System.out.println("Sorted color (descending order): " + Arrays.toString(desc) + "\n");
        
        String[] asc = Arrays.copyOf(colors, colors.length);
        Arrays.sort(asc, Comparator.comparingInt(String::length));
        System.out.println("Sorted color (ascending order): " + Arrays.toString(asc));
    }
}
