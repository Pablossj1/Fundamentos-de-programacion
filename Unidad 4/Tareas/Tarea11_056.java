package com.w3resource.strings;

/**
 * Exercise 56: Append Strings Without Double Characters
 * Write a Java program that appends two strings, omitting one character if the concatenation creates double characters.
 */
public class Tarea11_056 {
    public static void main(String[] args) {
        String str1 = "food";
        String str2 = "door";
        System.out.println("The given strings are: " + str1 + "  and  " + str2);
        
        StringBuilder sb = new StringBuilder(str1);
        if (str1.length() > 0 && str2.length() > 0 && str1.charAt(str1.length() - 1) == str2.charAt(0)) {
            sb.append(str2.substring(1));
        } else {
            sb.append(str2);
        }
        System.out.println("The string after concatination are: " + sb.toString());
    }
}
