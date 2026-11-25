package com.w3resource.strings;

/**
 * Exercise 35: String Permutations with Repetition
 * Write a Java program to print all permutations of a given string with repetition.
 */
public class Tarea11_035 {
    public static void main(String[] args) {
        String str = "PQR";
        System.out.println("The given string is: " + str);
        System.out.println("The permuted strings are:");
        allPermutations(str, "", str.length());
    }
    
    static void allPermutations(String str, String current, int length) {
        if (current.length() == length) {
            System.out.println(current);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            allPermutations(str, current + str.charAt(i), length);
        }
    }
}
