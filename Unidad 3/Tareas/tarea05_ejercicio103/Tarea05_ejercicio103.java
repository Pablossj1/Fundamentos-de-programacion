package tarea05_ejercicio103;

import entrada.Entrada;
public class Tarea05_ejercicio103 {
    static boolean busca(int t[],int n)
    {
        int i;
   
        boolean esta;
        
        i=0;
        while (i<t.length && t[i]!=n) // si no es t[i], paso al siguiente
                                      // con cuidado de no salirme de la tabla
            i++;
        
        
        // cuando termina el mientras, puede ser por dos motivos:
        // - que he buscado por toda la tabla sin encontrarlo y al final me salgo de la tabla
        // - o que lo he encontrado
        
        if (i<t.length) // si no llego al final de la tabla es por que lo he encontrado
                        // t[i] == num no es válido, ya que si i está fuera de rango da un error
            esta =true;
        else
            esta =false;
        return(esta);
    }
    public static void main(String[] args) {
        int a[]={1, 12, 38, 5, 11}; // es un ejemplo de posibles valores
        int num;
        boolean esta;
        System.out.println("La tabla es: ");
        for (int i=0;i<5;i++)
            System.out.println(a[i]);
        System.out.print("\nintroduce numero a buscar: ");
        num=Entrada.entero();
   
        esta=busca(a,num);
        if (esta)
            System.out.println("EL número está");
        else
            System.out.println("El número no está");
    }
}