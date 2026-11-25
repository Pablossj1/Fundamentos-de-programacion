package a2261330036_practica6;

import javax.swing.JOptionPane;

public class ejercicio02_mc_cuadrodialogo {

    public static void main(String[] args )
    {
        //declaracion de las variables
        int numero;
        int dm, um, c, d, u;
        String salida;
        // solicitud y captura del numero
        numero=Integer.parseInt(JOptionPane.showInputDialog("Introduzca un número entre 0 y 99.999: "));
        dm =(int)numero/10000;
        numero= numero %10000;
        um=(int)numero/1000;
        numero= numero %1000;
        c=(int)numero/100;
        numero= numero %100;
        d=(int)numero/10;
        numero= numero %10;
        u= numero;
        // lo imprimimos al revés:
        salida=u + " " + d + " " + c + " " + um + " " + dm;
        // otra forma de hacerlo es
        numero = 10000*u + 1000*d + 100*c + 10*um + dm;
        salida= salida+"\n"+numero;
        System.out.println (salida);
        JOptionPane.showMessageDialog(null, salida);
    }
}

