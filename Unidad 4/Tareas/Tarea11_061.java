package com.w3resource.strings;

/**
 * Exercise 61: Substring from First and Last N Chars
 * Write a Java program to create a new string taking specified number of characters from first and last position of a given string.
 */
public class Tarea11_061 {
    public static void main(String[] args) {
        String str = "Welcome";
        int n = 3;
        System.out.println("The given strings is: " + str);
        System.out.println("The given numbers is: " + n);
        
        String front = str.substring(0, n);
        String back = str.substring(str.length() - n);
        System.out.println("The new string is: " + front + back);
    }
}
