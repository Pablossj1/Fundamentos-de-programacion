package a2261330036_estudiodecaso;

/**
 * Ejercicio 14 - Seccion 3.6.3: Funcion ObtenerUltimaPosicion (Pagina 91)
 * Descripcion: Recorre una matriz bidimensional de cadenas e identifica
 * el indice de la ultima fila que no sea nula ni este vacia.
 */
public class Ejercicio14_3_6_3_ObtenerUltimaPosicion {

    // Codigo en Java de la Pagina 91
    public static int ObtenerUltimaPosicion(String[][] matriz) {
        int ultimaPosicion = -1;
        for (int i = 0; i < matriz.length; i++) {
            if (matriz[i][0] != null && !matriz[i][0].isEmpty()) {
                ultimaPosicion = i;
            }
        }
        return ultimaPosicion;
    }

    public static void main(String[] args) {
        System.out.println("=== Ejercicio 14: Seccion 3.6.3 - ObtenerUltimaPosicion ===");
        // Declaramos una matriz de 5 filas y 2 columnas
        String[][] tickets = new String[5][2];
        tickets[0][0] = "001";
        tickets[0][1] = "Venta Mostrador 1";
        tickets[1][0] = "002";
        tickets[1][1] = "Venta Mostrador 2";
        tickets[2][0] = "003";
        tickets[2][1] = "Venta Mostrador 3";

        int ultimaPos = ObtenerUltimaPosicion(tickets);
        System.out.println("Ultima fila con datos registrada (indice base 0): " + ultimaPos);
        System.out.println("Ticket en esa posicion: " + tickets[ultimaPos][0] + " - " + tickets[ultimaPos][1]);
    }
}
