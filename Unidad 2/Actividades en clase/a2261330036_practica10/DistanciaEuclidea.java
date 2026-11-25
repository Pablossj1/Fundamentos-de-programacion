package a2261330036_practica10;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class DistanciaEuclidea {
    
    public static double calcularDistancia(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static void main(String[] args) throws IOException {
        BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
        double x1, y1, x2, y2;

        System.out.print("Ingresa la coordenada x del primer punto: ");
        x1 = Double.parseDouble(lectura.readLine());
        System.out.print("Ingresa la coordenada y del primer punto: ");
        y1 = Double.parseDouble(lectura.readLine());
        System.out.print("Ingresa la coordenada x del segundo punto: ");
        x2 = Double.parseDouble(lectura.readLine());
        System.out.print("Ingresa la coordenada y del segundo punto: ");
        y2 = Double.parseDouble(lectura.readLine());

        System.out.println("La distancia euclídea es: " + calcularDistancia(x1, y1, x2, y2));
    }
}
