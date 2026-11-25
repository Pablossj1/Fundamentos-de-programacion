package tarea05_ejercicio041;

import entrada.Entrada;
public class Tarea05_ejercicio041 {
    public static void main(String[] args) {
        int nota;
        int aprobados = 0;
        int suspensos = 0;
        int condicionados = 0;

        for (int i = 1; i <= 6; i++) {
            System.out.print("Introduzca nota entre 0 y 10: ");
            nota = Entrada.entero();

            if (nota == 4) {
                condicionados++;
            } else if (nota >= 5) {
                aprobados++;
            } else if (nota < 4) {
                suspensos++;
            }
        }

        System.out.println("Aprobados: " + aprobados);
        System.out.println("Suspensos: " + suspensos);
        System.out.println("Condicionados: " + condicionados);
    }
}
