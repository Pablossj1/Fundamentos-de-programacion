package tarea05_ejercicio063;

import entrada.Entrada;
public class Tarea05_ejercicio063 {
    public static void main(String[] args) {
        int t[]=new int[10];
        int posicion;
        // leemos los 10 números
        for (int i=0;i<10;i++)
        {
            System.out.print("Elemento ("+i+"): ");
            t[i]=Entrada.entero();
        }
   
        System.out.println();
        // leemos la posición que nos interesa
        // suponemos que la posición está en el rango 0..9
        System.out.print("Posición a eliminar: ");
        posicion=Entrada.entero();
        // desplazamos desde posición hasta el final todos los elementos un lugar hacia la izquierda
        // con lo que el elemento que está en posición se pierde (se borra)
        for (int i=posicion;i<9;i++) // la i llega hasta la penúltima posición,
            t[i] = t[i+1];           // ya que dentro usamos (i+1) que es la última posición
                                     // así evitamos salirnos de la tabla
        System.out.println("La tabla queda: ");
        for (int i=0;i<9;i++)       // hay que tener cuidado que ahora hay un
            System.out.println(t[i]);  // elemento útil menos en la tabla
    }
}