package com.w3resource.strings;

/**
 * Exercise 111: Remove Specified Word from Text
 * Write a Java program that removes a specified word from given text. Return the updated string.
 */
public class Tarea11_111 {
    public static void main(String[] args) {
        String text = "Exercises Practice Solution";
        String word = "Solution";
        
        System.out.println("Input a string: \n " + text);
        System.out.println("Input a word to remove: \n " + word);
        
        String updated = text.replace(word, "").trim();
        System.out.println("New string, after removing the said word:\n" + updated);
    }
}
