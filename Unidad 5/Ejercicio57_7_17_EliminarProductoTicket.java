package a2261330036_estudiodecaso;

public class Ejercicio57_7_17_EliminarProductoTicket {

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

    public static void RemoverProductoTicket(String[][] mticket, int pos) {
        int tam = ObtenerUltimaPosicion(mticket);
        if (tam > pos) {
            for (int i = pos; i < tam; i++) {
                mticket[i] = mticket[i + 1];
            }
            mticket[tam][0] = null;
        } else {
            mticket[pos][0] = null;
        }
    }

    public static void EliminarProductoTicket(String[][] mticket, int pos) {
        int cantidad = Integer.parseInt(mticket[pos][3]);
        if (cantidad > 1) {
            mticket[pos][3] = String.valueOf(cantidad - 1);
        } else {
            RemoverProductoTicket(mticket, pos);
        }
    }

    public static void main(String[] args) {
        String[][] ticket = new String[10][4];
        ticket[0] = new String[]{"001", "Arroz", "25.00", "2"};
        EliminarProductoTicket(ticket, 0);
        System.out.println("Cantidad restante: " + ticket[0][3]);
        EliminarProductoTicket(ticket, 0);
        System.out.println("Ticket fila 0 codigo: " + ticket[0][0]);
    }
}
