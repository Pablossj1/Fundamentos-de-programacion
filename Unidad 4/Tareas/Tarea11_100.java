package com.w3resource.strings;

/**
 * Exercise 100: Check Substring Presence
 * Write a Java program to check if a given string contains another string. Returns true or false.
 */
public class Tarea11_100 {
    public static void main(String[] args) {
        String original = "Java is the foundation for virtually every type of networked application and is the global standard for developing and  delivering embedded and mobile applications, games, Web-based content,  and enterprise software. With more than 9 million developers worldwide, Java enables you to efficiently develop, deploy and use exciting applications and services.";
        System.out.println("Original string:\n" + original + "\n");
        
        String word1 = "million";
        String word2 = "millions";
        
        System.out.println("Is '" + word1 + "' present in the said text?");
        System.out.println(original.contains(word1) + "\n");
        
        System.out.println("Is '" + word2 + "' present in the said text?");
        System.out.println(original.contains(word2));
    }
}
