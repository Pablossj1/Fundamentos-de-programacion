package a2261330036_practica10;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class ejercicio01_a {
    
    static BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));

    public static double pedirdato(String mensaje) throws IOException {
        double num;
        System.out.println(mensaje);
        num = Double.parseDouble(lectura.readLine());
        return num;
    }

    public static double calcularareacirculo(double radio) {
        double area;
        area = Math.PI * radio * radio;
        return area;
    }

    public static double calcularareatriangulo(double base, double altura) {
        double area;
        area = (base * altura) / 2;
        return area;
    }

    public static double calculararearectangulo(double base, double altura) {
        double area;
        area = base * altura;
        return area;
    }

    public static double calcularareatrapecio(double baseMayor, double baseMenor, double altura) {
        double area;
        area = ((baseMayor + baseMenor) / 2) * altura;
        return area;
    }

    public static void mostrarmenu() {
        System.out.println("Menú:");
        System.out.println("c.- Calcular área del circulo");
        System.out.println("t.- Calcular área del triángulo");
        System.out.println("r.- Calcular área del rectángulo");
        System.out.println("p.- Calcular área del trapecio");
        System.out.println("s.- Salir");
        System.out.print("Elige una opción: ");
    }

    public static void main(String[] args) throws IOException {
        String opcion;
        double radio, base, altura, baseMayor, baseMenor;
        
        mostrarmenu();
        opcion = lectura.readLine().toUpperCase();
        
        while (!opcion.equals("S")) {
            switch (opcion) {
                case "C":
                    radio = pedirdato("Ingresa el radio del circulo: ");
                    System.out.println("El área del circulo es: " + calcularareacirculo(radio));
                    break;
                case "T":
                    base = pedirdato("Ingresa la base del triángulo: ");
                    altura = pedirdato("Ingresa la altura del triángulo: ");
                    System.out.println("El área del triángulo es: " + calcularareatriangulo(base, altura));
                    break;
                case "R":
                    base = pedirdato("Ingresa la base del rectángulo: ");
                    altura = pedirdato("Ingresa la altura del rectángulo: ");
                    System.out.println("El área del rectángulo es: " + calculararearectangulo(base, altura));
                    break;
                case "P":
                    baseMayor = pedirdato("Ingresa la base mayor del trapecio: ");
                    baseMenor = pedirdato("Ingresa la base menor del trapecio: ");
                    altura = pedirdato("Ingresa la altura del trapecio: ");
                    System.out.println("El área del trapecio es: " + calcularareatrapecio(baseMayor, baseMenor, altura));
                    break;
                default:
                    System.out.println("Opción inválida.");
                    break;
            }
            
            System.out.println();
            mostrarmenu();
            opcion = lectura.readLine().toUpperCase();
        }
        
        System.out.println("Saliendo del programa.");
    }
}