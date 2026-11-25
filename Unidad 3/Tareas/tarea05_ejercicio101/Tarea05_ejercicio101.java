package tarea05_ejercicio101;

import entrada.Entrada;
public class Tarea05_ejercicio101 {
    static double distancia_euclidea (int x1, int y1, int x2, int y2)
    {
        // aquí no hay más que tirar de la fórmula de la distancia euclídea
        // y desempolvarla de los apuntes
        return (Math.sqrt( Math.pow (x1-x2, 2) + Math.pow (y1-y2, 2)));
    }
    public static void main(String[] args) {
        int x1, y1;    // primer punto
        int x2, y2;    // el otro punto
        double l;         // distancia euclídea
        System.out.println("Punto 1");
        System.out.print("x: ");
        x1 = Entrada.entero();
        System.out.print("y: ");
        y1 = Entrada.entero();
        System.out.println("\nPunto 2");
        System.out.print("x: ");
        x2 = Entrada.entero();
        System.out.print("y: ");
        y2 = Entrada.entero();
        l =distancia_euclidea (x1,y1, x2,y2);
   
        System.out.println("\nDistancia euclídea: " +l);
       
    }
}