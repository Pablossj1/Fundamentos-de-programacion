package com.w3resource.strings;

import java.util.*;

/**
 * Exercise 49: First Non-Repeating in Stream
 * Write a Java program to find the first non-repeating character from a stream of characters.
 */
public class Tarea11_049 {
    public static void main(String[] args) {
        String str = "godisgood";
        System.out.println("String: " + str);
        
        int[] count = new int[256];
        Queue<Character> queue = new LinkedList<>();
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            System.out.println("Reading: " + ch);
            count[ch]++;
            queue.add(ch);
            
            while (!queue.isEmpty() && count[queue.peek()] > 1) {
                queue.poll();
            }
            if (!queue.isEmpty()) {
                System.out.println("The first non-repeating character so far is:  " + queue.peek());
            }
        }
    }
}
