package a2261330036_estudiodecaso;

public class Ejercicio08_3_5_1_EsNumeroEntero {

    public static boolean EsNumeroEntero(String dato) {
        if (dato == null || dato.isEmpty()) return false;
        for (char c : dato.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("=== Ejercicio 08: Seccion 3.5.1 - EsNumeroEntero ===");
        String prueba1 = "12345";
        String prueba2 = "12a45";
        String prueba3 = "990";

        System.out.println("¿Es '" + prueba1 + "' entero?: " + EsNumeroEntero(prueba1));
        System.out.println("¿Es '" + prueba2 + "' entero?: " + EsNumeroEntero(prueba2));
        System.out.println("¿Es '" + prueba3 + "' entero?: " + EsNumeroEntero(prueba3));
    }
}
