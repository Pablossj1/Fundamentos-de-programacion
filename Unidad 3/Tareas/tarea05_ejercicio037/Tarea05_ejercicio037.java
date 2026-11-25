package tarea05_ejercicio037;

import entrada.Entrada;
public class Tarea05_ejercicio037 {
    public static void main(String[] args) {
        int edad;
        int media_edad, suma_edad = 0;
        int mayor_edad = 0, mayor_175 = 0;
        double altura;
        double media_altura, suma_alt = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Alumno " + i);
            System.out.print("Introduzca edad: ");
            edad = Entrada.entero();
            System.out.print("Introduzca altura: ");
            altura = Entrada.real();

            if (edad > 18) {
                mayor_edad++;
            }
            if (altura > 1.75) {
                mayor_175++;
            }

            suma_edad = suma_edad + edad;
            suma_alt = suma_alt + altura;
        }

        media_edad = suma_edad / 5;
        media_altura = suma_alt / 5;

        System.out.println("\nLa edad media es de: " + media_edad);
        System.out.println("La altura media es de: " + media_altura);
        System.out.println("Mayor de 18 años: " + mayor_edad);
        System.out.println("Mayor de 1.75: " + mayor_175);
    }
}
