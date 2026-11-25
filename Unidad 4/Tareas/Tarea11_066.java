package com.w3resource.strings;

/**
 * Exercise 66: Remove First Two Except g or h
 * Write a Java program to read a string and return it without the first two characters.
 * Keep first if 'g', keep second if 'h'.
 */
public class Tarea11_066 {
    public static void main(String[] args) {
        checkAndPrint("goat");
        checkAndPrint("photo");
        checkAndPrint("ghost");
    }
    
    static void checkAndPrint(String str) {
        System.out.println("The given strings is: " + str);
        StringBuilder sb = new StringBuilder();
        if (str.length() > 0 && str.charAt(0) == 'g') {
            sb.append('g');
        }
        if (str.length() > 1 && str.charAt(1) == 'h') {
            sb.append('h');
        }
        if (str.length() > 2) {
            sb.append(str.substring(2));
        }
        System.out.println("The new string is: " + sb.toString() + "\n");
    }
}
