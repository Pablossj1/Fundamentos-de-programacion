package com.w3resource.strings;

/**
 * Exercise 105: Count Substring Occurrences
 * Write a Java program to count the occurrences of a given string in another given string.
 */
public class Tarea11_105 {
    public static void main(String[] args) {
        String str = "abcd abc aabc baa abcaa";
        String target = "aa";
        
        int count = 0;
        int idx = 0;
        while ((idx = str.indexOf(target, idx)) != -1) {
            count++;
            idx += target.length();
        }
        System.out.println("'" + target + "' has occured " + count + " times in '" + str + "'");
    }
}
