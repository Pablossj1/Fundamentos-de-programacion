package a2261330036_practica7;
import javax.swing.JOptionPane;

public class ejercicio_6_cuadrodialogo {
    public static void main(String args[]) {
        int parcial1, parcial2, parcial3;
        double resultado;
        parcial1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce la calificacion del Parcial 1"));
        parcial2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce la calificacion del Parcial 2"));
        parcial3 = Integer.parseInt(JOptionPane.showInputDialog("Introduce la calificacion del Parcial 3"));
        resultado = (parcial1 + parcial2 + parcial3) / 3;
        if ((resultado >= 7)) {
            JOptionPane.showMessageDialog(null, "ALUMNO ACREDITADO ");
        } else {
            JOptionPane.showMessageDialog(null, "ALUMNO NO ACREDITADO");
        }
    }
}
