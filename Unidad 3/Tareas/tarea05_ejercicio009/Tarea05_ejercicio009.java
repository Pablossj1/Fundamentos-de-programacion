package tarea05_ejercicio009;

import entrada.Entrada;
public class Tarea05_ejercicio009 {
    public static void main(String[] args) {
        int n1, n2;

        System.out.print("Introduce un número: ");
        n1 = Entrada.entero();
        System.out.print("Introduce otro número: ");
        n2 = Entrada.entero();

        if (n1 > n2) {
            System.out.println(n1 + " y " + n2);
        } else {
            System.out.println(n2 + " y " + n1);
        }
    }
}
