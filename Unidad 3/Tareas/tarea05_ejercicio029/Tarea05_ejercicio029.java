package tarea05_ejercicio029;

import entrada.Entrada;
public class Tarea05_ejercicio029 {
    public static void main(String[] args) {
        int num, suma, elementos;
        float media; // la media puede tener decimales

        System.out.print("Introduzca un número: ");
        num = Entrada.entero();

        suma = 0;
        elementos = 0;

        while (num >= 0) { // nos interesan los positivos y el cero
            suma += num;
            elementos++;

            System.out.print("Introduzca otro número: ");
            num = Entrada.entero();
        }

        if (elementos == 0) {
            System.out.println("Imposible hacer la media");
        } else {
            media = (float) suma / elementos;
            System.out.println("La media es de: " + media);
        }
    }
}
