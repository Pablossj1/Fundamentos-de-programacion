package com.w3resource.strings;

/**
 * Exercise 73: Substring Before Period
 * Write a Java program to check whether a substring appears before a period (.) within a given string.
 */
public class Tarea11_073 {
    public static void main(String[] args) {
        checkAndPrint("testabc.test", "abc");
        checkAndPrint("test.abctest", "abc");
    }
    
    static void checkAndPrint(String str, String sub) {
        System.out.println("The given strings is: " + str);
        int dot = str.indexOf('.');
        boolean result = false;
        if (dot != -1) {
            String beforeDot = str.substring(0, dot);
            result = beforeDot.endsWith(sub);
        }
        System.out.println("Is '" + sub + "' appear before period? " + result + "\n");
    }
}
