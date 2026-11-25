package tarea05_ejercicio032;

import entrada.Entrada;
public class Tarea05_ejercicio032 {
    public static void main(String[] args) {
        int num, suma_total;

        suma_total = 0;

        for (int i = 1; i <= 15; i++) {
            System.out.print("Introduzca número: ");
            num = Entrada.entero();
            suma_total = suma_total + num;
        }

        System.out.println("La suma total es de: " + suma_total);
    }
}
