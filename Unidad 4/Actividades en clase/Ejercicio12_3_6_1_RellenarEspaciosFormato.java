package a2261330036_estudiodecaso;

public class Ejercicio12_3_6_1_RellenarEspaciosFormato {

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
