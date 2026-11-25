package com.w3resource.strings;

/**
 * Exercise 98: Check Repeated Character at First Instance
 * Write a Java program to check whether the first instance of a given character is immediately followed by the same character.
 */
public class Tarea11_098 {
    public static void main(String[] args) {
        String str = "fizzez";
        char ch = 'z';
        System.out.println("The given string is: " + str);
        
        int idx = str.indexOf(ch);
        boolean result = false;
        if (idx != -1 && idx < str.length() - 1 && str.charAt(idx + 1) == ch) {
            result = true;
        }
        System.out.println("Is '" + ch + "' appear twice respectively? " + result);
    }
}
