package tarea05_ejercicio024;

import entrada.Entrada;
public class Tarea05_ejercicio024 {
    public static void main(String[] args) {
        int num;

        System.out.print("Introduzca un número: ");
        num = Entrada.entero();

        while (num != 0) { // mientras num sea distinto de 0
            if (num > 0) {
                System.out.println("Positivo");
            } else {
                System.out.println("Negativo");
            }
            System.out.print("Introduzca otro número: ");
            num = Entrada.entero();
        }
        // al salir del mientras tenemos la certeza que num es 0
    }
}
