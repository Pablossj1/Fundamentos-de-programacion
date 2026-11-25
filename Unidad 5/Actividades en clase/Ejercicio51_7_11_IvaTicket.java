package a2261330036_estudiodecaso;

import java.util.Locale;

public class Ejercicio51_7_11_IvaTicket {

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

    public static double IvaTicket(String[][] mticket) {
        double subtotal = SubTotalTicket(mticket);
        if (subtotal > 0) {
            subtotal = 0.16 * subtotal;
        } else {
            subtotal = -1;
        }
        return subtotal;
    }

    public static void main(String[] args) {
        String[][] ticket = new String[20][4];
        ticket[0] = new String[]{"001", "Arroz", "50.00", "2"};
        System.out.println("IVA (16%): " + IvaTicket(ticket));
    }
}
