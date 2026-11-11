package a2261330036_estudiodecaso;

import java.util.Date;
import java.text.SimpleDateFormat;

/**
 * Ejercicio 15 - Seccion 3.7: Funcion Fecha (Pagina 95)
 * Descripcion: Retorna la fecha actual del sistema formateada en formato "dd-MM-yyyy"
 * utilizando java.util.Date y java.text.SimpleDateFormat.
 */
public class Ejercicio15_3_7_FuncionFecha {

    // Codigo en Java de la Pagina 95
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
