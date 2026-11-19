package a2261330036_estudiodecaso;

public class Ejercicio43_7_3_UltimoTicket {

    public static String UltimoTicket(int pos, String[][] mventa) {
        String idticket = "000";
        if (pos > -1) {
            idticket = mventa[pos][0];
        }
        return idticket;
    }

    public static void main(String[] args) {
        String[][] mventa = new String[100][5];
        System.out.println("Ultimo ticket inicial: " + UltimoTicket(-1, mventa));
        mventa[0][0] = "001";
        System.out.println("Ultimo ticket con datos: " + UltimoTicket(0, mventa));
    }
}
