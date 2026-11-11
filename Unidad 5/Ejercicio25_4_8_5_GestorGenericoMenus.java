package a2261330036_estudiodecaso;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Ejercicio25_4_8_5_GestorGenericoMenus {

    public static String Dialogo(String texto) throws IOException {
        System.out.println(texto + " : ");
        BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
        return lectura.readLine();
    }

    public static String MostrarMenu(String[] opciones) {
        String cadena = "";
        for (int i = 0; i < opciones.length; i++) {
            cadena += (i + 1) + ". " + opciones[i] + "\n";
        }
        return cadena;
    }

    public static String DesplegarMenu(String titulo, String[] opciones) throws IOException {
        String cadena = titulo + "\n\n" + MostrarMenu(opciones) + "\n Que opcion deseas ";
        return Dialogo(cadena);
    }

    public static void GestionarMenu(String titulo, String[] opciones, Runnable[] acciones) throws IOException {
        boolean continuar = true;
        int opcionSalida = opciones.length;

        do {
            String seleccion = DesplegarMenu(titulo, opciones);
            if (seleccion == null || seleccion.trim().isEmpty()) {
                System.out.println(">> Opcion incorrecta, intente de nuevo.");
            } else {
                try {
                    int indice = Integer.parseInt(seleccion.trim());
                    if (indice >= 1 && indice <= opciones.length) {
                        if (acciones != null && (indice - 1) < acciones.length && acciones[indice - 1] != null) {
                            acciones[indice - 1].run();
                        }
                        if (indice == opcionSalida) {
                            continuar = false;
                        }
                    } else {
                        System.out.println(">> No existe esta opcion (" + indice + ").");
                    }
                } catch (NumberFormatException e) {
                    System.out.println(">> Error: Debe introducir un numero valido.");
                }
            }
        } while (continuar);
    }

    public static void MenuProductosGenerico() throws IOException {
        String[] opciones = { "Modificar Precio Producto", "Listado de Productos", "Regresar" };
        Runnable[] acciones = {
            () -> System.out.println("-> Ejecutando: Modificar Precio Producto"),
            () -> System.out.println("-> Ejecutando: Listado de Productos"),
            () -> System.out.println("-> Regresando al menu anterior...")
        };
        GestionarMenu("=== GESTION DE PRODUCTOS (GENERICO) ===", opciones, acciones);
    }

    public static void MenuInventarioGenerico() throws IOException {
        String[] opciones = { "Listado de Inventario", "Agregar Inventario", "Regresar" };
        Runnable[] acciones = {
            () -> System.out.println("-> Ejecutando: Listado de Inventario"),
            () -> System.out.println("-> Ejecutando: Agregar Inventario"),
            () -> System.out.println("-> Regresando al menu anterior...")
        };
        GestionarMenu("=== GESTION DE INVENTARIOS (GENERICO) ===", opciones, acciones);
    }

    public static void main(String[] args) throws IOException {
        String[] opcionesPrincipales = {
            "Productos",
            "Punto de Venta",
            "Inventarios",
            "Ventas",
            "Salida del Sistema"
        };

        Runnable[] accionesPrincipales = {
            () -> {
                try {
                    MenuProductosGenerico();
                } catch (IOException e) {
                    System.err.println(e.getMessage());
                }
            },
            () -> System.out.println("-> Ejecutando transaccion de Punto de Venta..."),
            () -> {
                try {
                    MenuInventarioGenerico();
                } catch (IOException e) {
                    System.err.println(e.getMessage());
                }
            },
            () -> System.out.println("-> Mostrando reporte de ventas acumuladas..."),
            () -> System.out.println("-> Sistema finalizado con exito.")
        };

        GestionarMenu("=== MENU PRINCIPAL TIENDA LA PEQUEÑA (GESTOR GENERICO) ===", opcionesPrincipales, accionesPrincipales);
    }
}
