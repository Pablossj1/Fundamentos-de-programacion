package a2261330036_estudiodecaso;

public class Ejercicio45_7_5_ExisteTicketCodigo {

    public static int ObtenerUltimaPosicion(String[][] matriz) {
        int posicion = 0;
        int tamano = matriz.length;
        while (posicion < tamano) {
            if (matriz[posicion][0] == null) {
                break;
            }
            posicion++;
        }
        return posicion - 1;
    }

    public static int ExisteTicketCodigo(String[][] mticket, String codigo) {
        int enc = -1;
        int pos = ObtenerUltimaPosicion(mticket);
        for (int ciclo = 0; ciclo <= pos; ciclo++) {
            if (mticket[ciclo][0] != null && mticket[ciclo][0].compareTo(codigo.trim()) == 0) {
                enc = ciclo;
                break;
            }
        }
        return enc;
    }

    public static void main(String[] args) {
        String[][] ticket = new String[20][4];
        ticket[0] = new String[]{"P01", "Arroz", "25.00", "2"};
        ticket[1] = new String[]{"P02", "Frijol", "30.00", "1"};
        System.out.println("Buscar P02: " + ExisteTicketCodigo(ticket, "P02"));
        System.out.println("Buscar P99: " + ExisteTicketCodigo(ticket, "P99"));
    }
}
