package com.w3resource.strings;

/**
 * Exercise 40: Divide String into Equal Parts
 * Write a Java program to divide a string into n equal parts.
 */
public class Tarea11_040 {
    public static void main(String[] args) {
        String str = "abcdefghijklmnopqrstuvwxy";
        int n = 5;
        System.out.println("The given string is: " + str);
        
        int str_size = str.length();
        int part_size;
        
        if (str_size % n != 0) {
            System.out.println("The size of this string is not divisible by " + n);
            return;
        } else {
            System.out.println("The string divided into " + n + " parts and they are: \n");
            part_size = str_size / n;
            for (int i = 0; i < str_size; i++) {
                if (i % part_size == 0 && i != 0) {
                    System.out.println();
                }
                System.out.print(str.charAt(i));
            }
            System.out.println();
        }
    }
}
