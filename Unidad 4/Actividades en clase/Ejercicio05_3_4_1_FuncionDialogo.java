package a2261330036_estudiodecaso;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Ejercicio05_3_4_1_FuncionDialogo {

    public static String Dialogo(String texto) throws IOException {
        String cadena;
        System.out.println(texto + " : ");
        BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
        cadena = lectura.readLine();
        return cadena;
    }

    public static void main(String[] args) {
        try {
            String respuesta = Dialogo("Introduce el nombre del producto");
            System.out.println("Texto capturado por la funcion Dialogo: " + respuesta);
        } catch (IOException e) {
            System.err.println("Error de lectura: " + e.getMessage());
        }
    }
}
