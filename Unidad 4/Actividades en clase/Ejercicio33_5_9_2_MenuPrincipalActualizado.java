package a2261330036_estudiodecaso;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Ejercicio33_5_9_2_MenuPrincipalActualizado {

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
        String cadena = Titulo1 + "\n\n" + MostrarMenu(menu) + "\n Que opcion deseas ";
        return Dialogo(cadena);
    }

    public static void MenuPrincipal(String[][] vproductos) throws IOException {
        String[] datosmenuprincipal = { "1.-Productos ", "2.-Punto de Venta ", "3.- Inventario", "4.-Ventas ", "5.-Salida " };
        String opcion = "0";
        do {
            opcion = DesplegarMenu("Menu de Punto de Tienda de Abarrotes la Pequeña", datosmenuprincipal);
            if (opcion == null) {
                System.out.println("opcion incorrecta ");
            } else {
                switch (opcion) {
                    case "1":
                        Ejercicio32_5_8_2_MenuProductosActualizado.MenuProductos(vproductos);
                        break;
                    case "2":
                        Ejercicio20_4_3_MenuPuntoVenta.MenuPuntoVenta("000");
                        break;
                    case "3":
                        Ejercicio21_4_4_MenuInventario.MenuInventario();
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
        String[][] productos = Ejercicio27_5_3_2_CargarProductosDirecto.CargarProductos();
        MenuPrincipal(productos);
    }
}
