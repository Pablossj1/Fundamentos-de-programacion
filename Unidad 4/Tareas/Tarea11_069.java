package com.w3resource.strings;

/**
 * Exercise 69: Substring Between Two 'toast'
 * Write a Java program to return the substring that is between the first and last appearance of 'toast'.
 */
public class Tarea11_069 {
    public static void main(String[] args) {
        String str = "sweettoastbuttertoast";
        System.out.println("The given strings is: " + str);
        
        String target = "toast";
        int first = str.indexOf(target);
        int last = str.lastIndexOf(target);
        
        String res = "";
        if (first != -1 && last != -1 && first != last) {
            res = str.substring(first + target.length(), last);
        }
        System.out.println("The new string is: " + res);
    }
}
