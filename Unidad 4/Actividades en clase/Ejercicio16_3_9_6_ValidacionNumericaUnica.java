package a2261330036_estudiodecaso;

public class Ejercicio16_3_9_6_ValidacionNumericaUnica {

    public static boolean esNumeroEntero(String valorAValidar) {
        if (valorAValidar == null || valorAValidar.isEmpty()) return false;
        for (char c : valorAValidar.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }

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

    public static boolean evaluarNumerico(String valorAValidar, String tipoEsperado) {
        if (valorAValidar == null || tipoEsperado == null) return false;
        if (tipoEsperado.equalsIgnoreCase("entero")) {
            return esNumeroEntero(valorAValidar);
        } else if (tipoEsperado.equalsIgnoreCase("decimal")) {
            return esNumeroDecimal(valorAValidar);
        }
        return false;
    }

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
