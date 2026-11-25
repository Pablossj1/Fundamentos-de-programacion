package tarea05_ejercicio046;

import entrada.Entrada;
/**
 * Boletín 3 - Ejercicio 1: Traza a programa con bucles anidados.
 * 
 * PROGRAMA ej_1
 * VARIABLES
 *   suma, i, j: ENTERO
 * COMIENZO
 *   PARA i <- 1 HASTA 4
 *     PARA j <- 3 HASTA 0 INC -1
 *       suma <- i*10+j
 *       escribir (suma)
 *     FIN PARA
 *   FIN PARA
 * FIN
 */
public class Tarea05_ejercicio046 {
    public static void main(String[] args) {
        int suma, i, j;

        for (i = 1; i <= 4; i++) {
            for (j = 3; j >= 0; j--) {
                suma = i * 10 + j;
                System.out.println("i=" + i + ", j=" + j + " -> suma=" + suma);
            }
        }
    }
}
