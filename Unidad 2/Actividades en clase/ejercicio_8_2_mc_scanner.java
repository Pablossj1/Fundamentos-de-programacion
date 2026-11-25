package a2261330036_practica7;
import java.util.Scanner;

public class ejercicio_8_2_mc_scanner {
    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        int l1, l2, l3;
        
        System.out.println("Introduce el lado 1:");
        l1 = entrada.nextInt();
        System.out.println("Introduce el lado 2:");
        l2 = entrada.nextInt();
        System.out.println("Introduce el lado 3:");
        l3 = entrada.nextInt();
        
        if (l1 == l2 && l2 == l3) 
            System.out.println("Es un triangulo Equilatero");
        
        if ((l1 == l2 && l1 != l3) || (l1 == l3 && l1 != l2) || (l2 == l3 && l2 != l1)) 
            System.out.println("Es un triangulo Isosceles");
            
        if (l1 != l2 && l1 != l3 && l2 != l3) 
            System.out.println("Es un triangulo Escaleno");
    }
}
