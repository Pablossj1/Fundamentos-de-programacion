package a2261330036_estudiodecaso;

public class Ejercicio60_7_20_Pagar {

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

    public static void Pagar(String idticket, String[][] mventa, String[][] mticket) {
        int posventas = ObtenerUltimaPosicion(mventa);
        int post = ObtenerUltimaPosicion(mticket);
        if ((posventas + post + 1) < 100) {
            AgregarProductoAVenta(mticket, mventa, idticket);
        } else {
            System.out.println("Desbordamiento de Memoria de ventas");
        }
    }

    public static void main(String[] args) {
        String[][] ventas = new String[100][5];
        String[][] ticket = new String[20][4];
        ticket[0] = new String[]{"001", "Arroz", "25.00", "2"};
        Pagar("001", ventas, ticket);
        System.out.println("Venta registrada para ticket: " + ventas[0][0]);
    }
}
