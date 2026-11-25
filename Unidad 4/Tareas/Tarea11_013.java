package com.w3resource.strings;

/**
 * Exercise 13: Equals Two Strings
 * Write a Java program to check whether two String objects contain the same data.
 */
public class Tarea11_013 {
    public static void main(String[] args) {
        String columnist1 = "Stephen Edwin King";
        String columnist2 = "Walter Winchell";
        String columnist3 = "Mike Royko";
        
        System.out.println("\"" + columnist1 + "\" equals \"" + columnist2 + "\"? " + columnist1.equals(columnist2));
        System.out.println("\"" + columnist1 + "\" equals \"" + columnist3 + "\"? " + columnist1.equals(columnist3));
    }
}
