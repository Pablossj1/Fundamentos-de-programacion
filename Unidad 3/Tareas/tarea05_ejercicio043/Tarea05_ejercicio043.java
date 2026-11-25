package tarea05_ejercicio043;

import entrada.Entrada;
public class Tarea05_ejercicio043 {
    public static void main(String[] args) {
        int num;
        boolean hay_negativo = false;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Introduce número: ");
            num = Entrada.entero();

            if (num < 0) {
                hay_negativo = true;
            }
        }

        if (hay_negativo) {
            System.out.println("Se ha introducido algún número negativo");
        } else {
            System.out.println("No hay ningún número negativo");
        }
    }
}
