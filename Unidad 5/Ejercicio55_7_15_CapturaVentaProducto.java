package a2261330036_estudiodecaso;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Ejercicio55_7_15_CapturaVentaProducto {

    public static BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));

    public static String Dialogo(String texto) throws IOException {
        System.out.println(texto + " : ");
        return lector.readLine();
    }

    public static String Leer(String texto) throws IOException {
        String cadena = Dialogo(texto);
        if (cadena != null) {
            cadena = cadena.trim();
            if (cadena.isEmpty()) {
                cadena = null;
            }
        } else {
            cadena = null;
        }
        return cadena;
    }

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

    public static int ExisteProducto(String codigo, String[][] vproductos) {
        int enc = -1;
        int tam = vproductos.length;
        for (int ciclo = 0; ciclo < tam; ciclo++) {
            if (vproductos[ciclo][0] != null && vproductos[ciclo][0].compareTo(codigo.trim()) == 0) {
                enc = ciclo;
                break;
            }
        }
        return enc;
    }

    public static int ObtenerUltimaPosicion(String[][] matriz) {
        int posicion = 0;
        int tamano = matriz.length;
        while (posicion < tamano) {
            if (matriz[posicion][0] == null) {
                break;
            }
            posicion++;
        }
        return posicion - 1;
    }

    public static int ExisteTicketCodigo(String[][] mticket, String codigo) {
        int enc = -1;
        int pos = ObtenerUltimaPosicion(mticket);
        for (int ciclo = 0; ciclo <= pos; ciclo++) {
            if (mticket[ciclo][0] != null && mticket[ciclo][0].compareTo(codigo.trim()) == 0) {
                enc = ciclo;
                break;
            }
        }
        return enc;
    }

    public static boolean InsertarProductoTicket(String[][] mticket, String[] datos, int tamticket) {
        boolean sucedio = true;
        int posticket = ObtenerUltimaPosicion(mticket);
        int enc = ExisteTicketCodigo(mticket, datos[0]);
        if (posticket < tamticket - 1) {
            if (enc > -1) {
                int cantidadActual = Integer.parseInt(mticket[enc][3]);
                int cantidadNueva = Integer.parseInt(datos[3]);
                mticket[enc][3] = String.valueOf(cantidadActual + cantidadNueva);
            } else {
                posticket++;
                mticket[posticket] = datos.clone();
            }
        } else {
            sucedio = false;
        }
        return sucedio;
    }

    public static void CapturaVentaProducto(String[][] mticket, String[][] mproductos, String idticket, int tamticket) throws IOException {
        String codigo, info;
        info = MostrarListaProductosVenta(mproductos);
        codigo = Leer(info + "\nIntroduce el codigo del producto");
        if (codigo != null) {
            int posp = ExisteProducto(codigo.trim(), mproductos);
            if (posp > -1) {
                if (Integer.parseInt(mproductos[posp][3]) > 0) {
                    String[] producto = mproductos[posp].clone();
                    int cant = Integer.parseInt(mproductos[posp][3]);
                    cant = cant - 1;
                    mproductos[posp][3] = String.valueOf(cant);
                    System.out.println(MostrarProducto(producto));
                    String[] venta = new String[4];
                    venta[0] = mproductos[posp][0];
                    venta[1] = mproductos[posp][1];
                    venta[2] = mproductos[posp][2];
                    venta[3] = "1";
                    if (!InsertarProductoTicket(mticket, venta, tamticket)) {
                        System.out.println("el Arreglo esta lleno \n");
                    }
                } else {
                    System.out.println("no hay productos para venta");
                }
            } else {
                System.out.println("el codigo no existe no se puede agregar\n");
            }
        } else {
            System.out.println("dato nulo\n");
        }
    }

    public static void main(String[] args) throws IOException {
        String[][] productos = new String[5][4];
        productos[0] = new String[]{"001", "Arroz", "25.00", "5"};
        String[][] ticket = new String[20][4];
        System.out.println("Modulo de captura preparado.");
    }
}
