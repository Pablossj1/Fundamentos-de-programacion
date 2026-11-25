package tarea05_ejercicio006;

import entrada.Entrada;
public class Tarea05_ejercicio006 {
    public static void main(String[] args) {
        int n1, n2;

        System.out.print("Introduce un número: ");
        n1 = Entrada.entero();
        System.out.print("Introduce otro número: ");
        n2 = Entrada.entero();

        if (n1 % n2 == 0) {
            System.out.println("Son múltiplos");
        } else {
            System.out.println("No son múltiplos");
        }
    }
}
