package tarea05_ejercicio036;

import entrada.Entrada;
public class Tarea05_ejercicio036 {
    public static void main(String[] args) {
        int sueldo;
        int suma = 0;
        int mayor_1000 = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Escribe un sueldo: ");
            sueldo = Entrada.entero();

            if (sueldo > 1000) {
                mayor_1000++;
            }
            suma = suma + sueldo;
        }

        System.out.println("Mayores de 1000 hay: " + mayor_1000);
        System.out.println("La suma es de: " + suma);
    }
}
