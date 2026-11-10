package a2261330036_estudiodecaso;

/**
 * Ejercicio 16 - Seccion 3.9.6: Actividad una sola funcion de validacion numerica (Pagina 104)
 * Descripcion: Mejora y unifica las validaciones numericas con nombres semanticos
 * y permite especificar el tipo como cadena ("entero" o "decimal") o detectarlo automaticamente.
 */
public class Ejercicio16_3_9_6_ValidacionNumericaUnica {

    // Validacion de entero
    public static boolean esNumeroEntero(String valorAValidar) {
        if (valorAValidar == null || valorAValidar.isEmpty()) return false;
        for (char c : valorAValidar.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }

    // Validacion de decimal
    public static boolean esNumeroDecimal(String valorAValidar) {
        if (valorAValidar == null || valorAValidar.isEmpty()) return false;
        boolean tienePunto = false;
        for (char c : valorAValidar.toCharArray()) {
            if (!Character.isDigit(c)) {
                if (c == '.' && !tienePunto) {
                    tienePunto = true;
                } else {
                    return false;
                }
            }
        }
        return tienePunto;
    }

    // Funcion unificada solicitada en la actividad 3.9.6
    public static boolean evaluarNumerico(String valorAValidar, String tipoEsperado) {
        if (valorAValidar == null || tipoEsperado == null) return false;
        if (tipoEsperado.equalsIgnoreCase("entero")) {
            return esNumeroEntero(valorAValidar);
        } else if (tipoEsperado.equalsIgnoreCase("decimal")) {
            return esNumeroDecimal(valorAValidar);
        }
        return false;
    }

    // Segunda variante propuesta en 3.9.6: determina el tipo sin requerir segundo parametro
    public static String determinarTipoNumerico(String valorAValidar) {
        if (esNumeroEntero(valorAValidar)) {
            return "entero";
        } else if (esNumeroDecimal(valorAValidar)) {
            return "decimal";
        } else {
            return "invalido";
        }
    }

    public static void main(String[] args) {
        System.out.println("=== Ejercicio 16: Seccion 3.9.6 - Validacion Numerica Unica ===");
        System.out.println("evaluarNumerico('450', 'entero'): " + evaluarNumerico("450", "entero"));
        System.out.println("evaluarNumerico('450.50', 'decimal'): " + evaluarNumerico("450.50", "decimal"));
        System.out.println("evaluarNumerico('abc', 'entero'): " + evaluarNumerico("abc", "entero"));

        System.out.println("\nDeterminacion automatica de tipo:");
        System.out.println("determinarTipoNumerico('1024'): " + determinarTipoNumerico("1024"));
        System.out.println("determinarTipoNumerico('99.99'): " + determinarTipoNumerico("99.99"));
        System.out.println("determinarTipoNumerico('precio10'): " + determinarTipoNumerico("precio10"));
    }
}
