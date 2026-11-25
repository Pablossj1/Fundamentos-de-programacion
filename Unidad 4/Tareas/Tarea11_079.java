package com.w3resource.strings;

/**
 * Exercise 79: Remove Middle Char in 'z?g' Pattern
 * Write a Java program to remove the 2nd character from the substring of length 3 starting with 'z' and ending with 'g'.
 */
public class Tarea11_079 {
    public static void main(String[] args) {
        String str = "zzgkitandkatcaketoket";
        System.out.println("The given string is: " + str);
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (i > 0 && i < str.length() - 1 && str.charAt(i - 1) == 'z' && str.charAt(i + 1) == 'g') {
                continue; // skip middle
            }
            sb.append(str.charAt(i));
        }
        System.out.println("The new string is: " + sb.toString());
    }
}
