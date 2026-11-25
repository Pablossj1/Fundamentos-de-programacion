package com.w3resource.strings;

/**
 * Exercise 52: Check String Rotation
 * Write a Java program to check if two given strings are rotations of each other.
 */
public class Tarea11_052 {
    public static void main(String[] args) {
        String str1 = "ABACD";
        String str2 = "CDABA";
        
        System.out.println("The given strings are: " + str1 + "  and  " + str2 + "\n");
        String concat = str1 + str1;
        System.out.println("The concatination of 1st string twice is: " + concat);
        
        if (str1.length() == str2.length() && concat.contains(str2)) {
            System.out.println("The 2nd string " + str2 + "  exists in the new string.\n");
            System.out.println("Strings are rotations of each other");
        } else {
            System.out.println("Strings are not rotations of each other");
        }
    }
}
