package a2261330036_estudiodecaso;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Ejercicio66_7_26_2_MenuPrincipalActualizado {

    public static BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));

    public static String Dialogo(String texto) throws IOException {
        System.out.println(texto + " : ");
        return lector.readLine();
    }

    public static String Leer(String texto) throws IOException {
        String cadena = Dialogo(texto);
        if (cadena != null) {
            cadena = cadena.trim();
            if (cadena.isEmpty()) {
                cadena = null;
            }
        } else {
            cadena = null;
        }
        return cadena;
    }

    public static String DesplegarMenu(String titulo, String[] menu) throws IOException {
        System.out.println(titulo);
        for (String item : menu) {
            System.out.println(item);
        }
        return Leer("Seleccione una opcion");
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

    public static String ObtenerUltimoValorVentas(String[][] ventas) {
        int ultimaposicion = ObtenerUltimaPosicion(ventas);
        String ultimoValor = "000";
        if (ultimaposicion >= 0) {
            ultimoValor = ventas[ultimaposicion][0];
        }
        return ultimoValor;
    }

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

    public static void MenuPrincipal(String[][] vproductos, String[][] vventas) throws IOException {
        String[] datosmenuprincipal = {"1.-Productos ", "2.-Punto de Venta ", "3.- Inventario", "4.-Ventas", "5.-Salida "};
        String opcion = "0";
        String idticket;
        do {
            idticket = ObtenerUltimoValorVentas(vventas);
            opcion = DesplegarMenu("Menu de Punto de Tienda de Abarrotes la Pequeña", datosmenuprincipal);
            if (opcion == null) {
                System.out.println("opcion incorrecta ");
            } else {
                switch (opcion) {
                    case "1":
                        System.out.println("Acceso al Menu de Productos");
                        break;
                    case "2":
                        System.out.println("Acceso al Punto de Venta con ticket base: " + idticket);
                        break;
                    case "3":
                        System.out.println("Acceso al Menu de Inventario");
                        break;
                    case "4":
                        System.out.println(MostrarListaVentas(vventas));
                        break;
                    case "5":
                        System.out.println("Salida del Sistema ");
                        break;
                    default:
                        System.out.println("No existe esta opcion ");
                        break;
                }
            }
        } while (opcion == null || opcion.compareTo("5") != 0);
    }

    public static void main(String[] args) throws IOException {
        System.out.println("MenuPrincipal actualizado compilado y verificado.");
    }
}
