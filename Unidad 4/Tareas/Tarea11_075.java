package com.w3resource.strings;

/**
 * Exercise 75: Substring Appears in Middle
 * Write a Java program to check whether a given substring appears in the middle of another string.
 */
public class Tarea11_075 {
    public static void main(String[] args) {
        checkAndPrint("xxxabcxxxxx", "abc");
        checkAndPrint("xxabcxxx", "abc");
    }
    
    static void checkAndPrint(String str, String sub) {
        System.out.println("The given string is: " + str);
        int idx = str.indexOf(sub);
        boolean inMiddle = false;
        while (idx != -1) {
            int left = idx;
            int right = str.length() - (idx + sub.length());
            if (Math.abs(left - right) <= 1) {
                inMiddle = true;
                break;
            }
            idx = str.indexOf(sub, idx + 1);
        }
        System.out.println("Is " + sub + " appear in middle? " + inMiddle + "\n");
    }
}
