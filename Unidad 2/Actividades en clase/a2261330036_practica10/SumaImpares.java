package a2261330036_practica10;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class SumaImpares {
    
    public static int sumarImpares(int n) {
        int suma = 0;
        int impar = 1;
        
        for (int i = 0; i < n; i++) {
            suma += impar;
            impar += 2; 
        }
        
        return suma;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
        int n;

        System.out.print("Ingresa la cantidad (N) de números impares que deseas sumar: ");
        n = Integer.parseInt(lectura.readLine());

        System.out.println("La suma de los primeros " + n + " números impares es: " + sumarImpares(n));
    }
}