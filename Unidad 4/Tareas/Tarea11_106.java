package com.w3resource.strings;

/**
 * Exercise 106: Repeat String N Times
 * Write a Java program to concatenate a given string with itself a given number of times.
 */
public class Tarea11_106 {
    public static void main(String[] args) {
        String str = "PHP";
        int times = 7;
        
        System.out.println("Original string: " + str + "\n");
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < times; i++) {
            sb.append(str);
        }
        System.out.println("After repeating " + times + " times: " + sb.toString());
    }
}
