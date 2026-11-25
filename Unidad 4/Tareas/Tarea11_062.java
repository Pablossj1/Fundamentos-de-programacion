package com.w3resource.strings;

/**
 * Exercise 62: Contains "good" at Start
 * Write a Java program to read a string and return true if "good" appears starting at index 0 or 1.
 */
public class Tarea11_062 {
    public static void main(String[] args) {
        String str = "goodboy";
        System.out.println("The given strings is: " + str);
        
        boolean hasGood = false;
        if (str.startsWith("good") || (str.length() >= 5 && str.substring(1).startsWith("good"))) {
            hasGood = true;
        }
        System.out.println("The 'good' appear in the string is: " + hasGood);
    }
}
