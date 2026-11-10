package a2261330036_estudiodecaso;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 * Ejercicio 17 - Seccion 3.9.7: Actividad una mejor funcion llamada leervalidado (Pagina 105)
 * Descripcion: Encapsula la lectura con Dialogo y la validacion con evaluarNumerico.
 * Implementa un bucle de reintento para solicitar el dato hasta que sea valido.
 */
public class Ejercicio17_3_9_7_LeerValidado {

    public static String Dialogo(String texto) throws IOException {
        System.out.println(texto + " : ");
        BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
        return lectura.readLine();
    }

    public static boolean esNumeroEntero(String dato) {
        if (dato == null || dato.isEmpty()) return false;
        for (char c : dato.toCharArray()) {
            if (!Character.isDigit(c)) return false;
        }
        return true;
    }

    public static boolean esNumeroDecimal(String dato) {
        if (dato == null || dato.isEmpty()) return false;
        boolean punto = false;
        for (char c : dato.toCharArray()) {
            if (!Character.isDigit(c)) {
                if (c == '.' && !punto) {
                    punto = true;
                } else {
                    return false;
                }
            }
        }
        return punto;
    }

    public static boolean evaluarNumerico(String dato, String tipo) {
        if (dato == null || tipo == null) return false;
        if (tipo.equalsIgnoreCase("entero")) return esNumeroEntero(dato);
        if (tipo.equalsIgnoreCase("decimal")) return esNumeroDecimal(dato);
        return false;
    }

    // Funcion solicitada en la Seccion 3.9.7
    public static String leerValidado(String textoDialogo, String tipoDato) throws IOException {
        String datoIngresado;
        boolean esValido = false;
        do {
            datoIngresado = Dialogo(textoDialogo);
            if (datoIngresado != null) {
                datoIngresado = datoIngresado.trim();
            }
            esValido = evaluarNumerico(datoIngresado, tipoDato);
            if (!esValido) {
                System.out.println(">> Error: El dato introducido no es un " + tipoDato + " valido. Intente nuevamente.");
            }
        } while (!esValido);

        return datoIngresado;
    }

    public static void main(String[] args) {
        System.out.println("=== Ejercicio 17: Seccion 3.9.7 - Funcion leerValidado ===");
        try {
            // Ejemplo de uso:
            System.out.println("Simulacion de captura validada (espera un numero entero):");
            String cantidad = leerValidado("Introduce la cantidad en existencia (entero)", "entero");
            System.out.println("Dato validado correctamente: " + cantidad);
        } catch (IOException e) {
            System.err.println("Error de entrada: " + e.getMessage());
        }
    }
}
