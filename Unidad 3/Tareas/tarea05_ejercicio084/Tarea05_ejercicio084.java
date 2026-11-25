package tarea05_ejercicio084;

import entrada.Entrada;
public class Tarea05_ejercicio084 {
    
    static void doble(int num)
    {
   
        int doble;
        doble=2*num; // calculamos el doble de num
        System.out.println("El doble es: " +doble);
    }
    public static void main(String[] args) {
        int num;
        System.out.print("Introduzca un número: ");
        num=Entrada.entero();
        doble(num);
    }
}