package tarea05_ejercicio053;

import entrada.Entrada;
public class Tarea05_ejercicio053 {
    public static void main(String[] args) {
        int t[]=new int[5];
        
        for (int i=0;i<5;i++)
        {
            System.out.print("Introduzca un número: ");
            t[i]=Entrada.entero();
        }
        
        System.out.println("Los números (en orden inverso):");
        for (int i=4;i>=0;i--) 
            System.out.println(t[i]);
   }
}