package tarea05_ejercicio016;

import entrada.Entrada;
public class Tarea05_ejercicio016 {
    public static void main(String[] args) {
        int dia, mes, año;

        System.out.print("Introduzca día: ");
        dia = Entrada.entero();
        System.out.print("Introduzca mes: ");
        mes = Entrada.entero();
        System.out.print("Introduzca año: ");
        año = Entrada.entero();

        // el único año que no existe es el 0
        if (año == 0) {
            System.out.println("Fecha incorrecta");
        } else {
            if (mes == 2 && (dia >= 1 && dia <= 28)) {
                System.out.println(dia + "/" + mes + "/" + año + ": Fecha correcta");
            } else {
                if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && (dia >= 1 && dia <= 30)) {
                    System.out.println(dia + "/" + mes + "/" + año + ": Fecha correcta");
                } else {
                    if ((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) && (dia >= 1 && dia <= 31)) {
                        System.out.println(dia + "/" + mes + "/" + año + ": Fecha correcta");
                    } else {
                        System.out.println("Fecha incorrecta");
                    }
                }
            }
        }
    }
}
