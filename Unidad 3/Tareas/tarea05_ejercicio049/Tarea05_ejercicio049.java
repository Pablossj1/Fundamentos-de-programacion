package tarea05_ejercicio049;

import entrada.Entrada;
public class Tarea05_ejercicio049 {
    public static void main(String[] args) {
        int n; // tamaño del lado
        int fila, col;
        System.out.print ("Lado del cuadrado: ");
        n = Entrada.entero();
        for (fila=1; fila<=n; fila++)
        {
            for (col=1; col<=n; col++)
                System.out.print ("* ");
            System.out.println ("");
        }
    }
}