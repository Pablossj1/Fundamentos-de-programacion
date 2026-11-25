package a2261330036_practica6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ejercicio04_mc {
    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        int num, dm, um, c, d, u;
        String salida;
        
        System.out.print("Introduzca un número entre 0 y 99.999: ");
        num = Integer.parseInt(entrada.readLine());
        
        u = num % 10;
        num = num / 10;
        d = num % 10;
        num = num / 10;
        c = num % 10;
        num = num / 10;
        um = num % 10;
        num = num / 10;
        dm = num;
        
        salida = u + " " + d + " " + c + " " + um + " " + dm;
        num = 10000 * u + 1000 * d + 100 * c + 10 * um + dm;
        
        System.out.println(salida);
        System.out.println(num);
    }
}

