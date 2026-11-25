package com.w3resource.strings;

import java.util.*;

/**
 * Exercise 47: Rearrange String with Distance
 * Write a Java program to rearrange a string so that the same characters are positioned a distance away.
 */
public class Tarea11_047 {
    public static void main(String[] args) {
        String str = "accessories";
        System.out.println("The given string is: " + str);
        System.out.println("The string after arrange newly is: ");
        System.out.println(rearrange(str));
    }
    
    static String rearrange(String s) {
        Map<Character, Integer> freq = new HashMap<>();
        for (char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<>(
            (a, b) -> b.getValue().compareTo(a.getValue())
        );
        pq.addAll(freq.entrySet());
        
        Queue<Map.Entry<Character, Integer>> waitQueue = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        
        while (!pq.isEmpty()) {
            Map.Entry<Character, Integer> current = pq.poll();
            sb.append(current.getKey());
            current.setValue(current.getValue() - 1);
            waitQueue.offer(current);
            
            if (waitQueue.size() >= 2) {
                Map.Entry<Character, Integer> front = waitQueue.poll();
                if (front.getValue() > 0) {
                    pq.offer(front);
                }
            }
        }
        return sb.length() == s.length() ? sb.toString() : s;
    }
}
