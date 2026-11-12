package a2261330036_estudiodecaso;

public class Ejercicio28_5_4_MostrarProducto {

    public static String RellenarEspacios(String dato, int tamano) {
        String cadena = dato;
        for (int ciclo = dato.length() - 1; ciclo < tamano; ciclo++) {
            cadena = cadena + " ";
        }
        return cadena;
    }

    public static String MostrarProducto(String[] vproducto) {
        String codigo = RellenarEspacios(vproducto[0], 5);
        String producto = RellenarEspacios(vproducto[1], 30);
        String precio = RellenarEspacios(vproducto[2], 10);
        String cantidad = RellenarEspacios(vproducto[3], 10);
        String cadena = codigo.concat(producto + precio + cantidad);
        return cadena;
    }

    public static void main(String[] args) {
        String[] articulo = { "001", "Arroz 1kg", "35", "10" };
        System.out.println(MostrarProducto(articulo));
    }
}
