package a2261330036_puntoventa2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Date;
import java.text.SimpleDateFormat;

public class PuntoVenta2 {

    public static String ultimoIdTicket = "000";

    public static String Dialogo(String texto) throws IOException {
        System.out.println(texto + " : ");
        BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
        return lectura.readLine();
    }

    public static String MostrarMenu(String[] opciones) {
        String cadena = "";
        int i = 0;
        while (i < opciones.length) {
            cadena += (i + 1) + ". " + opciones[i] + "\n";
            i++;
        }
        return cadena;
    }

    public static String DesplegarMenu(String Titulo1, String[] menu) throws IOException {
        String cadena;
        cadena = Titulo1 + "\n\n";
        cadena = cadena + MostrarMenu(menu);
        cadena = cadena + "\n Que opcion deseas ";
        return Dialogo(cadena);
    }

    public static String Fecha() {
        Date fecha = new Date();
        SimpleDateFormat formatodia = new SimpleDateFormat("dd-MM-yyyy");
        return formatodia.format(fecha);
    }

    public static String IdTicketSiguiente(String idticket) {
        int num = Integer.parseInt(idticket) + 1;
        if (num < 10) {
            return "00" + String.valueOf(num).trim();
        } else if ((num > 9) && (num < 100)) {
            return "0" + String.valueOf(num).trim();
        } else {
            return String.valueOf(num).trim();
        }
    }

    public static void MenuProductos() throws IOException {
        String[] datosmenuproductos = { "1.-Modificar ", "2.-Listado ", "3.-Salida " };
        String opcion = "0";
        do {
            opcion = DesplegarMenu("Opciones de Productos", datosmenuproductos);
            if (opcion == null) {
                System.out.println("opcion incorrecta ");
            } else {
                switch (opcion) {
                    case "1":
                        System.out.println("Modificar Precio Producto ");
                        break;
                    case "2":
                        System.out.println("Listado Producto ");
                        break;
                    case "3":
                        System.out.println("Salida del Sistema ");
                        break;
                    default:
                        System.out.println("No existe esta opcion ");
                        break;
                }
            }
        } while (opcion == null || opcion.compareTo("3") != 0);
    }

    public static void MenuPuntoVenta(String idticket) throws IOException {
        String opcion, membrete;
        Boolean pago = false;
        idticket = IdTicketSiguiente(idticket);
        ultimoIdTicket = idticket;
        String fechadia = Fecha();
        membrete = "Fecha del Dia " + fechadia + " Ticket No " + idticket;
        membrete = membrete + "\n-----------------------------------------------------\n";
        String[] datosmenu = { "1.-Agregar ", "2.-Eliminar ", "3.-Listado ", "4.-Pagar ", "5.-Salida " };
        do {
            opcion = DesplegarMenu(membrete + "\n Menu de Punto de Venta", datosmenu);
            if (opcion == null) {
                System.out.println("dato incorrecto introducido");
            } else {
                switch (opcion) {
                    case "1":
                        System.out.println("Agregar Articulo al Ticket ");
                        break;
                    case "2":
                        System.out.println("Eliminar Articulo del Ticket ");
                        break;
                    case "3":
                        System.out.println("Listado de Articulos del Ticket ");
                        break;
                    case "4":
                        System.out.println("Pagar Ticket y salir");
                        opcion = "5";
                        pago = true;
                        break;
                    case "5":
                        System.out.println("Salida del Ventas ");
                        if (!pago) {
                            System.out.println("No pago el ticket ");
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

    public static void MenuInventario() throws IOException {
        String[] datosmenuinventario = { "1.-Listado ", "2.-Agregar ", "3.-Salida " };
        String opcion = "0";
        do {
            opcion = DesplegarMenu("Opciones de Inventarios", datosmenuinventario);
            if (opcion == null) {
                System.out.println("opcion incorrecta ");
            } else {
                switch (opcion) {
                    case "1":
                        System.out.println("Listado de Inventario ");
                        break;
                    case "2":
                        System.out.println("Agregar Inventario ");
                        break;
                    case "3":
                        System.out.println("Salida del Sistema ");
                        break;
                    default:
                        System.out.println("No existe esta opcion ");
                        break;
                }
            }
        } while (opcion == null || opcion.compareTo("3") != 0);
    }

    public static void MenuPrincipal() throws IOException {
        String[] datosmenuprincipal = { "1.-Productos ", "2.-Punto de Venta ", "3.- Inventario", "4.-Ventas ", "5.-Salida " };
        String opcion = "0";
        do {
            opcion = DesplegarMenu("Menu de Punto de Tienda de Abarrotes la Pequeña", datosmenuprincipal);
            if (opcion == null) {
                System.out.println("opcion incorrecta ");
            } else {
                switch (opcion) {
                    case "1":
                        MenuProductos();
                        break;
                    case "2":
                        MenuPuntoVenta(ultimoIdTicket);
                        break;
                    case "3":
                        MenuInventario();
                        break;
                    case "4":
                        System.out.println("Ventas");
                        break;
                    case "5":
                        System.out.println("Salida del Sistema ");
                        break;
                    default:
                        System.out.println("No existe esta opcion ");
                        break;
                }
            }
        } while (opcion == null || opcion.compareTo("5") != 0);
    }

    public static void main(String[] args) throws IOException {
        MenuPrincipal();
    }
}
