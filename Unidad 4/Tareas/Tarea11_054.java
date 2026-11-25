package com.w3resource.strings;

import java.util.HashMap;
import java.util.Map;

/**
 * Exercise 54: Smallest Window Containing All Characters
 * Write a Java program to find the smallest window in a string containing all characters in another string.
 */
public class Tarea11_054 {
    public static void main(String[] args) {
        String str = "welcome to w3resource";
        String pat = "tower";
        
        System.out.println("The given string is: " + str);
        System.out.println("Characters to find in the main sring are: " + pat);
        
        String window = findSmallestWindow(str, pat);
        System.out.println("The smallest window which contains the finding characters is : " + window);
    }
    
    static String findSmallestWindow(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : t.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int count = map.size();
        int left = 0, minLen = Integer.MAX_VALUE, start = 0;
        
        for (int right = 0; right < s.length(); right++) {
            char rChar = s.charAt(right);
            if (map.containsKey(rChar)) {
                map.put(rChar, map.get(rChar) - 1);
                if (map.get(rChar) == 0) count--;
            }
            while (count == 0) {
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    start = left;
                }
                char lChar = s.charAt(left);
                if (map.containsKey(lChar)) {
                    map.put(lChar, map.get(lChar) + 1);
                    if (map.get(lChar) > 0) count++;
                }
                left++;
            }
        }
        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
    }
}
