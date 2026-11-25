package tarea05_ejercicio023;

import entrada.Entrada;
public class Tarea05_ejercicio023 {
    public static void main(String[] args) {
        int num, cuadrado;

        System.out.print("Introduzca número: ");
        num = Entrada.entero();

        while (num >= 0) { // repetimos el proceso mientras el número leído no sea negativo
            cuadrado = num * num;
            System.out.println(num + " al cuadrado es igual a " + cuadrado);
            System.out.print("Introduzca otro número: ");
            num = Entrada.entero(); // volvemos a leer num
        }
    }
}
