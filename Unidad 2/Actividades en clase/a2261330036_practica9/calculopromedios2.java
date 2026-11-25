package a2261330036_practica9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class calculopromedios2 {
    public static void main(String args[]) throws NumberFormatException, IOException {
        int ciclop, cicloh, nalum, nparcial, cal, scal;
        double palum, sprom, pgeneral;
        String salida = "";
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("cuantos alumnos vas a evaluar");
        nalum = Integer.parseInt(entrada.readLine());
        System.out.println("cuantos parciales vas a evaluar");
        nparcial = Integer.parseInt(entrada.readLine());
        
        ciclop = 1;
        sprom = 0.0;
        
        do {
            cicloh = 1;
            scal = 0;
            
            do {
                System.out.println("calificacion del alumno " + ciclop + " parcial " + cicloh);
                cal = Integer.parseInt(entrada.readLine());
                scal = scal + cal;
                cicloh++;
            } while (cicloh <= nparcial);
            
            palum = (double)scal / nparcial;
            salida = salida + "El promedio del alumno " + ciclop + " fue " + palum + "\n";
            sprom = sprom + palum;
            ciclop++;
            
        } while (ciclop <= nalum);
        
        pgeneral = sprom / nalum;
        salida = salida + "El promedio general fue " + pgeneral;
        System.out.println(salida);
        System.exit(0);
    }
}
