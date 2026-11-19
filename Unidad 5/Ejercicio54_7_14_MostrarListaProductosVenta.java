package a2261330036_estudiodecaso;

public class Ejercicio54_7_14_MostrarListaProductosVenta {

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

    public static String MostrarProducto(String[] vproducto) {
        String codigo = RellenarEspacios(vproducto[0], 5);
        String producto = RellenarEspacios(vproducto[1], 30);
        String precio = RellenarEspacios(vproducto[2], 10);
        String cantidad = RellenarEspacios(vproducto[3], 10);
        return codigo.concat(producto + precio + cantidad);
    }

    public static String MostrarListaProductosVenta(String[][] vproductos) {
        String salida = "";
        int tam = vproductos.length;
        for (int ciclo = 0; ciclo < tam; ciclo++) {
            if (vproductos[ciclo][0] != null) {
                int existencia = Integer.parseInt(vproductos[ciclo][3]);
                if (existencia > 0) {
                    String[] vproducto = vproductos[ciclo].clone();
                    String cadena = MostrarProducto(vproducto);
                    salida = salida.concat(cadena + "\n");
                }
            }
        }
        return salida;
    }

    public static void main(String[] args) {
        String[][] catalogo = new String[5][4];
        catalogo[0] = new String[]{"001", "Arroz", "25.00", "10"};
        catalogo[1] = new String[]{"002", "Aceite", "45.00", "0"};
        catalogo[2] = new String[]{"003", "Frijol", "30.00", "5"};
        System.out.println(MostrarListaProductosVenta(catalogo));
    }
}
