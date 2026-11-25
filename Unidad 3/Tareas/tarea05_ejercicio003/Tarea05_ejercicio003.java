package tarea05_ejercicio003;

import entrada.Entrada;
public class Tarea05_ejercicio003 {
    public static void main(String[] args) {
        double l, r; // longitud y radio

        System.out.print("Introduce el radio de una circunferencia: ");
        r = Entrada.real();

        l = 2 * Math.PI * r;

        System.out.println("La longitud de una circunferencia de radio " + r + " es: " + l);
    }
}
