package tarea05_ejercicio030;

import entrada.Entrada;
public class Tarea05_ejercicio030 {
    public static void main(String[] args) {
        int i, num;

        System.out.print("Introduce un número: ");
        num = Entrada.entero();

        i = 1;
        while (i <= num) {
            System.out.println(i);
            i++;
        }
    }
}
