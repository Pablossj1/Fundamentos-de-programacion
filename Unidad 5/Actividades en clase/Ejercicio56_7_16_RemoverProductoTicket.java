package a2261330036_estudiodecaso;

public class Ejercicio56_7_16_RemoverProductoTicket {

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

    public static void main(String[] args) {
        String[][] ticket = new String[10][4];
        ticket[0] = new String[]{"001", "Arroz", "25.00", "1"};
        ticket[1] = new String[]{"002", "Aceite", "45.00", "1"};
        RemoverProductoTicket(ticket, 0);
        System.out.println("Primer producto despues de remover: " + ticket[0][1]);
    }
}
