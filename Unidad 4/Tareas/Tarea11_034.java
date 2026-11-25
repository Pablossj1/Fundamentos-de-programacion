package com.w3resource.strings;

/**
 * Exercise 34: Second Most Frequent Character
 * Write a Java program to find the second most frequent character in a given string.
 */
public class Tarea11_034 {
    public static void main(String[] args) {
        String str = "successes";
        System.out.println("The given string is: " + str);
        
        int[] count = new int[256];
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
        }
        
        int first = 0, second = 0;
        for (int i = 0; i < 256; i++) {
            if (count[i] > count[first]) {
                second = first;
                first = i;
            } else if (count[i] > count[second] && count[i] != count[first]) {
                second = i;
            }
        }
        
        System.out.println("The second most frequent char in the string is: " + (char) second);
    }
}
