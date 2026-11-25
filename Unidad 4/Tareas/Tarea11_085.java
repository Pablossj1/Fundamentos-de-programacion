package com.w3resource.strings;

/**
 * Exercise 85: Chars Around Substring
 * Write a Java program to make up a string with each character before and after a substring.
 */
public class Tarea11_085 {
    public static void main(String[] args) {
        String str = "weablcoabmeab";
        String target = "ab";
        System.out.println("The given string are: " + str + "  and " + target);
        
        StringBuilder sb = new StringBuilder();
        int idx = 0;
        while ((idx = str.indexOf(target, idx)) != -1) {
            if (idx > 0) {
                sb.append(str.charAt(idx - 1));
            }
            if (idx + target.length() < str.length()) {
                sb.append(str.charAt(idx + target.length()));
            }
            idx += target.length();
        }
        System.out.println("The new string is: " + sb.toString());
    }
}
