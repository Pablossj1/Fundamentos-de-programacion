package a2261330036_estudiodecaso;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Ejercicio24_4_8_1_CleanCodeRefactorizado {

    public static String Dialogo(String textoIndicativo) throws IOException {
        System.out.println(textoIndicativo + " : ");
        BufferedReader lectorEntrada = new BufferedReader(new InputStreamReader(System.in));
        return lectorEntrada.readLine();
    }

    public static String MostrarMenu(String[] listaOpciones) {
        String menuFormateado = "";
        int indiceOpcion = 0;
        while (indiceOpcion < listaOpciones.length) {
            menuFormateado += (indiceOpcion + 1) + ". " + listaOpciones[indiceOpcion] + "\n";
            indiceOpcion++;
        }
        return menuFormateado;
    }

    public static String DesplegarMenu(String tituloMenu, String[] listaOpciones) throws IOException {
        String presentacionMenu = tituloMenu + "\n\n" + MostrarMenu(listaOpciones) + "\n Que opcion deseas ";
        return Dialogo(presentacionMenu);
    }

    public static void MenuPrincipalLimpio() throws IOException {
        String[] catalogoModulos = {
            "1.-Productos ",
            "2.-Punto de Venta ",
            "3.-Inventario ",
            "4.-Ventas ",
            "5.-Salida "
        };

        boolean continuarEnMenu = true;

        do {
            String opcionNavegacion = DesplegarMenu("=== SISTEMA PUNTO DE VENTA - TIENDA LA PEQUEÑA ===", catalogoModulos);

            boolean esEntradaInvalida = (opcionNavegacion == null || opcionNavegacion.trim().isEmpty());

            if (esEntradaInvalida) {
                System.out.println(">> Advertencia: Opcion incorrecta, no se recibio ningun dato.");
            } else {
                switch (opcionNavegacion.trim()) {
                    case "1":
                        System.out.println("-> Accediendo al modulo de Productos...");
                        break;
                    case "2":
                        System.out.println("-> Accediendo al modulo de Punto de Venta...");
                        break;
                    case "3":
                        System.out.println("-> Accediendo al modulo de Inventario...");
                        break;
                    case "4":
                        System.out.println("-> Generando reporte de Ventas...");
                        break;
                    case "5":
                        System.out.println("-> Cerrando sesion. Salida del sistema confirmada.");
                        continuarEnMenu = false;
                        break;
                    default:
                        System.out.println(">> Error: No existe la opcion seleccionada [" + opcionNavegacion + "].");
                        break;
                }
            }
        } while (continuarEnMenu);
    }

    public static void main(String[] args) throws IOException {
        boolean sistemaActivo = true;
        if (sistemaActivo) {
            MenuPrincipalLimpio();
        }
    }
}
