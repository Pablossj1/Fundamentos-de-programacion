package com.w3resource.strings;

/**
 * Exercise 21: Last Index of Character
 * Write a Java program to get the last index of a string within a string.
 */
public class Tarea11_021 {
    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog.";
        
        System.out.println("a  b c  d  e  f  g  h i  j");
        System.out.println("===========================");
        System.out.printf("%d %d %d %d %d %d %d %d %d %d%n%n",
            str.lastIndexOf('a'), str.lastIndexOf('b'), str.lastIndexOf('c'), str.lastIndexOf('d'),
            str.lastIndexOf('e'), str.lastIndexOf('f'), str.lastIndexOf('g'), str.lastIndexOf('h'),
            str.lastIndexOf('i'), str.lastIndexOf('j'));
            
        System.out.println("k  l  m  n  o  p q  r  s  t");
        System.out.println("===========================");
        System.out.printf("%d %d %d %d %d %d %d %d %d %d%n%n",
            str.lastIndexOf('k'), str.lastIndexOf('l'), str.lastIndexOf('m'), str.lastIndexOf('n'),
            str.lastIndexOf('o'), str.lastIndexOf('p'), str.lastIndexOf('q'), str.lastIndexOf('r'),
            str.lastIndexOf('s'), str.lastIndexOf('t'));
            
        System.out.println(" u  v  w  x  y  z");
        System.out.println("=================");
        System.out.printf("%d %d %d %d %d %d%n",
            str.lastIndexOf('u'), str.lastIndexOf('v'), str.lastIndexOf('w'),
            str.lastIndexOf('x'), str.lastIndexOf('y'), str.lastIndexOf('z'));
    }
}
