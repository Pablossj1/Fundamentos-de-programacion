package tarea05_ejercicio026;

import entrada.Entrada;
public class Tarea05_ejercicio026 {
    public static void main(String[] args) {
        int num, contador;

        System.out.print("Introduzca un número: ");
        num = Entrada.entero();

        contador = 0; // al comienzo el número de números introducidos es 0

        while (num > 0) { // mientras num sea positivo
            contador = contador + 1; // contador toma el valor que tuviera en este momento más uno

            System.out.print("Introduzca otro número: ");
            num = Entrada.entero();
        }

        System.out.println("Se han introducido: " + contador + " números");
    }
}
