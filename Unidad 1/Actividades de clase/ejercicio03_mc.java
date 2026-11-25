package a2261330036_practica6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ejercicio03_mc {
    public static void main(String args[]) throws IOException
    {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        int d1, m1, a1, d2,m2,a2, dias;
        System.out.print("Fecha 1: Introduzca dia: ");
        d1= Integer.parseInt(entrada.readLine());
        System.out.print("Fecha 1: Introduzca mes: ");
        m1= Integer.parseInt(entrada.readLine());
        System.out.print("Fecha 1: Introduzca año: ");
        a1= Integer.parseInt(entrada.readLine());
        System.out.print("Fecha 2: Introduzca dia: ");
        d2=Integer.parseInt(entrada.readLine());
        System.out.print("Fecha 2: Introduzca mes: ");
        m2= Integer.parseInt(entrada.readLine());
        System.out.print("Fecha 2: Introduzca año: ");
        a2=Integer.parseInt(entrada.readLine());
        // se supone que las fecha introducidas son correctas
        // convertimos las dos fechas a dias y calculamos la diferencia
        dias=d2-d1+30*(m2-m1)+365*(a2-a1);
        System.out.println ("Días de diferencia: " + dias);
    }
}

