package com.w3resource.strings;

/**
 * Exercise 59: Begins With Color String
 * Write a Java program to read a string. If the string begins with "red" or "black" return that color string, otherwise empty string.
 */
public class Tarea11_059 {
    public static void main(String[] args) {
        String str = "blacksea";
        System.out.println("The given strings is: " + str);
        
        String color = "";
        if (str.startsWith("red")) {
            color = "red";
        } else if (str.startsWith("black")) {
            color = "black";
        }
        System.out.println("The string begins with the color: " + color);
    }
}
