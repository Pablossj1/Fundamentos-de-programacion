package com.w3resource.strings;

/**
 * Exercise 20: Get Canonical Representation
 * Write a Java program to get the Canonical representation of the string object.
 */
public class Tarea11_020 {
    public static void main(String[] args) {
        String str1 = "Java Exercises";
        String str2 = new StringBuffer("Java").append(" Exercises").toString();
        String str3 = str2.intern();
        
        System.out.println("str1 == str2? " + (str1 == str2));
        System.out.println("str1 == str3? " + (str1 == str3));
    }
}
