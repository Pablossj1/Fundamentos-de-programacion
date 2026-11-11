package a2261330036_estudiodecaso;

/**
 * Ejercicio 04 - Seccion 3.3.1: Funcion MostrarMenu con ciclo For-Each (Pagina 66)
 * Descripcion: Recorre el arreglo de opciones mediante el ciclo for mejorado
 * evitando la necesidad de manejar indices manualmente.
 */
public class Ejercicio04_3_3_1_MostrarMenuForEach {

    // Codigo en Java de la Pagina 66
    public static String MostrarMenu(String[] opciones) {
        String cadena = "";
        for (String info : opciones) {
            cadena = cadena + info + "\n";
        }
        return cadena;
    }

    public static void main(String[] args) {
        System.out.println("=== Ejercicio 04: Seccion 3.3.1 - MostrarMenu con For-Each ===");
        String[] listaOpciones = {
            "1.- Modificar Producto",
            "2.- Listado de Productos",
            "3.- Salida"
        };

        String resultado = MostrarMenu(listaOpciones);
        System.out.println("Menu generado con bucle for-each:\n" + resultado);
    }
}
