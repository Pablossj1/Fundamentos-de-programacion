package a2261330036_estudiodecaso;

import java.util.Locale;

public class Ejercicio48_7_8_MostrarProductoTicket {

    public static String RellenarEspacios(String dato, int tamano) {
        if (dato == null) {
            dato = "";
        }
        String cadena = dato;
        for (int ciclo = dato.length() - 1; ciclo < tamano; ciclo++) {
            cadena = cadena + " ";
        }
        return cadena;
    }

    public static String TotalProducto(String precio, String cantidad) {
        double total = Double.parseDouble(precio) * Double.parseDouble(cantidad);
        return String.format(Locale.US, "%.2f", total);
    }

    public static String MostrarProductoTicket(String[][] mticket, int pos) {
        String codigo = RellenarEspacios(mticket[pos][0], 5);
        String producto = RellenarEspacios(mticket[pos][1], 30);
        String precio = RellenarEspacios(mticket[pos][2], 10);
        String cantidad = RellenarEspacios(mticket[pos][3], 5);
        String total = RellenarEspacios(TotalProducto(mticket[pos][2], mticket[pos][3]), 10);
        return codigo.concat(producto + precio + cantidad + total);
    }

    public static void main(String[] args) {
        String[][] ticket = new String[5][4];
        ticket[0] = new String[]{"001", "Arroz Extra 1kg", "25.00", "2"};
        System.out.println(MostrarProductoTicket(ticket, 0));
    }
}
