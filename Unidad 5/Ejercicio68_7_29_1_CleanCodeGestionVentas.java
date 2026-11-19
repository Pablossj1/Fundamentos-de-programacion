package a2261330036_estudiodecaso;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Locale;

public class Ejercicio68_7_29_1_CleanCodeGestionVentas {

    public static BufferedReader entradaConsola = new BufferedReader(new InputStreamReader(System.in));

    public static String Dialogo(String mensajeParaUsuario) throws IOException {
        System.out.println(mensajeParaUsuario + " : ");
        return entradaConsola.readLine();
    }

    public static String LeerEntrada(String mensajeParaUsuario) throws IOException {
        String cadenaCapturada = Dialogo(mensajeParaUsuario);
        if (cadenaCapturada != null) {
            cadenaCapturada = cadenaCapturada.trim();
            if (cadenaCapturada.isEmpty()) {
                cadenaCapturada = null;
            }
        }
        return cadenaCapturada;
    }

    public static int ObtenerUltimaPosicionOcupada(String[][] matrizDatos) {
        int indiceFila = 0;
        int tamanoMaximo = matrizDatos.length;
        while (indiceFila < tamanoMaximo) {
            if (matrizDatos[indiceFila][0] == null) {
                break;
            }
            indiceFila++;
        }
        return indiceFila - 1;
    }

    public static int BuscarProductoEnTicket(String[][] matrizTicket, String codigoArticuloVenta) {
        int indiceEncontrado = -1;
        int ultimaFila = ObtenerUltimaPosicionOcupada(matrizTicket);
        for (int fila = 0; fila <= ultimaFila; fila++) {
            if (matrizTicket[fila][0] != null && matrizTicket[fila][0].compareTo(codigoArticuloVenta.trim()) == 0) {
                indiceEncontrado = fila;
                break;
            }
        }
        return indiceEncontrado;
    }

    public static double CalcularSubtotalTicket(String[][] matrizTicket) {
        double subtotalTicketAcumulado = 0.0;
        int totalFilas = ObtenerUltimaPosicionOcupada(matrizTicket);
        for (int fila = 0; fila <= totalFilas; fila++) {
            double precioUnitario = Double.parseDouble(matrizTicket[fila][2]);
            double cantidadComprada = Double.parseDouble(matrizTicket[fila][3]);
            subtotalTicketAcumulado += (precioUnitario * cantidadComprada);
        }
        return subtotalTicketAcumulado;
    }

    public static double CalcularImpuestoTicket(String[][] matrizTicket) {
        double subtotalTicket = CalcularSubtotalTicket(matrizTicket);
        if (subtotalTicket > 0.0) {
            return subtotalTicket * 0.16;
        }
        return -1.0;
    }

    public static double CalcularMontoTotalPagar(String[][] matrizTicket) {
        double subtotalTicket = CalcularSubtotalTicket(matrizTicket);
        double impuestoCalculado = CalcularImpuestoTicket(matrizTicket);
        if (subtotalTicket > 0.0 && impuestoCalculado >= 0.0) {
            return subtotalTicket + impuestoCalculado;
        }
        return -1.0;
    }

    public static void main(String[] args) {
        String[][] matrizTicketEjemplo = new String[20][4];
        matrizTicketEjemplo[0] = new String[]{"ART-01", "Jabon de Tocador", "18.50", "3"};
        double subtotal = CalcularSubtotalTicket(matrizTicketEjemplo);
        double impuesto = CalcularImpuestoTicket(matrizTicketEjemplo);
        double total = CalcularMontoTotalPagar(matrizTicketEjemplo);
        System.out.println("Clean Code Gestion de Ventas - Totales Calculados:");
        System.out.println("Subtotal: $" + String.format(Locale.US, "%.2f", subtotal));
        System.out.println("IVA 16%:  $" + String.format(Locale.US, "%.2f", impuesto));
        System.out.println("Total:    $" + String.format(Locale.US, "%.2f", total));
    }
}
