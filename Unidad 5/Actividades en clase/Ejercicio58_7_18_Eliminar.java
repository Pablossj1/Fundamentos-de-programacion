package a2261330036_estudiodecaso;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Locale;

public class Ejercicio58_7_18_Eliminar {

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

    public static String TotalProducto(String precio, String cantidad) {
        double total = Double.parseDouble(precio) * Double.parseDouble(cantidad);
        return String.format(Locale.US, "%.2f", total);
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

    public static String MostrarProductoTicket(String[][] mticket, int pos) {
        String codigo = RellenarEspacios(mticket[pos][0], 5);
        String producto = RellenarEspacios(mticket[pos][1], 30);
        String precio = RellenarEspacios(mticket[pos][2], 10);
        String cantidad = RellenarEspacios(mticket[pos][3], 5);
        String total = RellenarEspacios(TotalProducto(mticket[pos][2], mticket[pos][3]), 10);
        return codigo.concat(producto + precio + cantidad + total);
    }

    public static String MostrarTicket(String[][] mticket) {
        String salida = "";
        int pos = ObtenerUltimaPosicion(mticket);
        for (int ciclo = 0; ciclo <= pos; ciclo++) {
            salida = salida.concat(MostrarProductoTicket(mticket, ciclo) + "\n");
        }
        return salida;
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

    public static void RemoverProductoTicket(String[][] mticket, int pos) {
        int tam = ObtenerUltimaPosicion(mticket);
        if (tam > pos) {
            for (int i = pos; i < tam; i++) {
                mticket[i] = mticket[i + 1];
            }
            mticket[tam][0] = null;
        } else {
            mticket[pos][0] = null;
        }
    }

    public static void EliminarProductoTicket(String[][] mticket, int pos) {
        int cantidad = Integer.parseInt(mticket[pos][3]);
        if (cantidad > 1) {
            mticket[pos][3] = String.valueOf(cantidad - 1);
        } else {
            RemoverProductoTicket(mticket, pos);
        }
    }

    public static void Eliminar(String[][] mticket, String[][] mproductos) throws IOException {
        String codigo, info;
        info = MostrarTicket(mticket);
        codigo = Leer(info + "\nIntroduce el codigo del producto");
        if (codigo != null) {
            int pos = ExisteTicketCodigo(mticket, codigo);
            if (pos > -1) {
                int posp = ExisteProducto(codigo.trim(), mproductos);
                if (posp > -1) {
                    int cant = Integer.parseInt(mproductos[posp][3]);
                    cant = cant + 1;
                    mproductos[posp][3] = String.valueOf(cant);
                }
                EliminarProductoTicket(mticket, pos);
            } else {
                System.out.println("el codigo no existe en el ticket");
            }
        } else {
            System.out.println("dato nulo\n");
        }
    }

    public static void main(String[] args) throws IOException {
        System.out.println("Procedimiento Eliminar configurado.");
    }
}
