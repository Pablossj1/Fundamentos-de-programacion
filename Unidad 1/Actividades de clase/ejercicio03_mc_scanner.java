package a2261330036_practica6;

import java.util.Scanner;

public class ejercicio03_mc_scanner {
    public static void main(String[] args)
    {
        //declaracion de las variables
        int a1,a2, d1,d2,m1, m2, dias;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Fecha 1: Introduzca día: ");
        d1=entrada.nextInt();
        System.out.print("Fecha 1: Introduzca mes: ");
        m1=entrada.nextInt();
        System.out.print("Fecha 1: Introduzca año: ");
        a1=entrada.nextInt();
        System.out.print("Fecha 2: Introduzca día: ");
        d2=entrada.nextInt();
        System.out.print("Fecha 2: Introduzca mes: ");
        m2=entrada.nextInt();
        System.out.print("Fecha 2: Introduzca año: ");
        a2=entrada.nextInt();
        // se supone que las fecha introducidas son correctas
        // convertimos las dos fechas a dias y calculamos la diferencia
        dias=d2-d1+30*(m2-m1)+365*(a2-a1);
        System.out.println ("Días de diferencia: " + dias);
    }
}

