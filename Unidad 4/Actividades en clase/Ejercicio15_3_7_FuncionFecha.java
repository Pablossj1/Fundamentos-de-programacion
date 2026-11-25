package a2261330036_estudiodecaso;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Ejercicio15_3_7_FuncionFecha {

    public static String Fecha() {
        Date fecha = new Date();
        SimpleDateFormat formatodia = new SimpleDateFormat("dd-MM-yyyy");
        return formatodia.format(fecha);
    }

    public static void main(String[] args) {
        System.out.println("=== Ejercicio 15: Seccion 3.7 - Funcion Fecha ===");
        String fechaHoy = Fecha();
        System.out.println("Fecha actual del sistema: " + fechaHoy);
    }
}
