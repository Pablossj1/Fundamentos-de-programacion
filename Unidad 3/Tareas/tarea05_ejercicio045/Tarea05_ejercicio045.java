package tarea05_ejercicio045;

import entrada.Entrada;
public class Tarea05_ejercicio045 {
    public static void main(String[] args) {
        int num;
        boolean multiplo_3 = false;

        for (int i = 0; i < 5; i++) {
            System.out.print("Introduzca número: ");
            num = Entrada.entero();

            if (num % 3 == 0) {
                multiplo_3 = true;
            }
        }

        if (!multiplo_3) {
            System.out.println("No existen múltiplos de 3");
        } else {
            System.out.println("Hay múltiplos de 3");
        }
    }
}
