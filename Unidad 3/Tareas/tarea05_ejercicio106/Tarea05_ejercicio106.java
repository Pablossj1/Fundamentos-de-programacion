package tarea05_ejercicio106;

import entrada.Entrada;
public class Tarea05_ejercicio106 {
    static void ordenar(int a[]){
        int tam=a.length;
        int aux;
        // ordenaremos utilizando la ordenación por intercambio
        for (int i=0;i<tam-1-1;i++){
            for (int j=0;j<tam-i-1;j++){
                if(a[j]>a[j+1]) // si el elemento j es mayor que el j+1
                {
                    aux=a[j];       // los intercambiamos
   
                    a[j]=a[j+1];
                    a[j+1]=aux;
                }
            }
        }
    }
    static void mostrar_tabla(int t[]){
        int tam=t.length;
        for (int i=0;i<tam;i++){
            System.out.print(t[i] + "   ");
        }
    }
    public static void main(String[] args) {
        int t[]=new int[8];
        for (int i=0;i<8;i++){
            t[i]=(int)(Math.random()*100)+1;
        }
        System.out.println("Tabla aleatoria");
        mostrar_tabla(t);
        System.out.println("\n\nTabla ordenada");
        ordenar(t);
        mostrar_tabla(t);
        
    }
}