package a2261330036_estudiodecaso;

import java.util.Locale;

public class Ejercicio53_7_13_MostrarTicketVenta {

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

    public static String MostrarProductoTicket(String[][] mticket, int pos) {
        String codigo = RellenarEspacios(mticket[pos][0], 5);
        String producto = RellenarEspacios(mticket[pos][1], 30);
        String precio = RellenarEspacios(mticket[pos][2], 10);
        String cantidad = RellenarEspacios(mticket[pos][3], 5);
        String total = RellenarEspacios(TotalProducto(mticket[pos][2], mticket[pos][3]), 10);
        return codigo.concat(producto + precio + cantidad + total);
    }

    public static String MostrarTicket(String[][] mticket) {
        String salida = "";
        int pos = ObtenerUltimaPosicion(mticket);
        for (int ciclo = 0; ciclo <= pos; ciclo++) {
            salida = salida.concat(MostrarProductoTicket(mticket, ciclo) + "\n");
        }
        return salida;
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

    public static double TotalTicket(String[][] mticket) {
        double total = SubTotalTicket(mticket);
        if (total > 0) {
            total = IvaTicket(mticket) + total;
        }
        return total;
    }

    public static String MostrarTicketVenta(String[][] mticket, String idticket, String fecha) {
        String salida = "";
        String subtotal = String.format(Locale.US, "%.2f", SubTotalTicket(mticket));
        String iva = String.format(Locale.US, "%.2f", IvaTicket(mticket));
        String total = String.format(Locale.US, "%.2f", TotalTicket(mticket));
        salida = "Fecha del Dia: " + fecha + " | Ticket No: " + idticket + "\n";
        salida += "-----------------------------------------------------\n";
        salida += MostrarTicket(mticket);
        salida += "-----------------------------------------------------\n";
        salida += "Subtotal : $" + subtotal + "\n";
        salida += "IVA (16%): $" + iva + "\n";
        salida += "Total    : $" + total + "\n";
        return salida;
    }

    public static void main(String[] args) {
        String[][] ticket = new String[20][4];
        ticket[0] = new String[]{"001", "Arroz Extra 1kg", "25.00", "2"};
        System.out.println(MostrarTicketVenta(ticket, "001", "2026-11-18"));
    }
}
