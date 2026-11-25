package com.w3resource.strings;

/**
 * Exercise 19: Get Index of Alphabet Characters
 * Write a Java program to get the index of all the characters of the alphabet.
 */
public class Tarea11_019 {
    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog.";
        
        System.out.println("a  b c  d e  f  g h i  j");
        System.out.println("=========================");
        System.out.printf("%d %d %d %d %d %d %d %d %d %d%n%n",
            str.indexOf('a'), str.indexOf('b'), str.indexOf('c'), str.indexOf('d'),
            str.indexOf('e'), str.indexOf('f'), str.indexOf('g'), str.indexOf('h'),
            str.indexOf('i'), str.indexOf('j'));
            
        System.out.println("k  l  m  n  o  p q  r  s  t");
        System.out.println("===========================");
        System.out.printf("%d %d %d %d %d %d %d %d %d %d%n%n",
            str.indexOf('k'), str.indexOf('l'), str.indexOf('m'), str.indexOf('n'),
            str.indexOf('o'), str.indexOf('p'), str.indexOf('q'), str.indexOf('r'),
            str.indexOf('s'), str.indexOf('t'));
            
        System.out.println("u  v  w  x  y  z");
        System.out.println("================");
        System.out.printf("%d %d %d %d %d %d%n",
            str.indexOf('u'), str.indexOf('v'), str.indexOf('w'),
            str.indexOf('x'), str.indexOf('y'), str.indexOf('z'));
    }
}
