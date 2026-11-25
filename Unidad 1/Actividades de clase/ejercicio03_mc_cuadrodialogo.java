package a2261330036_practica6;

import javax.swing.JOptionPane;

public class ejercicio03_mc_cuadrodialogo {
    public static void main(String[] args)
    {
        //declaracion de las variables
        int a1, a2, d1,d2,m1, m2,dias;
        String salida="";
        // solicitud y captura del numero
        d1 = Integer.parseInt(JOptionPane.showInputDialog("Fecha 1: Introduzca día: "));
        m1 = Integer.parseInt(JOptionPane.showInputDialog("Fecha 1: Introduzca mes: "));
        a1 = Integer.parseInt(JOptionPane.showInputDialog("Fecha 1: Introduzca año: "));
        d2 = Integer.parseInt(JOptionPane.showInputDialog("Fecha 2: Introduzca día: "));
        m2 = Integer.parseInt(JOptionPane.showInputDialog("Fecha 2: Introduzca mes: "));
        a2 = Integer.parseInt(JOptionPane.showInputDialog("Fecha 2: Introduzca año: "));
        // se supone que las fecha introducidas son correctas
        // convertimos las dos fechas a días y calculamos la diferencia
        dias=d2-d1+ 30*(m2-m1)+365*(a2-a1);
        salida="Dias de diferencia:" + dias;
        System.out.println (salida);
        JOptionPane.showMessageDialog(null, salida);
    }
}

