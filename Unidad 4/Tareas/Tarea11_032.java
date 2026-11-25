package com.w3resource.strings;

/**
 * Exercise 32: Longest Palindromic Substring
 * Write a Java program to find the longest Palindromic Substring within a string.
 */
public class Tarea11_032 {
    public static void main(String[] args) {
        String str = "thequickbrownfoxxofnworbquickthe";
        System.out.println("The given string is: " + str);
        
        String longest = findLongestPalindrome(str);
        System.out.println("The longest palindrome substring in the given string is: " + longest);
        System.out.println("The length of the palindromic substring is: " + longest.length());
    }
    
    public static String findLongestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s, i, i + 1);
            int len = Math.max(len1, len2);
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }
    
    private static int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }
}
