package a2261330036_estudiodecaso;

/**
 * Ejercicio 11 - Seccion 3.6.1: Funcion RellenarEspacios con bucle For (Pagina 83)
 * Descripcion: Anade espacios en blanco al final de una cadena hasta completar
 * el tamano especificado mediante un ciclo for manual.
 */
public class Ejercicio11_3_6_1_RellenarEspacios {

    // Codigo en Java de la Pagina 83
    public static String RellenarEspacios(String dato, int tamano) {
        String cadena;
        cadena = dato;
        for (int ciclo = dato.length() - 1; ciclo < tamano; ciclo++) {
            cadena = cadena + " ";
        }
        return cadena;
    }

    public static void main(String[] args) {
        System.out.println("=== Ejercicio 11: Seccion 3.6.1 - RellenarEspacios con Bucle ===");
        String producto = "Arroz";
        String alineado = RellenarEspacios(producto, 15);
        System.out.println("Original: '" + producto + "'");
        System.out.println("Alineado: '" + alineado + "' (longitud final: " + alineado.length() + ")");
    }
}
