package com.w3resource.strings;

import java.util.ArrayList;
import java.util.List;

/**
 * Exercise 37: Longest Substring Without Repeats
 * Write a Java program to find the length of the longest substring of a given string without repeating characters.
 */
public class Tarea11_037 {
    public static void main(String[] args) {
        String str = "pickoutthelongestsubstring";
        System.out.println("Input String : " + str);
        
        String longest = "";
        for (int i = 0; i < str.length(); i++) {
            boolean[] visited = new boolean[256];
            StringBuilder current = new StringBuilder();
            for (int j = i; j < str.length(); j++) {
                char ch = str.charAt(j);
                if (visited[ch]) break;
                visited[ch] = true;
                current.append(ch);
            }
            if (current.length() > longest.length()) {
                longest = current.toString();
            }
        }
        
        List<Character> charList = new ArrayList<>();
        for (char c : longest.toCharArray()) {
            charList.add(c);
        }
        
        System.out.println("The longest substring : " + charList);
        System.out.println("The longest Substring Length : " + longest.length());
    }
}
