package tarea05_ejercicio102;

import entrada.Entrada;
public class Tarea05_ejercicio102 {
    static int rellena_tabla_pares(int t[]){
        int i,num, impares_ignorados;
        i = 0;
        impares_ignorados = 0;
        while (i<t.length)  // terminaremos de rellenar la tabla cuando el número
                            // de pares sea igual que el tamaño de la tabla
        {
            System.out.print("Introduzca número: ");
            num = Entrada.entero();
            if(num %2 == 0)     // si es par
            {
                t[i] = num;     // lo guardamos
                i++;
                }
            else
                impares_ignorados++;
        }
   
        return(impares_ignorados);
    }
    public static void main(String[] args) {
        int igno,t[];
        t = new int[5];
        igno = rellena_tabla_pares(t);
        System.out.println("El numero de impares ignorados es de: " +igno);
        
        System.out.println("La tabla queda: ");
        for(int i=0;i<5;i++)
            System.out.print(t[i]+ "  ");
        System.out.println("");
       
    }
}