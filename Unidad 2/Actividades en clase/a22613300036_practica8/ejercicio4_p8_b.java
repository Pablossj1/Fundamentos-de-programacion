package a22613300036_practica8;

import java.util.Scanner;

public class ejercicio4_p8_b {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion; double operando1; double operando2; double resultado;
        String menu, cadena = "";
        
        System.out.println("Introduce el valor del operando 1: ");
        operando1 = entrada.nextDouble();
        
        System.out.println("Introduce el valor del operando 2: ");
        operando2 = entrada.nextDouble();
        
        menu = " Menu de opciones de Operaciones Basicas \n" +
               " 1.- Suma \n" +
               " 2.- Multiplicacion \n" +
               " 3.- Division \n" +
               " Elige una Opcion [1..2..3]";
        System.out.println(menu);
        
        opcion = entrada.nextInt();
        
        switch (opcion) {
            case 1: 
                resultado = operando1 + operando2;
                cadena = "el resultado de la suma es " + resultado; 
                break;
            case 2: 
                resultado = operando1 * operando2;
                cadena = "el resultado de la multiplicacion es: " + resultado; 
                break;
            case 3: 
                resultado = operando1 / operando2;
                cadena = "el resultado de la division es " + resultado; 
                break;
            default: 
                cadena = "opcion no reconocida";
        }
        System.out.println(cadena);
        entrada.close();
    }
}