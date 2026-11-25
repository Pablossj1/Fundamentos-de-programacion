package a2261330036_estudiodecaso;

public class Ejercicio03_3_3_1_MostrarMenuWhile {

    public static String MostrarMenu(String[] opciones) {
        String cadena = "";
        int i = 0;
        while (i < opciones.length) {
            cadena += (i + 1) + ". " + opciones[i] + "\n";
            i++;
        }
        return cadena;
    }

    public static void main(String[] args) {
        System.out.println("=== Ejercicio 03: Seccion 3.3.1 - MostrarMenu con While ===");
        String[] opcionesMenu = {
            "Productos",
            "Punto de Venta",
            "Inventario",
            "Listado de Ventas",
            "Salida"
        };

        String menuGenerado = MostrarMenu(opcionesMenu);
        System.out.println("Menu generado:\n" + menuGenerado);
    }
}
