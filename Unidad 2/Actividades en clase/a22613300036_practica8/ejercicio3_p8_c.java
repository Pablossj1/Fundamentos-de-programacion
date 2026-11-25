package a22613300036_practica8;

import javax.swing.JOptionPane;

public class ejercicio3_p8_c {
    public static void main(String[] args) {
        String opc = "";
        String cadena = " Menu de Opciones \n" +
                        " 1.-Opcion 1 \n" +
                        " 2.-Opcion 2 \n" +
                        " 3.-Opcion 3 \n" +
                        " 4.-Opcion 4 \n" +
                        " Eliga una opcion [1..4]";
        
        opc = JOptionPane.showInputDialog(cadena);
        cadena = "";
        
        switch(opc){
            case "1": cadena="Elegiste la opcion 1"; break;
            case "2": cadena="Elegiste la opcion 2"; break;
            case "3": cadena="Elegiste la opcion 3"; break;
            case "4": cadena="Elegiste la opcion 4"; break;
            default: cadena="Elegiste una opcion que no existe"; break;
        }
        JOptionPane.showMessageDialog(null, cadena);
    }
}
