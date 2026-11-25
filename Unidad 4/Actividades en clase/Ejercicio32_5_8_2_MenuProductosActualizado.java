package a2261330036_estudiodecaso;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Ejercicio32_5_8_2_MenuProductosActualizado {

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

    public static void MenuProductos(String[][] vproductos) throws IOException {
        String[] datosmenuproductos = { "1.-Modificar ", "2.-Listado ", "3.-Salida " };
        String opcion = "0";
        do {
            opcion = DesplegarMenu("Opciones de Productos", datosmenuproductos);
            if (opcion == null) {
                System.out.println("opcion incorrecta ");
            } else {
                switch (opcion) {
                    case "1":
                        Ejercicio31_5_7_ModificarProducto.ModificarProducto(vproductos);
                        break;
                    case "2":
                        System.out.println(Ejercicio31_5_7_ModificarProducto.MostrarLista(vproductos));
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

    public static void main(String[] args) throws IOException {
        String[][] productos = Ejercicio27_5_3_2_CargarProductosDirecto.CargarProductos();
        MenuProductos(productos);
    }
}
