package com.w3resource.strings;

/**
 * Exercise 92: Remove All Instances of Substring
 * Write a Java program that returns a substring after removing all instances of remove string as given from the given main string.
 */
public class Tarea11_092 {
    public static void main(String[] args) {
        String mainStr = "This is the test string";
        String removeStr = "st";
        
        System.out.println("The main string is: " + mainStr);
        System.out.println("The removable string is: " + removeStr);
        
        String newStr = mainStr.replace(removeStr, "");
        System.out.println("The new string is: " + newStr);
    }
}
