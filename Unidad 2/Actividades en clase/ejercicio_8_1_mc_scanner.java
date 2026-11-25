package a2261330036_practica7;
import java.util.Scanner;

public class ejercicio_8_1_mc_scanner {
    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        double tarifa, total, descuento = 0;
        int tipoCliente;
        
        System.out.println("Introduce la tarifa base (en pesos):");
        tarifa = entrada.nextDouble();
        
        System.out.println("Tipo de cliente (1=Normal, 2=Profesor, 3=Alumno):");
        tipoCliente = entrada.nextInt();
        
        if (tipoCliente == 2) descuento = tarifa * 0.20;
        if (tipoCliente == 3) descuento = tarifa * 0.10;
        
        total = (tarifa - descuento) * 1.16;
        
        System.out.println("El total a pagar con IVA incluido es: $" + total);
    }
}
