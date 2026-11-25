package com.w3resource.strings;

/**
 * Exercise 112: Check If Letters of One String Exist in Another
 * Write a Java program that checks the letters of the second string are present in the first string. Return true otherwise false.
 */
public class Tarea11_112 {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = "Ja";
        
        System.out.println("Input the first string: \n " + str1);
        System.out.println("Input the second string: \n " + str2);
        
        boolean allPresent = true;
        for (int i = 0; i < str2.length(); i++) {
            if (str1.indexOf(str2.charAt(i)) == -1) {
                allPresent = false;
                break;
            }
        }
        System.out.println("Check first string contains letters from the second string:\n" + allPresent);
    }
}
