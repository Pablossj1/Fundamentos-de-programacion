package com.w3resource.strings;

/**
 * Exercise 101: Check String Contains Only Digits
 * Write a Java program to test if a string contains only digits. Returns true or false.
 */
public class Tarea11_101 {
    public static void main(String[] args) {
        String str1 = "131231231231231231231231231212312312";
        String str2 = "13123123123Z1231231231231231212312312";
        
        System.out.println("First string:\n" + str1);
        System.out.println(str1.matches("\\d+") + "\n");
        
        System.out.println("Second string:\n" + str2);
        System.out.println(str2.matches("\\d+"));
    }
}
