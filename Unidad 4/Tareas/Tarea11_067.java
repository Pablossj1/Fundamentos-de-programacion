package com.w3resource.strings;

/**
 * Exercise 67: Remove Specified Start Characters
 * Write a Java program to read a string and remove the first two characters if one or both are equal to a specified character.
 */
public class Tarea11_067 {
    public static void main(String[] args) {
        char target = 'o';
        checkAndPrint("oocyte", target);
        checkAndPrint("boat", target);
        checkAndPrint("own", target);
    }
    
    static void checkAndPrint(String str, char c) {
        System.out.println("The given strings is: " + str);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (i < 2 && str.charAt(i) == c) {
                continue;
            }
            sb.append(str.charAt(i));
        }
        System.out.println("The new string is: " + sb.toString() + "\n");
    }
}
