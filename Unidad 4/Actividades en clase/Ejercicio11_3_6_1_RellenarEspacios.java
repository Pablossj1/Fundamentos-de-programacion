package a2261330036_estudiodecaso;

public class Ejercicio11_3_6_1_RellenarEspacios {

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
