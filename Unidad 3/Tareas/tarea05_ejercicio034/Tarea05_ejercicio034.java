package tarea05_ejercicio034;

import entrada.Entrada;
public class Tarea05_ejercicio034 {
    public static void main(String[] args) {
        double factorial;
        int num;

        System.out.print("Introduce un número: ");
        num = Entrada.entero();

        factorial = 1; // es importante inicializarlo a 1, ya que multiplicará

        for (int i = num; i > 0; i--) {
            factorial = factorial * i;
        }

        System.out.println("El factorial de " + num + " es: " + factorial);
    }
}
