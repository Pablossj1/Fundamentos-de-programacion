package tarea05_ejercicio077;

import entrada.Entrada;
public class Tarea05_ejercicio077 {
    public static void main(String[] args) {
        int i, m, a;
        // la idea de este ejercicio es hacer una traza de forma manual, y tras
        // ésta, escribir el código equivalente para comprobar el resultado.
        // Debemos destacar que este algoritmo no tiene sentido ni hace nada en concreto
        // incluso con otros datos de entrada el algoritmo puede dar un error, al
        // utilizar datos como índices de tablas sin las pertinentes
        // comprobaciones.
        int t[] = new int [5];
        for (i=0; i<=4; i++)
            t[i] = Entrada.entero();
        // podemos sustituir la lectura de datos por la siguiente línea:
        //int t[] = {-4, 0, 1, 3, 2};
        m = 0;
        for (i=0; i<=4; i++)
            if (t[i] > m )
                m = t[i];
        a = t[4-m];
        t[4-m] = t[m];
        t[m] = a;
        for (i=0; i<=4; i++)
            System.out.println (t[i]);
    }
}