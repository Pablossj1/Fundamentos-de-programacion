package com.w3resource.strings;

/**
 * Exercise 88: Replace 'is' with 'is not'
 * Write a Java program to return a string where every appearance of the lowercase word 'is' has been replaced with 'is not'.
 */
public class Tarea11_088 {
    public static void main(String[] args) {
        String str = "it is a string";
        System.out.println("The given string is: " + str);
        
        String res = str.replaceAll("\\bis\\b", "is not");
        System.out.println("The new string is: " + res);
    }
}
