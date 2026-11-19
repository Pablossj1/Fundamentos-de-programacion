package a2261330036_estudiodecaso;

public class Ejercicio63_7_23_MostrarVenta {

    public static String RellenarEspacios(String dato, int tamano) {
        if (dato == null) {
            dato = "";
        }
        String cadena = dato;
        for (int ciclo = dato.length() - 1; ciclo < tamano; ciclo++) {
            cadena = cadena + " ";
        }
        return cadena;
    }

    public static String MostrarVenta(String[] venta) {
        String idticket = RellenarEspacios(venta[0], 6);
        String codigo = RellenarEspacios(venta[1], 5);
        String producto = RellenarEspacios(venta[2], 30);
        String precio = RellenarEspacios(venta[3], 10);
        String cantidad = RellenarEspacios(venta[4], 10);
        return idticket.concat(codigo + producto + precio + cantidad);
    }

    public static void main(String[] args) {
        String[] v = {"001", "P01", "Arroz Extra 1kg", "25.00", "2"};
        System.out.println(MostrarVenta(v));
    }
}
