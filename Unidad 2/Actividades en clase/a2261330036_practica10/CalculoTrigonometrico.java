package a2261330036_practica10;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class CalculoTrigonometrico {
    
    public static void mostrarTrigonometria(double angulo) {
        double rad = Math.toRadians(angulo);
        
        System.out.println("Seno: " + Math.sin(rad));
        System.out.println("Coseno: " + Math.cos(rad));
        System.out.println("Tangente: " + Math.tan(rad));
    }

    public static void main(String[] args) throws IOException {
        BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
        double angulo;

        System.out.print("Ingresa el valor del ángulo en grados: ");
        angulo = Double.parseDouble(lectura.readLine());

        mostrarTrigonometria(angulo);
    }
}
