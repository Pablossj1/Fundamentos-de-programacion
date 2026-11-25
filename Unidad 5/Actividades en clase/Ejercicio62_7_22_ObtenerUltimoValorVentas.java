package a2261330036_estudiodecaso;

public class Ejercicio62_7_22_ObtenerUltimoValorVentas {

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

    public static String ObtenerUltimoValorVentas(String[][] ventas) {
        int ultimaposicion = ObtenerUltimaPosicion(ventas);
        String ultimoValor = "000";
        if (ultimaposicion >= 0) {
            ultimoValor = ventas[ultimaposicion][0];
        }
        return ultimoValor;
    }

    public static void main(String[] args) {
        String[][] ventas = new String[100][5];
        System.out.println("Ultimo valor vacio: " + ObtenerUltimoValorVentas(ventas));
        ventas[0][0] = "005";
        System.out.println("Ultimo valor ventas: " + ObtenerUltimoValorVentas(ventas));
    }
}
