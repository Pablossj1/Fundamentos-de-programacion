package com.w3resource.strings;

/**
 * Exercise 80: Check Char Surrounded by Same Char
 * Write a Java program to check whether the character immediately before and after '#' is the same.
 */
public class Tarea11_080 {
    public static void main(String[] args) {
        checkAndPrint("moon#night");
        checkAndPrint("bat##ball");
        checkAndPrint("#moon#night");
    }
    
    static void checkAndPrint(String str) {
        System.out.println("The given string is: " + str);
        boolean same = true;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '#') {
                if (i == 0 || i == str.length() - 1) {
                    continue;
                }
                if (str.charAt(i - 1) != str.charAt(i + 1)) {
                    same = false;
                    break;
                }
            }
        }
        System.out.println("The before and after character are same: " + same + "\n");
    }
}
