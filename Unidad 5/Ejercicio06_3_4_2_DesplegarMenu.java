package a2261330036_estudiodecaso;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 * Ejercicio 06 - Seccion 3.4.2: Funcion DesplegarMenu (Pagina 71)
 * Descripcion: Combina el titulo, las opciones formateadas con MostrarMenu
 * y solicita al usuario que elija una opcion usando Dialogo.
 */
public class Ejercicio06_3_4_2_DesplegarMenu {

    // Funcion MostrarMenu auxiliar
    public static String MostrarMenu(String[] opciones) {
        String cadena = "";
        int i = 0;
        while (i < opciones.length) {
            cadena += (i + 1) + ". - " + opciones[i] + "\n";
            i++;
        }
        return cadena;
    }

    // Funcion Dialogo auxiliar
    public static String Dialogo(String texto) throws IOException {
        String cadena;
        System.out.println(texto + " : ");
        BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
        cadena = lectura.readLine();
        return cadena;
    }

    // Codigo en Java de la Pagina 71
    public static String DesplegarMenu(String Titulo1, String[] menu) throws IOException {
        String cadena;
        cadena = Titulo1 + "\n" + "\n";
        cadena = cadena + MostrarMenu(menu);
        cadena = cadena + "\n Que opcion deseas ";
        return cadena = Dialogo(cadena);
    }

    public static void main(String[] args) {
        System.out.println("=== Ejercicio 06: Seccion 3.4.2 - DesplegarMenu ===");
        String[] menuTienda = {
            "Productos",
            "Punto de Venta",
            "Inventario",
            "Listado de Ventas",
            "Salida"
        };

        try {
            String seleccion = DesplegarMenu("Menu de Punto de Tienda de Abarrotes la Pequeña", menuTienda);
            System.out.println("Opcion seleccionada por el usuario: " + seleccion);
        } catch (IOException e) {
            System.err.println("Error en DesplegarMenu: " + e.getMessage());
        }
    }
}
