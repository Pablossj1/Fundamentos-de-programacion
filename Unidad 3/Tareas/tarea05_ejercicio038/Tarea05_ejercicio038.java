package tarea05_ejercicio038;

import entrada.Entrada;
public class Tarea05_ejercicio038 {
    public static void main(String[] args) {
        int num;

        do {
            System.out.print("Introduce número (de 0 a 10): ");
            num = Entrada.entero();
        } while (!(0 <= num && num <= 10));

        System.out.println("\nTabla del " + num);

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}
