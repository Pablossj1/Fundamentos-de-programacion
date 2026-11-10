package a2261330036_estudiodecaso;

/**
 * Ejercicio 09 - Seccion 3.5.2: Funcion EsNumeroDouble (Pagina 78)
 * Descripcion: Valida si una cadena de texto representa un numero decimal valido,
 * verificando que contenga solo digitos y como maximo un solo punto decimal.
 */
public class Ejercicio09_3_5_2_EsNumeroDouble {

    // Codigo en Java de la Pagina 78
    public static boolean EsNumeroDouble(String dato) {
        if (dato == null || dato.isEmpty()) return false;
        boolean valido = false;
        for (char c : dato.toCharArray()) {
            if (!Character.isDigit(c)) {
                if (c == '.' && !valido) {
                    valido = true;
                } else {
                    return false;
                }
            }
        }
        return valido;
    }

    public static void main(String[] args) {
        System.out.println("=== Ejercicio 09: Seccion 3.5.2 - EsNumeroDouble ===");
        String prueba1 = "123.45";
        String prueba2 = "12ab.45";
        String prueba3 = "12.34.56";
        String prueba4 = "55.00";

        System.out.println("¿Es '" + prueba1 + "' decimal?: " + EsNumeroDouble(prueba1));
        System.out.println("¿Es '" + prueba2 + "' decimal?: " + EsNumeroDouble(prueba2));
        System.out.println("¿Es '" + prueba3 + "' decimal?: " + EsNumeroDouble(prueba3));
        System.out.println("¿Es '" + prueba4 + "' decimal?: " + EsNumeroDouble(prueba4));
    }
}
