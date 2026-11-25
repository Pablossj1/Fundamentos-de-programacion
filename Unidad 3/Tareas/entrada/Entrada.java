package entrada;

import java.io.*;

public class Entrada {
    static String inicializar(){
        String buzon = "";
        InputStreamReader flujo = new InputStreamReader(System.in);
        BufferedReader teclado = new BufferedReader(flujo);
        try {
            buzon = teclado.readLine();
        } catch(Exception e) {
            System.out.append("Entrada incorrecta");
        }
        return buzon != null ? buzon.trim() : "";
    }

    public static int entero(){
        try {
            return Integer.parseInt(inicializar());
        } catch (Exception e) {
            return 0;
        }
    }

    public static double real(){
        try {
            return Double.parseDouble(inicializar().replace(',', '.'));
        } catch (Exception e) {
            return 0.0;
        }
    }

    public static String cadena(){
        return inicializar();
    }

    public static char caracter(){
        String s = inicializar();
        return s.length() > 0 ? s.charAt(0) : ' ';
    }
}
