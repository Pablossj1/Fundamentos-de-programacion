package tarea05_ejercicio076;

import entrada.Entrada;
public class Tarea05_ejercicio076 {
    public static void main(String[] args) {
        int t[][][];
        int i,j,k;
        t = new int[9][9][9];
        for (i=0;i<9;i++){
            for (j=0;j<9;j++){
                for (k=0;k<9;k++){
                    if(i==0 || i==8 || j==0 || j==8 || k==0 || k==8)
                        // si estamos en la primera o última columna, fila o capa de la matriz
                        t[i][j][k]=1;
                }
            }
        }
        // Mostramos la matriz capa a capa
        System.out.println("Matriz: ");
        for (i=0;i<9;i++)
        {
            System.out.println("Capa: " +i);
            for (j=0;j<9;j++)
            {
                for (k=0;k<9;k++)
                {
                    System.out.print(t[i][j][k] + " ");
                }
                System.out.println ();
            }
            System.out.println (" -------------- ");
        }
   
    }
}