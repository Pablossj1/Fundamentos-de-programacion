package a2261330036_estudiodecaso;

import java.io.IOException;

public class Ejercicio67_7_27_2_MainActualizado {

    public static int tamventas = 100;
    public static String[][] productos;
    public static String[][] ventas;

    public static String[][] CargarProductos() {
        String[][] mproductos = new String[10][4];
        mproductos[0] = new String[]{"001", "Arroz Extra 1kg", "25.00", "50"};
        mproductos[1] = new String[]{"002", "Aceite Vegetal 1L", "45.00", "30"};
        mproductos[2] = new String[]{"003", "Frijol Negro 1kg", "32.00", "40"};
        mproductos[3] = new String[]{"004", "Azucar Estandar 1kg", "28.00", "25"};
        mproductos[4] = new String[]{"005", "Leche Entera 1L", "24.50", "60"};
        return mproductos;
    }

    public static String[][] CrearVenta() {
        return new String[tamventas][5];
    }

    public static void main(String[] args) throws IOException {
        productos = CargarProductos();
        ventas = CrearVenta();
        System.out.println("Estructura principal inicializada correctamente.");
        System.out.println("Catalogo de productos: " + productos.length + " filas.");
        System.out.println("Matriz de ventas: " + ventas.length + " filas.");
    }
}
