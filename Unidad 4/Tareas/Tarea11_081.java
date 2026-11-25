package com.w3resource.strings;

/**
 * Exercise 81: Compare 3-char and 4-char Substrings
 * Write a Java program to check whether two strings of length 3 ("red") and 4 ("blue") appear the same number of times.
 */
public class Tarea11_081 {
    public static void main(String[] args) {
        String str = "redcapmanwithbluecar";
        System.out.println("The given string is: " + str);
        
        int redCount = countOccurrences(str, "red");
        int blueCount = countOccurrences(str, "blue");
        
        System.out.println("The appearance of red and blue are same: " + (redCount == blueCount));
    }
    
    static int countOccurrences(String str, String sub) {
        int count = 0, idx = 0;
        while ((idx = str.indexOf(sub, idx)) != -1) {
            count++;
            idx += sub.length();
        }
        return count;
    }
}
