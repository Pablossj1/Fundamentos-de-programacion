package a2261330036_practica7;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ejercicio_8_1_mc_buffer {
    public static void main(String args[]) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        double tarifa, total, descuento = 0;
        int tipoCliente;
        
        System.out.println("Introduce la tarifa base (en pesos):");
        tarifa = Double.parseDouble(entrada.readLine());
        
        System.out.println("Tipo de cliente (1=Normal, 2=Profesor, 3=Alumno):");
        tipoCliente = Integer.parseInt(entrada.readLine());
        
        if (tipoCliente == 2) descuento = tarifa * 0.20;
        if (tipoCliente == 3) descuento = tarifa * 0.10;
        
        total = (tarifa - descuento) * 1.16; // Se resta el descuento y se suma el 16% de IVA
        
        System.out.println("El total a pagar con IVA incluido es: $" + total);
    }
}
