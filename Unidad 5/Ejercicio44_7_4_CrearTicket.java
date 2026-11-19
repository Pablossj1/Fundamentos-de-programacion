package a2261330036_estudiodecaso;

public class Ejercicio44_7_4_CrearTicket {

    public static String[][] CrearTicket() {
        return new String[20][4];
    }

    public static void main(String[] args) {
        String[][] ticket = CrearTicket();
        System.out.println("Ticket creado con filas: " + ticket.length + " y columnas: " + ticket[0].length);
    }
}
