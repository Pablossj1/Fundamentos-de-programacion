package a2261330036_estudiodecaso;

public class Ejercicio46_7_6_InsertarProductoTicket {

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

    public static int ExisteTicketCodigo(String[][] mticket, String codigo) {
        int enc = -1;
        int pos = ObtenerUltimaPosicion(mticket);
        for (int ciclo = 0; ciclo <= pos; ciclo++) {
            if (mticket[ciclo][0] != null && mticket[ciclo][0].compareTo(codigo.trim()) == 0) {
                enc = ciclo;
                break;
            }
        }
        return enc;
    }

    public static boolean InsertarProductoTicket(String[][] mticket, String[] datos, int tamticket) {
        boolean sucedio = true;
        int posticket = ObtenerUltimaPosicion(mticket);
        int enc = ExisteTicketCodigo(mticket, datos[0]);
        if (posticket < tamticket - 1) {
            if (enc > -1) {
                int cantidadActual = Integer.parseInt(mticket[enc][3]);
                int cantidadNueva = Integer.parseInt(datos[3]);
                mticket[enc][3] = String.valueOf(cantidadActual + cantidadNueva);
            } else {
                posticket++;
                mticket[posticket] = datos.clone();
            }
        } else {
            sucedio = false;
        }
        return sucedio;
    }

    public static void main(String[] args) {
        String[][] ticket = new String[20][4];
        String[] p1 = {"001", "Aceite", "45.00", "1"};
        InsertarProductoTicket(ticket, p1, 20);
        InsertarProductoTicket(ticket, p1, 20);
        System.out.println("Producto: " + ticket[0][1] + " Cantidad: " + ticket[0][3]);
    }
}
