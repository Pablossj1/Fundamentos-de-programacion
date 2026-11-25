package a2261330036_practica6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ejercicio05_mc {
    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        int cant, sumacant = 0;
        double precio, subtotal, iva, total, sumaiva = 0, sumatotal = 0;
        String salida;

        // Coca Cola
        System.out.println("Introduzca el precio del Refresco coca cola light lata:");
        precio = Double.parseDouble(entrada.readLine());
        System.out.println("Introduzca la cantidad comprada:");
        cant = Integer.parseInt(entrada.readLine());
        subtotal = precio * cant;
        iva = 0.16 * subtotal;
        total = iva + subtotal;
        salida = "subtotal " + subtotal + " iva " + iva + " Total " + total;
        System.out.println(salida);
        sumacant = cant;
        sumaiva = iva;
        sumatotal = total;

        // Arroz
        System.out.println("Introduzca el precio 1/4 de Arroz:");
        precio = Double.parseDouble(entrada.readLine());
        System.out.println("Introduzca la cantidad comprada:");
        cant = Integer.parseInt(entrada.readLine());
        subtotal = precio * cant;
        iva = 0.16 * subtotal;
        total = iva + subtotal;
        salida = "subtotal " + subtotal + " iva " + iva + " Total " + total;
        System.out.println(salida);
        sumacant = sumacant + cant;
        sumaiva = sumaiva + iva;
        sumatotal = sumatotal + total;

        // Pan Francés
        System.out.println("Introduzca el precio pieza de pan frances:");
        precio = Double.parseDouble(entrada.readLine());
        System.out.println("Introduzca la cantidad comprada:");
        cant = Integer.parseInt(entrada.readLine());
        subtotal = precio * cant;
        iva = 0.16 * subtotal;
        total = iva + subtotal;
        salida = "subtotal " + subtotal + " iva " + iva + " Total " + total;
        System.out.println(salida);
        sumacant = sumacant + cant;
        sumaiva = sumaiva + iva;
        sumatotal = sumatotal + total;

        // Totales finales
        System.out.println("el total de productos vendidos fue " + sumacant);
        System.out.println("el total del iva fue " + sumaiva);
        System.out.println("el total " + sumatotal);
    }
}

