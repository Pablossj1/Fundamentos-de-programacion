package com.w3resource.strings;

/**
 * Exercise 102: Convert String to Number Types
 * Write a Java program to convert a given string to int, long, float and double.
 */
public class Tarea11_102 {
    public static void main(String[] args) {
        String strInt = "1323";
        int iVal = Integer.parseInt(strInt);
        Integer iObj = Integer.valueOf(strInt);
        System.out.println("Convert String to int/Integer:");
        System.out.println("\"" + strInt + "\" as int is " + iVal + " and as Integer is " + iObj + "\n");
        
        String strLong = "13625478965325";
        long lVal = Long.parseLong(strLong);
        Long lObj = Long.valueOf(strLong);
        System.out.println("Convert String to long/Long:");
        System.out.println("\"" + strLong + "\" as long is " + lVal + " and as Long is " + lObj + "\n");
        
        String strFloat = "25.135F";
        float fVal = Float.parseFloat(strFloat);
        Float fObj = Float.valueOf(strFloat);
        System.out.println("Convert String to float/Float:");
        System.out.println("\"" + strFloat + "\" as float is " + fVal + " and as Float is " + fObj + "\n");
        
        String strDouble = "21.25478254D";
        double dVal = Double.parseDouble(strDouble);
        Double dObj = Double.valueOf(strDouble);
        System.out.println("Convert String to double/Double:");
        System.out.println("\"" + strDouble + "\" as double is " + dVal + " and as Double is " + dObj);
    }
}
