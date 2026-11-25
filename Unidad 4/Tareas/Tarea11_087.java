package com.w3resource.strings;

/**
 * Exercise 87: Check Happy Character
 * Write a Java program to check whether a specified character ('z') is happy.
 * A character is happy when the same character appears to its left or right.
 */
public class Tarea11_087 {
    public static void main(String[] args) {
        checkAndPrint("azzlea", 'z');
        checkAndPrint("azmzlea", 'z');
    }
    
    static void checkAndPrint(String str, char ch) {
        System.out.println("The given string is: " + str);
        boolean happy = true;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                boolean hasLeft = (i > 0 && str.charAt(i - 1) == ch);
                boolean hasRight = (i < str.length() - 1 && str.charAt(i + 1) == ch);
                if (!hasLeft && !hasRight) {
                    happy = false;
                    break;
                }
            }
        }
        System.out.println("Is " + ch + " happy in the string: " + happy + "\n");
    }
}
