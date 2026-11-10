package a2261330036_estudiodecaso;

/**
 * Ejercicio 12 - Seccion 3.6.1: Funcion RellenarEspacios usando String.format (Pagina 85)
 * Descripcion: Utiliza las utilidades nativas de formato de Java (String.format con %1$-Ns)
 * para alinear a la izquierda rellenando con espacios hasta el ancho especificado.
 */
public class Ejercicio12_3_6_1_RellenarEspaciosFormato {

    // Codigo en Java de la Pagina 85
    public static String Rellenarespacios(String dato, int tamano) {
        return String.format("%1$-" + tamano + "s", dato);
    }

    public static void main(String[] args) {
        System.out.println("=== Ejercicio 12: Seccion 3.6.1 - RellenarEspacios con String.format ===");
        String texto = "Aceite 1L";
        String resultado = Rellenarespacios(texto, 20);
        System.out.println("Texto formateado: '" + resultado + "' (longitud: " + resultado.length() + ")");
    }
}
