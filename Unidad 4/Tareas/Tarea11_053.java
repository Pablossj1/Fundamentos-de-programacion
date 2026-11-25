package com.w3resource.strings;

/**
 * Exercise 53: Match Strings with Wildcards
 * Write a Java program to match two strings where one string contains wildcard characters.
 */
public class Tarea11_053 {
    public static void main(String[] args) {
        String str = "abcdhgh";
        String pattern = "abc*d?*";
        
        System.out.println("The given string is: " + str);
        System.out.println("The given pattern string is: " + pattern);
        
        if (match(str, pattern, 0, 0)) {
            System.out.println("The given pattern is matching.");
        } else {
            System.out.println("The given pattern is not matching.");
        }
    }
    
    static boolean match(String str, String pat, int s, int p) {
        if (s == str.length() && p == pat.length()) return true;
        if (p < pat.length() && pat.charAt(p) == '*' && s == str.length()) return match(str, pat, s, p + 1);
        if (s == str.length() || p == pat.length()) return false;
        
        if (pat.charAt(p) == '?' || str.charAt(s) == pat.charAt(p)) {
            return match(str, pat, s + 1, p + 1);
        }
        if (pat.charAt(p) == '*') {
            return match(str, pat, s + 1, p) || match(str, pat, s, p + 1);
        }
        return false;
    }
}
