package com.w3resource.strings;

/**
 * Exercise 109: Reverse Odd-Length Words
 * Write a Java program that reverses all odd-length words in a string.
 */
public class Tarea11_109 {
    public static void main(String[] args) {
        test("Check two consecutive identical letters in a given string");
        test("Create a Date object using the Calendar class");
    }
    
    static void test(String text) {
        System.out.println("Original text: " + text + "\n");
        String[] words = text.split(" ");
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() % 2 != 0) {
                result.append(new StringBuilder(words[i]).reverse().toString());
            } else {
                result.append(words[i]);
            }
            if (i < words.length - 1) result.append(" ");
        }
        System.out.println("Reverses the words in the string that have odd lengths:");
        System.out.println(result.toString() + "\n");
    }
}
