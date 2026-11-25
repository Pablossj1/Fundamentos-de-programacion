package com.w3resource.strings;

/**
 * Exercise 55: Remove Adjacent Duplicates Recursively
 * Write a Java program to remove all adjacent duplicates recursively from a given string.
 */
public class Tarea11_055 {
    public static void main(String[] args) {
        String str = "aabaarbarccrabmq";
        System.out.println("The given string is: " + str);
        System.out.println("The new string after removing all adjacent duplicates is:");
        System.out.println(removeAdjacent(str));
    }
    
    static String removeAdjacent(String str) {
        if (str.length() <= 1) return str;
        StringBuilder sb = new StringBuilder();
        int i = 0;
        boolean changed = false;
        while (i < str.length()) {
            if (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                char dup = str.charAt(i);
                changed = true;
                while (i < str.length() && str.charAt(i) == dup) {
                    i++;
                }
            } else {
                sb.append(str.charAt(i));
                i++;
            }
        }
        String res = sb.toString();
        if (changed) {
            return removeAdjacent(res);
        }
        return res;
    }
}
