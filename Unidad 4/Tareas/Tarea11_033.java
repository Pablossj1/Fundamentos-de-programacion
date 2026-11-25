package com.w3resource.strings;

import java.util.HashSet;
import java.util.Set;

/**
 * Exercise 33: All Interleavings of Strings
 * Write a Java program to find all interleavings of given strings.
 */
public class Tarea11_033 {
    public static void main(String[] args) {
        String str1 = "WX";
        String str2 = "YZ";
        System.out.println("The given strings are: " + str1 + " " + str2);
        System.out.println("The interleavings strings are: ");
        
        Set<String> out = new HashSet<>();
        allInterleavings("", str1, str2, out);
        for (String s : out) {
            System.out.println(s);
        }
    }
    
    static void allInterleavings(String res, String s1, String s2, Set<String> out) {
        if (s1.length() == 0 && s2.length() == 0) {
            out.add(res);
            return;
        }
        if (s1.length() > 0) {
            allInterleavings(res + s1.charAt(0), s1.substring(1), s2, out);
        }
        if (s2.length() > 0) {
            allInterleavings(res + s2.charAt(0), s1, s2.substring(1), out);
        }
    }
}
