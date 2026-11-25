package com.w3resource.strings;

import java.util.Calendar;

/**
 * Exercise 15: Print Current Date and Time
 * Write a Java program to print the current date and time in the specified format.
 */
public class Tarea11_015 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println("Current Date and Time :");
        System.out.format("%tB %te, %tY%n", c, c, c);
        System.out.format("%tl:%tM %tp%n", c, c, c);
    }
}
