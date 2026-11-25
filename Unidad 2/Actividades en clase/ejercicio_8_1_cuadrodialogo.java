package a2261330036_practica7;
import javax.swing.JOptionPane;

public class ejercicio_8_1_cuadrodialogo {
    public static void main(String args[]) {
        double tarifa, total, descuento = 0;
        int tipoCliente;
        
        tarifa = Double.parseDouble(JOptionPane.showInputDialog("Introduce la tarifa base (en pesos):"));
        tipoCliente = Integer.parseInt(JOptionPane.showInputDialog("Tipo de cliente (1=Normal, 2=Profesor, 3=Alumno):"));
        
        if (tipoCliente == 2) descuento = tarifa * 0.20;
        if (tipoCliente == 3) descuento = tarifa * 0.10;
        
        total = (tarifa - descuento) * 1.16;
        
        JOptionPane.showMessageDialog(null, "El total a pagar con IVA incluido es: $" + total);
        System.exit(0);
    }
}
