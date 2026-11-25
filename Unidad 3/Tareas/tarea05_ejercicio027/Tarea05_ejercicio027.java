package tarea05_ejercicio027;

import entrada.Entrada;
public class Tarea05_ejercicio027 {
    public static void main(String[] args) {
        int n, num;

        System.out.print("Introduce N: ");
        n = Entrada.entero();

        System.out.print("Introduce número: ");
        num = Entrada.entero();

        while (num != n) { // mientras no coincidan ambos números
            if (num > n) {
                System.out.println("menor");
            } else {
                System.out.println("mayor");
            }
            System.out.print("Introduce número: ");
            num = Entrada.entero();
        }

        // al salir del mientras tenemos la certeza que num es igual a n
        System.out.println("acertaste...");
    }
}
