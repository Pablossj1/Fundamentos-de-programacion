package com.w3resource.strings;

/**
 * Exercise 14: Equals Ignore Case
 * Write a Java program to compare a given string to another string, ignoring case considerations.
 */
public class Tarea11_014 {
    public static void main(String[] args) {
        String columnist1 = "Stephen Edwin King";
        String columnist2 = "Walter Winchell";
        String columnist3 = "stephen edwin king";
        
        System.out.println("\"" + columnist1 + "\" equals \"" + columnist2 + "\"? " + columnist1.equalsIgnoreCase(columnist2));
        System.out.println("\"" + columnist1 + "\" equals \"" + columnist3 + "\"? " + columnist1.equalsIgnoreCase(columnist3));
    }
}
