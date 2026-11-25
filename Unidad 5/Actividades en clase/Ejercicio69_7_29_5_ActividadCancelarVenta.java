package a2261330036_estudiodecaso;

public class Ejercicio69_7_29_5_ActividadCancelarVenta {

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

    public static void DevolucionTicket(String[][] mticket, String[][] mproductos) {
        int posmticket = ObtenerUltimaPosicion(mticket);
        for (int pos = 0; pos <= posmticket; pos++) {
            String codigo = mticket[pos][0];
            int posp = ExisteProducto(codigo.trim(), mproductos);
            if (posp > -1) {
                int cant = Integer.parseInt(mproductos[posp][3]);
                int cantticket = Integer.parseInt(mticket[pos][3]);
                mproductos[posp][3] = String.valueOf(cant + cantticket);
            }
        }
    }

    public static void CancelarVenta(String[][] mticket, String[][] mproductos) {
        DevolucionTicket(mticket, mproductos);
        int totalFilas = mticket.length;
        for (int i = 0; i < totalFilas; i++) {
            for (int j = 0; j < mticket[i].length; j++) {
                mticket[i][j] = null;
            }
        }
    }

    public static void main(String[] args) {
        String[][] productos = new String[5][4];
        productos[0] = new String[]{"001", "Arroz", "25.00", "10"};
        String[][] ticket = new String[20][4];
        ticket[0] = new String[]{"001", "Arroz", "25.00", "2"};
        System.out.println("Stock antes de cancelar venta: " + productos[0][3]);
        CancelarVenta(ticket, productos);
        System.out.println("Stock despues de cancelar venta: " + productos[0][3]);
        System.out.println("Ticket fila 0 limpio: " + (ticket[0][0] == null));
    }
}
