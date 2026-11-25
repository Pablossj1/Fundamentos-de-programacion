package a22613300036_practica8;

import javax.swing.JOptionPane;

public class ejercicio5_p8_c {
    public static void main(String[] args) {
        String producto1 = "coca cola light lata 400 ml";
        String producto2 = "coca cola lata 400 ml";
        double precio1 = 16.0;
        double precio2 = 15.0;
        double iva1, iva2, subtotal1, subtotal2, total1, total2;
        int opc, cant1, cant2;
        String menu, resultado;
        
        menu = "Menu de Opciones\n" +
               "1.- Productos\n" +
               "2.- Punto de venta\n" +
               "Que opcion deseas:";
               
        opc = Integer.parseInt(JOptionPane.showInputDialog(menu));
        
        switch (opc) {
            case 1:
                resultado = "el " + producto1 + " cueste " + precio1 + "\n" +
                            "el " + producto2 + " cueste " + precio2;
                JOptionPane.showMessageDialog(null, resultado);
                break;
            case 2:
                cant1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce la cantidad comprada de producto1:"));
                cant2 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la cantidad comprada de producto2:"));
                
                subtotal1 = cant1 * precio1;
                iva1 = subtotal1 * 0.16;
                total1 = subtotal1 + iva1;
                
                subtotal2 = cant2 * precio2;
                iva2 = subtotal2 * 0.16;
                total2 = subtotal2 + iva2;
                
                resultado = producto1 + " subtotal fue " + subtotal1 + " iva fue " + iva1 + " total fue " + total1 + "\n" +
                            producto2 + " subtotal fue " + subtotal2 + " iva fue " + iva2 + " total fue " + total2 + "\n\n" +
                            "el subtotal de la venta fue " + (subtotal1 + subtotal2) + "\n" +
                            "el total de iva fue " + (iva1 + iva2) + "\n" +
                            "Total Fue " + (total1 + total2);
                            
                JOptionPane.showMessageDialog(null, resultado);
                break;
            default:
                JOptionPane.showMessageDialog(null, "eleccion incorrecta");
                break;
        }
    }
}
