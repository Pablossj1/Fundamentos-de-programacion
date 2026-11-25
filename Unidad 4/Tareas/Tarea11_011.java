package com.w3resource.strings;

/**
 * Exercise 11: String from Character Array
 * Write a Java program to create a String object with a character array.
 */
public class Tarea11_011 {
    public static void main(String[] args) {
        char[] arr_num = new char[] { 'T', 'h', 'e', ' ', 'b', 'o', 'o', 'k', ' ', 'c', 'o', 'n', 't', 'a', 'i', 'n', 's', ' ', '2', '3', '4', ' ', 'p', 'a', 'g', 'e', 's', '.' };
        String str = String.copyValueOf(arr_num, 0, arr_num.length);
        System.out.println(str);
    }
}
