package com.w3resource.strings;

/**
 * Exercise 77: Repeat String with Separator
 * Write a Java program to add a string with a specific number of times separated by a substring.
 */
public class Tarea11_077 {
    public static void main(String[] args) {
        String str = "try";
        String sep = "best";
        int times = 3;
        
        System.out.println("The given strings are: " + str + "  and  " + sep);
        System.out.println("Number to times to be repeat: " + times);
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < times; i++) {
            sb.append(str);
            if (i < times - 1) {
                sb.append(sep);
            }
        }
        System.out.println("The new string is: " + sb.toString());
    }
}
