package a2261330036_practica9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MenuConCiclo {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String opcion;
        do {
            System.out.println("Menú:");
            System.out.println("a.- Opción 1");
            System.out.println("b.- Opción 2");
            System.out.println("c.- Opción 3");
            System.out.println("x.- Salir");
            System.out.print("Elige una opción: ");
            opcion = reader.readLine();

            switch (opcion.toLowerCase()) {
                case "a":
                    System.out.println("Has elegido la Opcion 1");
                    break;
                case "b":
                    System.out.println("Has elegido la Opcion 2");
                    break;
                case "c":
                    System.out.println("Has elegido la Opcion 3");
                    break;
                case "x":
                    System.out.println("Adios, saliendo del menú.");
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;
            }
        } while (!opcion.equalsIgnoreCase("x"));
    }
}
