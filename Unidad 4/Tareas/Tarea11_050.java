package com.w3resource.strings;

/**
 * Exercise 50: Lexicographic Rank of String
 * Write a Java program to find the lexicographic rank of a given string.
 */
public class Tarea11_050 {
    public static void main(String[] args) {
        String str = "BDCA";
        System.out.println("The Given String is: " + str);
        System.out.println("The Lexicographic rank of the given string is: " + findRank(str));
    }
    
    static int fact(int n) {
        return (n <= 1) ? 1 : n * fact(n - 1);
    }
    
    static int findRank(String str) {
        int len = str.length();
        int rank = 1;
        for (int i = 0; i < len; i++) {
            int count = 0;
            for (int j = i + 1; j < len; j++) {
                if (str.charAt(j) < str.charAt(i)) {
                    count++;
                }
            }
            rank += count * fact(len - i - 1);
        }
        return rank;
    }
}
