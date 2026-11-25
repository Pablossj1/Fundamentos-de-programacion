package a22613300036_practica8;

import javax.swing.JOptionPane;

public class ejercicio4_p8_c {
    public static void main(String[] args) {
        int opcion; double operando1; double operando2; double resultado;
        String menu, cadena = "";
        
        operando1 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor del operando 1:"));
        operando2 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor del operando 2:"));
        
        menu = " Menu de opciones de Operaciones Basicas \n" +
               " 1.- Suma \n" +
               " 2.- Multiplicacion \n" +
               " 3.- Division \n" +
               " Elige una Opcion [1..2..3]";
               
        opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));
        
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
        
        JOptionPane.showMessageDialog(null, cadena);
    }
}