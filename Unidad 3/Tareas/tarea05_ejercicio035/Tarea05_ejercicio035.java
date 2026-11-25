package tarea05_ejercicio035;

import entrada.Entrada;
public class Tarea05_ejercicio035 {
    public static void main(String[] args) {
        int num;
        int cont_ceros = 0; // el contador de ceros
        int cont_pos = 0;   // contador de positivos
        int cont_neg = 0;   // contador de negativos
        int suma_pos = 0;   // suma de los números positivos
        int suma_neg = 0;   // suma de los números negativos
        float media_pos, media_neg; // las medias positivas y negativas pueden tener decimales

        for (int i = 1; i <= 10; i++) {
            System.out.print("Introduce número: ");
            num = Entrada.entero();

            if (num == 0) {
                cont_ceros++;
            } else if (num > 0) {
                cont_pos++;
                suma_pos += num;
            } else {
                cont_neg++;
                suma_neg += num;
            }
        }

        // tratamos los ceros
        System.out.println("El número de ceros introducidos es de: " + cont_ceros);

        // tratamos los positivos
        if (cont_pos == 0) {
            System.out.println("No se puede hacer la media de los positivos");
        } else {
            media_pos = (float) suma_pos / cont_pos;
            System.out.println("Media de los positivos: " + media_pos);
        }

        // tratamos los negativos
        if (cont_neg == 0) {
            System.out.println("No se puede hacer la media de los negativos");
        } else {
            media_neg = (float) suma_neg / cont_neg;
            System.out.println("Media de los negativos: " + media_neg);
        }
    }
}
