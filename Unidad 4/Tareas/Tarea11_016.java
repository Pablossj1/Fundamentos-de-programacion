package com.w3resource.strings;

/**
 * Exercise 16: Get Byte Array from String
 * Write a Java program to get the contents of a given string as a byte array.
 */
public class Tarea11_016 {
    public static void main(String[] args) {
        String str = "This is a sample String.";
        byte[] byte_arr = str.getBytes();
        String new_str = new String(byte_arr);
        System.out.println("The new String equals " + new_str);
    }
}
