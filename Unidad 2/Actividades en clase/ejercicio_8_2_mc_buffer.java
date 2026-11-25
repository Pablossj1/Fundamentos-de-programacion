package a2261330036_practica7;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ejercicio_8_2_mc_buffer {
    public static void main(String args[]) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        int l1, l2, l3;
        
        System.out.println("Introduce el lado 1:");
        l1 = Integer.parseInt(entrada.readLine());
        System.out.println("Introduce el lado 2:");
        l2 = Integer.parseInt(entrada.readLine());
        System.out.println("Introduce el lado 3:");
        l3 = Integer.parseInt(entrada.readLine());
        
        if (l1 == l2 && l2 == l3) 
            System.out.println("Es un triangulo Equilatero");
        
        if ((l1 == l2 && l1 != l3) || (l1 == l3 && l1 != l2) || (l2 == l3 && l2 != l1)) 
            System.out.println("Es un triangulo Isosceles");
            
        if (l1 != l2 && l1 != l3 && l2 != l3) 
            System.out.println("Es un triangulo Escaleno");
    }
}