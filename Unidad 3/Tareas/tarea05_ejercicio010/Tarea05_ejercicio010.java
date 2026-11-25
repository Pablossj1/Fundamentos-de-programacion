package tarea05_ejercicio010;

import entrada.Entrada;
public class Tarea05_ejercicio010 {
    public static void main(String[] args) {
        int a, b, c;

        System.out.print("Introduzca primer número: ");
        a = Entrada.entero();
        System.out.print("Introduzca segundo número: ");
        b = Entrada.entero();
        System.out.print("Introduzca tercer número: ");
        c = Entrada.entero();

        if (a > b && b > c) {
            System.out.println(a + ", " + b + ", " + c);
        } else if (a > c && c > b) {
            System.out.println(a + ", " + c + ", " + b);
        } else if (b > a && a > c) {
            System.out.println(b + ", " + a + ", " + c);
        } else if (b > c && c > a) {
            System.out.println(b + ", " + c + ", " + a);
        } else if (c > a && a > b) {
            System.out.println(c + ", " + a + ", " + b);
        } else if (c > b && b > a) {
            System.out.println(c + ", " + b + ", " + a);
        }
    }
}
