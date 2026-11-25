package com.w3resource.strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Exercise 89: Sum Numbers in String
 * Write a Java program to calculate the sum of the numbers that appear in a given string.
 */
public class Tarea11_089 {
    public static void main(String[] args) {
        String str = "it 15 is25 a 20string";
        System.out.println("The given string is: " + str);
        
        int sum = 0;
        Matcher m = Pattern.compile("\\d+").matcher(str);
        while (m.find()) {
            sum += Integer.parseInt(m.group());
        }
        System.out.println("The sum of numbers in the string is: " + sum);
    }
}
