package tarea05_ejercicio042;

import entrada.Entrada;
public class Tarea05_ejercicio042 {
    public static void main(String[] args) {
        int sueldo, sueldo_max = 0;
        int n;
        boolean primer_sueldo_asignado = false;

        System.out.print("Número de sueldos: ");
        n = Entrada.entero();

        System.out.println("---------");

        for (int i = 1; i <= n; i++) {
            System.out.print("Introduce sueldo: ");
            sueldo = Entrada.entero();

            if (!primer_sueldo_asignado) {
                sueldo_max = sueldo;
                primer_sueldo_asignado = true;
            }

            if (sueldo > sueldo_max) {
                sueldo_max = sueldo;
            }
        }

        System.out.println("\nEl sueldo máximo es: " + sueldo_max);
    }
}
