package a2261330036_estudiodecaso;

import java.util.Locale;

public class Ejercicio47_7_7_TotalProducto {

    public static String TotalProducto(String precio, String cantidad) {
        double total = Double.parseDouble(precio) * Double.parseDouble(cantidad);
        return String.format(Locale.US, "%.2f", total);
    }

    public static void main(String[] args) {
        System.out.println("Total (15.50 x 3): " + TotalProducto("15.50", "3"));
    }
}
