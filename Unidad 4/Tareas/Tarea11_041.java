package com.w3resource.strings;

/**
 * Exercise 41: Remove Duplicates Using Mask String
 * Write a Java program to remove duplicate characters from a given string that appear in another given string.
 */
public class Tarea11_041 {
    public static void main(String[] args) {
        String str = "the quick brown fox";
        String mask = "queen";
        System.out.println("The given string is: " + str);
        System.out.println("The given mask string is: " + mask);
        
        char[] maskArr = mask.toCharArray();
        char[] strArr = str.toCharArray();
        boolean[] maskChars = new boolean[256];
        for (char c : maskArr) {
            maskChars[c] = true;
        }
        
        StringBuilder sb = new StringBuilder();
        for (char c : strArr) {
            if (!maskChars[c]) {
                sb.append(c);
            }
        }
        System.out.println("\nThe new string is: \n" + sb.toString());
    }
}
