package com.w3resource.strings;

/**
 * Exercise 90: Compare Count of Two Substrings
 * Write a Java program to check the number of times two substrings appear anywhere in a string.
 */
public class Tarea11_090 {
    public static void main(String[] args) {
        String str = "Thisisthethesis";
        System.out.println("The given string is: " + str);
        
        int countThe = count(str, "the");
        int countIs = count(str, "is");
        
        System.out.println("Are the appearance of 'the' and 'is' equal? " + (countThe == countIs));
    }
    
    static int count(String str, String sub) {
        int cnt = 0, idx = 0;
        while ((idx = str.indexOf(sub, idx)) != -1) {
            cnt++;
            idx++;
        }
        return cnt;
    }
}
