package tarea05_ejercicio044;

import entrada.Entrada;
public class Tarea05_ejercicio044 {
    public static void main(String[] args) {
        int notas;
        boolean suspensos = false;

        for (int i = 0; i < 5; i++) {
            System.out.print("Introduzca nota (de 0 a 10): ");
            notas = Entrada.entero();

            if (notas < 5) {
                suspensos = true;
            }
        }

        if (suspensos) {
            System.out.println("Hay alumnos suspensos");
        } else {
            System.out.println("No hay suspensos");
        }
    }
}
