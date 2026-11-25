package tarea05_ejercicio031;

import entrada.Entrada;
public class Tarea05_ejercicio031 {
    public static void main(String[] args) {
        // inicializamos la i a 100
        // mientras la i sea mayor o igual a 0
        // y en cada vuelta del for la i se decrementa en 7
        for (int i = 100; i >= 0; i -= 7) {
            System.out.println(i);
        }
        // el for al llevar una sola instrucción en su cuerpo de ejecución
        // no precisa de llaves { }
    }
}
