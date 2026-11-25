package a2261330036_practica7;
import javax.swing.JOptionPane;

public class ejercicio_8_3_cuadrodialogo {
    public static void main(String args[]) {
        int l1, l2, l3;
        
        l1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado 1:"));
        l2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado 2:"));
        l3 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado 3:"));
        
        if (l1 == l2 && l2 == l3) {
            JOptionPane.showMessageDialog(null, "Es un triangulo Equilatero");
        } else {
            if (l1 != l2 && l1 != l3 && l2 != l3) {
                JOptionPane.showMessageDialog(null, "Es un triangulo Escaleno");
            } else {
                JOptionPane.showMessageDialog(null, "Es un triangulo Isosceles");
            }
        }
        
        System.exit(0);
    }
}	
