package tarea05_ejercicio014b;

import entrada.Entrada;
/**
 * 14b. Pedir una nota de 0 a 10 y mostrarla usando switch.
 */
public class Tarea05_ejercicio014b {
    public static void main(String[] args) {
        int nota;

        System.out.print("Introduzca una nota: ");
        nota = Entrada.entero();

        switch (nota) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("INSUFICIENTE");
                break;
            case 5:
                System.out.println("SUFICIENTE");
                break;
            case 6:
                System.out.println("BIEN");
                break;
            case 7:
            case 8:
                System.out.println("NOTABLE");
                break;
            case 9:
            case 10:
                System.out.println("SOBRESALIENTE");
                break;
            default:
                System.out.println("ERROR");
                break;
        }
    }
}
