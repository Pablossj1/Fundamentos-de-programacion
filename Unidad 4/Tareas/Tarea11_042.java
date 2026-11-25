package com.w3resource.strings;

import java.util.ArrayList;
import java.util.List;

/**
 * Exercise 42: List Items Containing Word Letters
 * Write a Java program to print a list of items containing all characters of a given word.
 */
public class Tarea11_042 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("rabbit");
        list.add("bribe");
        list.add("dog");
        
        String word = "bib";
        System.out.println("The given strings are: rabbit   bribe   dog   ");
        System.out.println("The given word is: " + word);
        System.out.println("\nThe strings containing all the letters of the given word are: ");
        
        for (String str : list) {
            if (containsAllChars(str, word)) {
                System.out.println(str);
            }
        }
    }
    
    static boolean containsAllChars(String str, String word) {
        int[] count = new int[256];
        for (char c : str.toCharArray()) {
            count[c]++;
        }
        for (char c : word.toCharArray()) {
            if (count[c] == 0) return false;
            count[c]--;
        }
        return true;
    }
}
