package a2261330036_estudiodecaso;

import java.util.Locale;

public class Ejercicio70_7_29_6_ActividadIvaPersonalizado {

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

    public static int ExisteProducto(String codigo, String[][] vproductos) {
        int enc = -1;
        int tam = vproductos.length;
        for (int ciclo = 0; ciclo < tam; ciclo++) {
            if (vproductos[ciclo][0] != null && vproductos[ciclo][0].compareTo(codigo.trim()) == 0) {
                enc = ciclo;
                break;
            }
        }
        return enc;
    }

    public static double ObtenerIva(String codigo, String[][] mproductos) {
        double iva = 0.16;
        int pos = ExisteProducto(codigo, mproductos);
        if (pos > -1 && mproductos[pos].length >= 5 && mproductos[pos][4] != null) {
            iva = Double.parseDouble(mproductos[pos][4]);
        }
        return iva;
    }

    public static double IvaTicket(String[][] mticket, String[][] mproductos) {
        double ivatotal = 0.0;
        int posticket = ObtenerUltimaPosicion(mticket);
        for (int fila = 0; fila <= posticket; fila++) {
            if (mticket[fila][0] != null) {
                String codigo = mticket[fila][0];
                double iva = ObtenerIva(codigo, mproductos);
                if (iva != 0.0) {
                    double precio = Double.parseDouble(mticket[fila][2]);
                    double cantidad = Double.parseDouble(mticket[fila][3]);
                    ivatotal += (precio * cantidad * iva);
                }
            }
        }
        return ivatotal;
    }

    public static void main(String[] args) {
        String[][] productos = new String[5][5];
        productos[0] = new String[]{"001", "Medicina", "100.00", "10", "0.00"};
        productos[1] = new String[]{"002", "Refresco", "20.00", "10", "0.16"};
        String[][] ticket = new String[20][4];
        ticket[0] = new String[]{"001", "Medicina", "100.00", "2"};
        ticket[1] = new String[]{"002", "Refresco", "20.00", "3"};
        double ivaCalculado = IvaTicket(ticket, productos);
        System.out.println("IVA personalizado total: $" + String.format(Locale.US, "%.2f", ivaCalculado));
    }
}
