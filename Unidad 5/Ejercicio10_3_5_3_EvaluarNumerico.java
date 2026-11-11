package a2261330036_estudiodecaso;

/**
 * Ejercicio 10 - Seccion 3.5.3: Funcion EvaluarNumerico (Pagina 81)
 * Descripcion: Actua como selector entre las funciones EsNumeroEntero (tipo 1)
 * y EsNumeroDouble (tipo 2) mediante una estructura switch.
 */
public class Ejercicio10_3_5_3_EvaluarNumerico {

    public static boolean EsNumeroEntero(String dato) {
        if (dato == null || dato.isEmpty()) return false;
        for (char c : dato.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }

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

    // Codigo en Java de la Pagina 81
    public static boolean EvaluarNumerico(String dato, int tipo) {
        boolean valido = false;
        switch (tipo) {
            case 1:
                valido = EsNumeroEntero(dato);
                break;
            case 2:
                valido = EsNumeroDouble(dato);
                break;
        }
        return valido;
    }

    public static void main(String[] args) {
        System.out.println("=== Ejercicio 10: Seccion 3.5.3 - EvaluarNumerico ===");
        System.out.println("Evaluar '500' como entero (tipo 1): " + EvaluarNumerico("500", 1));
        System.out.println("Evaluar '500.25' como entero (tipo 1): " + EvaluarNumerico("500.25", 1));
        System.out.println("Evaluar '500.25' como decimal (tipo 2): " + EvaluarNumerico("500.25", 2));
        System.out.println("Evaluar 'hola' como decimal (tipo 2): " + EvaluarNumerico("hola", 2));
    }
}
