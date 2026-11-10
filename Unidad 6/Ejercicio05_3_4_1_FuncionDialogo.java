package a2261330036_estudiodecaso;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 * Ejercicio 05 - Seccion 3.4.1: Funcion Dialogo (Pagina 68)
 * Descripcion: Solicita una entrada al usuario mostrando un mensaje o etiqueta
 * y retorna la linea de texto introducida mediante teclado.
 */
public class Ejercicio05_3_4_1_FuncionDialogo {

    // Codigo en Java de la Pagina 68
    public static String Dialogo(String texto) throws IOException {
        String cadena;
        System.out.println(texto + " : ");
        BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
        cadena = lectura.readLine();
        return cadena;
    }

    public static void main(String[] args) {
        System.out.println("=== Ejercicio 05: Seccion 3.4.1 - Funcion Dialogo ===");
        try {
            String respuesta = Dialogo("Introduce el nombre del producto");
            System.out.println("Texto capturado por la funcion Dialogo: " + respuesta);
        } catch (IOException e) {
            System.err.println("Error de lectura: " + e.getMessage());
        }
    }
}
