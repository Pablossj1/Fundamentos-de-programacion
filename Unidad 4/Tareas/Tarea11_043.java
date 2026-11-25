package com.w3resource.strings;

/**
 * Exercise 43: Most Frequent Character
 * Write a Java program to find the character in a string that occurs the most frequently.
 */
public class Tarea11_043 {
    public static void main(String[] args) {
        String str = "test string";
        System.out.println("The given string is: " + str);
        
        int[] count = new int[256];
        for (char c : str.toCharArray()) {
            count[c]++;
        }
        
        char maxChar = ' ';
        int max = -1;
        for (char c : str.toCharArray()) {
            if (count[c] > max) {
                max = count[c];
                maxChar = c;
            }
        }
        System.out.println("Max occurring character in the given string is: " + maxChar);
    }
}
