package tarea05_ejercicio028;

import entrada.Entrada;
public class Tarea05_ejercicio028 {
    public static void main(String[] args) {
        int num, suma;
        suma = 0;

        do {
            System.out.print("Introduzca un número: ");
            num = Entrada.entero();
            suma = suma + num;
        } while (num != 0);

        System.out.println("La suma de todos los números es: " + suma);
    }
}
