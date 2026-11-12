package a2261330036_estudiodecaso;

public class Ejercicio29_5_5_MostrarLista {

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
        return codigo.concat(producto + precio + cantidad);
    }

    public static String MostrarLista(String[][] vproductos) {
        String salida = "";
        for (int ciclo = 0; ciclo < 10; ciclo++) {
            String[] vproducto = { vproductos[ciclo][0], vproductos[ciclo][1], vproductos[ciclo][2], vproductos[ciclo][3] };
            String cadena = MostrarProducto(vproducto);
            salida = salida.concat(cadena + "\n");
        }
        return salida;
    }

    public static void main(String[] args) {
        String[][] productos = Ejercicio27_5_3_2_CargarProductosDirecto.CargarProductos();
        System.out.println(MostrarLista(productos));
    }
}
