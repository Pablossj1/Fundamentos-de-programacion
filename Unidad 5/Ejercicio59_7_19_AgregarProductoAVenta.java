package a2261330036_estudiodecaso;

public class Ejercicio59_7_19_AgregarProductoAVenta {

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

    public static void AgregarProductoAVenta(String[][] mticket, String[][] mventa, String idticket) {
        int posventas = ObtenerUltimaPosicion(mventa);
        int posticket = ObtenerUltimaPosicion(mticket);
        for (int i = 0; i <= posticket; i++) {
            if (mticket[i][0] != null) {
                posventas++;
                mventa[posventas][0] = idticket;
                mventa[posventas][1] = mticket[i][0];
                mventa[posventas][2] = mticket[i][1];
                mventa[posventas][3] = mticket[i][2];
                mventa[posventas][4] = mticket[i][3];
            }
        }
    }

    public static void main(String[] args) {
        String[][] ventas = new String[100][5];
        String[][] ticket = new String[20][4];
        ticket[0] = new String[]{"001", "Arroz", "25.00", "2"};
        AgregarProductoAVenta(ticket, ventas, "001");
        System.out.println("Venta 0: Ticket=" + ventas[0][0] + " Prod=" + ventas[0][2] + " Cant=" + ventas[0][4]);
    }
}
