package com.w3resource.strings;

/**
 * Exercise 72: Contains P?P Pattern
 * Write a Java program to return true if a given string contains 'pop', but the middle 'o' may contain another character.
 */
public class Tarea11_072 {
    public static void main(String[] args) {
        checkAndPrint("dikchapop");
        checkAndPrint("dikp$pdik");
    }
    
    static void checkAndPrint(String str) {
        System.out.println("The given string is: " + str);
        boolean found = false;
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) == 'p' && str.charAt(i + 2) == 'p') {
                found = true;
                break;
            }
        }
        System.out.println("Is p?p appear in the given string? " + found + "\n");
    }
}
