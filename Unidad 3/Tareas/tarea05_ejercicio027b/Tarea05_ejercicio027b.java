package tarea05_ejercicio027b;

import entrada.Entrada;
/**
 * 5b. Juego de adivinar número con número aleatorio entre 1 y 100.
 */
public class Tarea05_ejercicio027b {
    public static void main(String[] args) {
        int n, num;

        n = (int) (Math.random() * 100) + 1;
        // Así el juego es algo más entretenido.

        System.out.print("Introduce número: ");
        num = Entrada.entero();

        while (num != n) {
            if (num > n) {
                System.out.println("menor");
            } else {
                System.out.println("mayor");
            }
            System.out.print("Introduce número: ");
            num = Entrada.entero();
        }

        System.out.println("acertaste...");
    }
}
