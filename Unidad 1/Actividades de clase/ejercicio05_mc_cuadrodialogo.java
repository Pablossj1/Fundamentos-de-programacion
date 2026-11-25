package a2261330036_practica6;

import javax.swing.JOptionPane;

public class ejercicio05_mc_cuadrodialogo {
    public static void main(String[] args) {
        int cant, sumacant = 0;
        double precio, subtotal, iva, total, sumaiva = 0, sumatotal = 0;
        String salida;

        // Coca Cola
        precio = Double.parseDouble(JOptionPane.showInputDialog("Introduzca el precio del Refresco coca cola light lata:"));
        cant = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la cantidad comprada de coca cola:"));
        subtotal = precio * cant;
        iva = 0.16 * subtotal;
        total = iva + subtotal;
        salida = "subtotal " + subtotal + " iva " + iva + " Total " + total;
        JOptionPane.showMessageDialog(null, salida);
        sumacant = cant;
        sumaiva = iva;
        sumatotal = total;

        // Arroz
        precio = Double.parseDouble(JOptionPane.showInputDialog("Introduzca el precio 1/4 de Arroz:"));
        cant = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la cantidad comprada de Arroz:"));
        subtotal = precio * cant;
        iva = 0.16 * subtotal;
        total = iva + subtotal;
        salida = "subtotal " + subtotal + " iva " + iva + " Total " + total;
        JOptionPane.showMessageDialog(null, salida);
        sumacant = sumacant + cant;
        sumaiva = sumaiva + iva;
        sumatotal = sumatotal + total;

        // Pan Francés
        precio = Double.parseDouble(JOptionPane.showInputDialog("Introduzca el precio pieza de pan frances:"));
        cant = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la cantidad comprada de pan frances:"));
        subtotal = precio * cant;
        iva = 0.16 * subtotal;
        total = iva + subtotal;
        salida = "subtotal " + subtotal + " iva " + iva + " Total " + total;
        JOptionPane.showMessageDialog(null, salida);
        sumacant = sumacant + cant;
        sumaiva = sumaiva + iva;
        sumatotal = sumatotal + total;

        // Totales finales
        String reporteFinal = "El total de productos vendidos fue " + sumacant + "\n"
                            + "El total del iva fue " + sumaiva + "\n"
                            + "El total " + sumatotal;
        JOptionPane.showMessageDialog(null, reporteFinal);
    }
}