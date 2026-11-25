package com.w3resource.strings;

/**
 * Exercise 70: Check PQ-Balance
 * Write a Java program that checks if a string has pq-balance if it contains at least one 'q' directly after each 'p'.
 */
public class Tarea11_070 {
    public static void main(String[] args) {
        checkAndPrint("gfpmpnppqab");
        checkAndPrint("gfpmpnpqpab");
    }
    
    static void checkAndPrint(String str) {
        System.out.println("The given strings is: " + str);
        boolean balanced = true;
        int lastP = str.lastIndexOf('p');
        int lastQ = str.lastIndexOf('q');
        
        if (lastP != -1) {
            balanced = (lastQ > lastP);
        }
        System.out.println("The string is pq-balanced? " + balanced + "\n");
    }
}
