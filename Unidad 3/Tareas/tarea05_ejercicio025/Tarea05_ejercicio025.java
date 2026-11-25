package tarea05_ejercicio025;

import entrada.Entrada;
public class Tarea05_ejercicio025 {
    public static void main(String[] args) {
        int num;

        System.out.print("Introduzca un número: ");
        num = Entrada.entero();

        while (num != 0) { // mientras num sea distinto de 0
            if (num % 2 == 0) {
                System.out.println("Par");
            } else {
                System.out.println("Impar");
            }
            System.out.print("Introduzca otro número: ");
            num = Entrada.entero();
        }
        // al salir del mientras tenemos la certeza que num es 0
    }
}
