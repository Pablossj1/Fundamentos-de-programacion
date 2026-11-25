package a22613300036_practica8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ejercicio5_p8 {
    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        
        String producto1 = "coca cola light lata 400 ml";
        String producto2 = "coca cola lata 400 ml";
        double precio1 = 16.0;
        double precio2 = 15.0;
        double iva1, iva2, subtotal1, subtotal2, total1, total2;
        int opc, cant1, cant2;
        
        System.out.println("Menu de Opciones");
        System.out.println("1.- Productos");
        System.out.println("2.- Punto de venta");
        System.out.println("Que opcion deseas");
        opc = Integer.parseInt(entrada.readLine());
        
        switch (opc) {
            case 1:
                System.out.println("el " + producto1 + " cueste " + precio1);
                System.out.println("el " + producto2 + " cueste " + precio2);
                break;
            case 2:
                System.out.println("Introduce la cantidad comprada de producto1:");
                cant1 = Integer.parseInt(entrada.readLine());
                System.out.println("Introduzca la cantidad comprada de producto2:");
                cant2 = Integer.parseInt(entrada.readLine());
                
                subtotal1 = cant1 * precio1;
                iva1 = subtotal1 * 0.16;
                total1 = subtotal1 + iva1;
                System.out.println(producto1 + " subtotal fue " + subtotal1 + " iva fue " + iva1 + " total fue " + total1);
                
                subtotal2 = cant2 * precio2;
                iva2 = subtotal2 * 0.16;
                total2 = subtotal2 + iva2;
                System.out.println(producto2 + " subtotal fue " + subtotal2 + " iva fue " + iva2 + " total fue " + total2);
                
                System.out.println("el subtotal de la venta fue " + (subtotal1 + subtotal2));
                System.out.println("el total de iva fue " + (iva1 + iva2));
                System.out.println("Total Fue " + (total1 + total2));
                break;
            default:
                System.out.println("eleccion incorrecta");
                break;
        }
    }
}