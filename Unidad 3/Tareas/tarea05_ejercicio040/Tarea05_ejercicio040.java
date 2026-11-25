package tarea05_ejercicio040;

import entrada.Entrada;
public class Tarea05_ejercicio040 {
    public static void main(String[] args) {
        int codigo;
        int litros;
        float precio = 0;
        float importe_factura;
        float facturacion_total = 0;
        int litros_cod1 = 0;
        int mas_600 = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Factura nº " + i);
            System.out.print("código de producto: ");
            codigo = Entrada.entero();
            System.out.print("cantidad (litros): ");
            litros = Entrada.entero();

            switch (codigo) {
                case 1:
                    precio = 0.6f;
                    break;
                case 2:
                    precio = 3f;
                    break;
                case 3:
                    precio = 1.25f;
                    break;
                default:
                    precio = 0;
                    break;
            }

            importe_factura = litros * precio;
            facturacion_total += importe_factura;

            if (codigo == 1) {
                litros_cod1 += litros;
            }
            if (importe_factura >= 600) {
                mas_600++;
            }
        }

        System.out.println("\n\nResumen de ventas\n");
        System.out.println("La facturación total es de: " + facturacion_total + "€");
        System.out.println("Ventas del producto 1: " + litros_cod1 + " litros");
        System.out.println("Factura superior a 600 euros: " + mas_600);
    }
}
