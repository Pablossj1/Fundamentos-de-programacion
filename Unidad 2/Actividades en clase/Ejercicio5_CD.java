package a2261330036_practica7;
import javax.swing.JOptionPane;

public class Ejercicio5_CD {
    public static void main(String args[]) {
        int num;
        String entrada;
        String salida;
        entrada = JOptionPane.showInputDialog("Introduce un Numero");
        num = Integer.parseInt(entrada);
        salida = "";
        if ((num > 0) && (num % 2 == 0))
            salida = "Es Positivo y Par";
        else
            if ((num > 0) && (num % 2 > 0))
                salida = "Es Positivo e Impar";
            else
                if ((num < 0) && (num % 2 == 0))
                    salida = "Es Negativo y Par";
                else
                    salida = "Es Negativo e ImPar";
        JOptionPane.showMessageDialog(null, salida);
        System.exit(0);
    }
}
