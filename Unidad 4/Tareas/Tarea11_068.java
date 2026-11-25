package com.w3resource.strings;

/**
 * Exercise 68: Remove Specified Chars and Neighbors
 * Write a Java program to read a string and return after removing specified characters and their immediate left and right adjacent characters.
 */
public class Tarea11_068 {
    public static void main(String[] args) {
        checkAndPrint("test#string");
        checkAndPrint("test##string");
        checkAndPrint("test#the#string");
    }
    
    static void checkAndPrint(String str) {
        System.out.println("The given strings is: " + str);
        int len = str.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) == '#') {
                continue;
            }
            if (i > 0 && str.charAt(i - 1) == '#') {
                continue;
            }
            if (i < len - 1 && str.charAt(i + 1) == '#') {
                continue;
            }
            sb.append(str.charAt(i));
        }
        System.out.println("The new string is: " + sb.toString() + "\n");
    }
}
