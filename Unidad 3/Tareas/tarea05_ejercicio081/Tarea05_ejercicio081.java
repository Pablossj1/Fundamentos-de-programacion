package tarea05_ejercicio081;

import entrada.Entrada;
public class Tarea05_ejercicio081 {
   
     static int maximo(int a, int b, int c){
        int max;
        
        if(a>b && a>c) // si a es mayor que b y c, entonces a es el máximo
            max=a;
        else
            if(b>a && b>c) // si b es el mayor de todos, entonces b es el máximo
                max=b;
            else
                // si el máximo no es a ni b, será c
                max=c;
        
        return(max);
    }
    
    public static void main(String[] args) {
        int max;
        int a, b, c;
        System.out.print("Introduzca un numero: ");
        a=Entrada.entero();
        System.out.print("Introduzca otro numero: ");
        b=Entrada.entero();
        System.out.print("Introduzca el último: ");
        c=Entrada.entero();
   
        System.out.println("");
        max =maximo (a, b, c);
        System.out.println("El número mayor es: " +max);
        }
}