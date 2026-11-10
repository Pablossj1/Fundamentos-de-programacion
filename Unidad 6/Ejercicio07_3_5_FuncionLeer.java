package a2261330036_estudiodecaso;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 * Ejercicio 07 - Seccion 3.5: Funcion Leer (Pagina 73)
 * Descripcion: Lee la entrada del usuario, limpia espacios en blanco al inicio y final
 * (trim) y devuelve null si el valor ingresado esta vacio.
 */
public class Ejercicio07_3_5_FuncionLeer {

    // Funcion auxiliar Dialogo
    public static String Dialogo(String texto) throws IOException {
        String cadena;
        System.out.println(texto + " : ");
        BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
        cadena = lectura.readLine();
        return cadena;
    }

    // Codigo en Java de la Pagina 73
    public static String Leer(String texto) throws IOException {
        String cadena = "";
        cadena = Dialogo(texto);
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

    public static void main(String[] args) {
        System.out.println("=== Ejercicio 07: Seccion 3.5 - Funcion Leer ===");
        try {
            String valor = Leer("Introduce un texto para validar");
            if (valor == null) {
                System.out.println("El usuario ingreso una cadena vacia o nula.");
            } else {
                System.out.println("Cadena limpia obtenida: '" + valor + "'");
            }
        } catch (IOException e) {
            System.err.println("Error en lectura: " + e.getMessage());
        }
    }
}
