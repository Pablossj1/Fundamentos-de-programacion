package a2261330036_practica7;
import java.io.IOException;
import java.io.*;

public class ejercicio_7_1_mc_buffer {
    public static void main (String Args[]) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        int dia;
        System.out.println("introduce el valor del dia [1..7]");
        dia = Integer.parseInt(entrada.readLine());
        if (dia == 1) {
            System.out.println("LUNES");
        } else {
            if (dia == 2) {
                System.out.println("MARTES");
            } else {
                if (dia == 3) {
                    System.out.println("MIERCOLES");
                } else {
                    if (dia == 4) {
                        System.out.println("JUEVES");
                    } else {
                        if (dia == 5) {
                            System.out.println("VIERNES");
                        } else {
                            if (dia == 6) {
                                System.out.println("SABADO");
                            } else {
                                if (dia == 7) {
                                    System.out.println("DOMINGO");
                                } else {
                                    System.out.println("NO EXISTE");
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
