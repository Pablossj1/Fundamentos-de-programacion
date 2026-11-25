package a2261330036_estudiodecaso;

public class Ejercicio42_7_2_CrearVenta {

    public static int tamventas = 100;

    public static String[][] CrearVenta() {
        return new String[tamventas][5];
    }

    public static void main(String[] args) {
        String[][] ventas = CrearVenta();
        System.out.println("Matriz de ventas creada con filas: " + ventas.length + " y columnas: " + ventas[0].length);
    }
}
