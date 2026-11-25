package com.w3resource.strings;

/**
 * Exercise 95: Sum of Digits in String
 * Write a Java program to return the sum of the digits present in the given string. In the absence of digits, the sum is 0.
 */
public class Tarea11_095 {
    public static void main(String[] args) {
        String str = "ab5c2d4ef12s";
        System.out.println("The given string is: " + str);
        
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isDigit(c)) {
                sum += Character.getNumericValue(c);
            }
        }
        System.out.println("The sum of the digits in the string is: " + sum);
    }
}
