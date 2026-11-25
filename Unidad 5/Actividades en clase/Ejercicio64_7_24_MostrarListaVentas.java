package a2261330036_estudiodecaso;

public class Ejercicio64_7_24_MostrarListaVentas {

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

    public static String MostrarVenta(String[] venta) {
        String idticket = RellenarEspacios(venta[0], 6);
        String codigo = RellenarEspacios(venta[1], 5);
        String producto = RellenarEspacios(venta[2], 30);
        String precio = RellenarEspacios(venta[3], 10);
        String cantidad = RellenarEspacios(venta[4], 10);
        return idticket.concat(codigo + producto + precio + cantidad);
    }

    public static String MostrarListaVentas(String[][] ventas) {
        int posventas = ObtenerUltimaPosicion(ventas);
        String salida = "";
        for (int ciclo = 0; ciclo <= posventas; ciclo++) {
            String[] venta = {ventas[ciclo][0], ventas[ciclo][1], ventas[ciclo][2], ventas[ciclo][3], ventas[ciclo][4]};
            String cadena = MostrarVenta(venta);
            salida = salida.concat(cadena + "\n");
        }
        return salida;
    }

    public static void main(String[] args) {
        String[][] ventas = new String[100][5];
        ventas[0] = new String[]{"001", "001", "Arroz 1kg", "25.00", "2"};
        ventas[1] = new String[]{"001", "002", "Aceite 1L", "45.00", "1"};
        System.out.println(MostrarListaVentas(ventas));
    }
}
