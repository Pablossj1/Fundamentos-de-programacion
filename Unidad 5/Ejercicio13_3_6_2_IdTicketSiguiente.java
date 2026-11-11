package a2261330036_estudiodecaso;

/**
 * Ejercicio 13 - Seccion 3.6.2: Funcion IdTicketSiguiente (Pagina 88)
 * Descripcion: Incrementa en 1 el identificador de ticket numerico y
 * asegura que mantenga el formato con ceros a la izquierda (ej. 001, 010, 100).
 */
public class Ejercicio13_3_6_2_IdTicketSiguiente {

    // Codigo en Java de la Pagina 88
    public static String IdTicketSiguiente(String idticket) {
        String idticketnext = "";
        int num = Integer.parseInt(idticket) + 1;
        if (num < 10) {
            idticketnext = "00" + String.valueOf(num).trim();
        } else if ((num > 9) && (num < 100)) {
            idticketnext = "0" + String.valueOf(num).trim();
        } else {
            idticketnext = String.valueOf(num).trim();
        }
        return idticketnext;
    }

    public static void main(String[] args) {
        System.out.println("=== Ejercicio 13: Seccion 3.6.2 - IdTicketSiguiente ===");
        String ticket0 = "000";
        String ticket8 = "008";
        String ticket89 = "089";
        String ticket99 = "099";

        System.out.println("Ticket actual: " + ticket0 + " -> Siguiente: " + IdTicketSiguiente(ticket0));
        System.out.println("Ticket actual: " + ticket8 + " -> Siguiente: " + IdTicketSiguiente(ticket8));
        System.out.println("Ticket actual: " + ticket89 + " -> Siguiente: " + IdTicketSiguiente(ticket89));
        System.out.println("Ticket actual: " + ticket99 + " -> Siguiente: " + IdTicketSiguiente(ticket99));
    }
}
