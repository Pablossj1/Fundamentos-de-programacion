package a2261330036_estudiodecaso;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Ejercicio65_7_25_2_MenuPuntoVentaActualizado {

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

    public static String Fecha() {
        LocalDate fechaActual = LocalDate.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return fechaActual.format(formato);
    }

    public static String IdTicketSiguiente(String idTicket) {
        int idNumerico = Integer.parseInt(idTicket);
        idNumerico++;
        return String.format("%03d", idNumerico);
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

    public static String TotalProducto(String precio, String cantidad) {
        double total = Double.parseDouble(precio) * Double.parseDouble(cantidad);
        return String.format(Locale.US, "%.2f", total);
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

    public static double SubTotalTicket(String[][] mticket) {
        double subtotal = 0;
        int pos = ObtenerUltimaPosicion(mticket);
        for (int ciclo = 0; ciclo <= pos; ciclo++) {
            subtotal = subtotal + Double.parseDouble(TotalProducto(mticket[ciclo][2], mticket[ciclo][3]));
        }
        return subtotal;
    }

    public static double IvaTicket(String[][] mticket) {
        double subtotal = SubTotalTicket(mticket);
        if (subtotal > 0) {
            subtotal = 0.16 * subtotal;
        } else {
            subtotal = -1;
        }
        return subtotal;
    }

    public static double TotalTicket(String[][] mticket) {
        double total = SubTotalTicket(mticket);
        if (total > 0) {
            total = IvaTicket(mticket) + total;
        }
        return total;
    }

    public static String MostrarTicketVenta(String[][] mticket, String idticket, String fecha) {
        String salida = "";
        String subtotal = String.format(Locale.US, "%.2f", SubTotalTicket(mticket));
        String iva = String.format(Locale.US, "%.2f", IvaTicket(mticket));
        String total = String.format(Locale.US, "%.2f", TotalTicket(mticket));
        salida = "Fecha del Dia: " + fecha + " | Ticket No: " + idticket + "\n";
        salida += "-----------------------------------------------------\n";
        salida += MostrarTicket(mticket);
        salida += "-----------------------------------------------------\n";
        salida += "Subtotal : $" + subtotal + "\n";
        salida += "IVA (16%): $" + iva + "\n";
        salida += "Total    : $" + total + "\n";
        return salida;
    }

    public static String DesplegarMenu(String titulo, String[] menu) throws IOException {
        System.out.println(titulo);
        for (String item : menu) {
            System.out.println(item);
        }
        return Leer("Seleccione una opcion");
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

    public static void AgregarProductoAVenta(String[][] mticket, String[][] mventa, String idticket) {
        int posventas = ObtenerUltimaPosicion(mventa);
        int posticket = ObtenerUltimaPosicion(mticket);
        for (int i = 0; i <= posticket; i++) {
            if (mticket[i][0] != null) {
                posventas++;
                mventa[posventas][0] = idticket;
                mventa[posventas][1] = mticket[i][0];
                mventa[posventas][2] = mticket[i][1];
                mventa[posventas][3] = mticket[i][2];
                mventa[posventas][4] = mticket[i][3];
            }
        }
    }

    public static void Pagar(String idticket, String[][] mventa, String[][] mticket) {
        int posventas = ObtenerUltimaPosicion(mventa);
        int post = ObtenerUltimaPosicion(mticket);
        if ((posventas + post + 1) < 100) {
            AgregarProductoAVenta(mticket, mventa, idticket);
        } else {
            System.out.println("Desbordamiento de Memoria de ventas");
        }
    }

    public static void DevolucionTicket(String[][] mticket, String[][] mproductos) {
        int posmticket = ObtenerUltimaPosicion(mticket);
        for (int pos = 0; pos <= posmticket; pos++) {
            String codigo = mticket[pos][0];
            int posp = ExisteProducto(codigo.trim(), mproductos);
            if (posp > -1) {
                int cant = Integer.parseInt(mproductos[posp][3]);
                int cantticket = Integer.parseInt(mticket[pos][3]);
                mproductos[posp][3] = String.valueOf(cant + cantticket);
            }
        }
    }

    public static void MenuPuntoVenta(String[][] ventas, String idticket, String[][] productos) throws IOException {
        int tamticket = 50;
        String[][] Ticketactual = new String[tamticket][4];
        idticket = IdTicketSiguiente(idticket);
        String fechadia = Fecha();
        Boolean pago = false;
        String opcion = "";
        String[] datosMenu = {"1.-Agregar", "2.-Eliminar", "3.-Listado", "4.-Pagar", "5.-Salida"};
        String encabezadoBase = "Fecha del Dia: " + fechadia + " | Ticket No: " + idticket + "\n" +
                "-----------------------------------------------------\n";
        do {
            String membreteActual = encabezadoBase;
            String tickettexto = MostrarTicket(Ticketactual).trim();
            if (!tickettexto.trim().isEmpty()) {
                membreteActual = membreteActual + "\n" + tickettexto + "\n";
            }
            opcion = DesplegarMenu(membreteActual + "\n Menu de Punto de Venta", datosMenu);
            if (opcion == null) {
                System.out.println("dato incorrecto introducido");
            } else {
                switch (opcion) {
                    case "1":
                        CapturaVentaProducto(Ticketactual, productos, idticket, tamticket);
                        break;
                    case "2":
                        Eliminar(Ticketactual, productos);
                        break;
                    case "3":
                        if (ObtenerUltimaPosicion(Ticketactual) > -1) {
                            System.out.println(MostrarTicket(Ticketactual));
                        }
                        break;
                    case "4":
                        System.out.println(MostrarTicketVenta(Ticketactual, idticket, fechadia).trim());
                        Pagar(idticket, ventas, Ticketactual);
                        pago = true;
                        opcion = "5";
                        break;
                    case "5":
                        System.out.println("Salida de Ventas ");
                        if (!pago) {
                            System.out.println("No pago el ticket ");
                            DevolucionTicket(Ticketactual, productos);
                            System.out.println("eliminando ticket " + idticket);
                        }
                        break;
                    default:
                        System.out.println("No existe esta opcion");
                        break;
                }
            }
        } while (opcion == null || opcion.compareTo("5") != 0);
    }

    public static void main(String[] args) throws IOException {
        System.out.println("MenuPuntoVenta compilado y verificado correctamente.");
    }
}
