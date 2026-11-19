package a2261330036_estudiodecaso;

import java.util.Locale;

public class Ejercicio50_7_10_SubTotalTicket {

    public static String TotalProducto(String precio, String cantidad) {
        double total = Double.parseDouble(precio) * Double.parseDouble(cantidad);
        return String.format(Locale.US, "%.2f", total);
    }

    public static int ObtenerUltimaPosicion(String[][] matriz) {
        int posicion = 0;
        int tamano = matriz.length;
        while (posicion < tamano) {
            if (matriz[posicion][0] == null) {
                break;
            }
            posicion++;
        }
        return posicion - 1;
    }

    public static double SubTotalTicket(String[][] mticket) {
        double subtotal = 0;
        int pos = ObtenerUltimaPosicion(mticket);
        for (int ciclo = 0; ciclo <= pos; ciclo++) {
            subtotal = subtotal + Double.parseDouble(TotalProducto(mticket[ciclo][2], mticket[ciclo][3]));
        }
        return subtotal;
    }

    public static void main(String[] args) {
        String[][] ticket = new String[20][4];
        ticket[0] = new String[]{"001", "Arroz", "25.00", "2"};
        ticket[1] = new String[]{"002", "Aceite", "45.00", "1"};
        System.out.println("Subtotal: " + SubTotalTicket(ticket));
    }
}
