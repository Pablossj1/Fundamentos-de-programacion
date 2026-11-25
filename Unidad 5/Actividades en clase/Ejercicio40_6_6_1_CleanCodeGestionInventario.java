package a2261330036_estudiodecaso;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Ejercicio40_6_6_1_CleanCodeGestionInventario {

    public static String Dialogo(String mensajeIndicador) throws IOException {
        System.out.println(mensajeIndicador + " : ");
        BufferedReader lectorEntrada = new BufferedReader(new InputStreamReader(System.in));
        return lectorEntrada.readLine();
    }

    public static String Leer(String mensajeIndicador) throws IOException {
        String textoCapturado = Dialogo(mensajeIndicador);
        if (textoCapturado != null) {
            textoCapturado = textoCapturado.trim();
            if (textoCapturado.isEmpty()) {
                textoCapturado = null;
            }
        } else {
            textoCapturado = null;
        }
        return textoCapturado;
    }

    public static boolean EvaluarCantidadValida(String dato) {
        if (dato == null || dato.isEmpty()) return false;
        for (char caracter : dato.toCharArray()) {
            if (!Character.isDigit(caracter)) {
                return false;
            }
        }
        return true;
    }

    public static void AgregarStockRefactorizado(String[][] catalogoProductos) throws IOException {
        String codigoBuscado, cantidadIngresada;
        int posicionProducto;
        String listadoCompleto = Ejercicio37_6_2_AgregarStock.MostrarLista(catalogoProductos);
        codigoBuscado = Leer(listadoCompleto + "\nIntroduce el codigo del producto a modificar");
        if (codigoBuscado != null) {
            posicionProducto = Ejercicio37_6_2_AgregarStock.ExisteProducto(codigoBuscado, catalogoProductos);
            if (posicionProducto > -1) {
                String[] productoFila = { catalogoProductos[posicionProducto][0], catalogoProductos[posicionProducto][1], catalogoProductos[posicionProducto][3], "" };
                cantidadIngresada = Leer("\nIntroduce la Cantidad de Stock a Agregar" + Ejercicio37_6_2_AgregarStock.MostrarProducto(productoFila) + " ");
                if (cantidadIngresada != null) {
                    boolean esCantidadValida = EvaluarCantidadValida(cantidadIngresada);
                    if (esCantidadValida) {
                        int cantidadNumericaTemporal = Integer.parseInt(cantidadIngresada);
                        int stockActual = Integer.parseInt(productoFila[2]);
                        int stockActualizado = stockActual + cantidadNumericaTemporal;
                        String textoInventarioConvertido = String.valueOf(stockActualizado);
                        catalogoProductos[posicionProducto][3] = textoInventarioConvertido;
                    } else {
                        System.out.println("no es un valor numerico");
                    }
                } else {
                    System.out.println(" dato nulo");
                }
            } else {
                System.out.println("no existe el codigo");
            }
        } else {
            System.out.println(" dato nulo");
        }
    }

    public static void MenuInventarioRefactorizado(String[][] catalogoProductos) throws IOException {
        String[] opcionesInventario = { "1.-Listado ", "2.-Agregar ", "3.-Salida " };
        String opcionInventario = "0";
        do {
            opcionInventario = Ejercicio38_6_3_2_MenuInventarioActualizado.DesplegarMenu("Opciones de Inventarios", opcionesInventario);
            if (opcionInventario == null) {
                System.out.println("opcion incorrecta ");
            } else {
                switch (opcionInventario) {
                    case "1":
                        System.out.println(Ejercicio37_6_2_AgregarStock.MostrarLista(catalogoProductos));
                        break;
                    case "2":
                        AgregarStockRefactorizado(catalogoProductos);
                        break;
                    case "3":
                        System.out.println("Salida del Sistema ");
                        break;
                    default:
                        System.out.println("No existe esta opcion ");
                        break;
                }
            }
        } while (opcionInventario.compareTo("3") != 0);
    }

    public static void main(String[] args) throws IOException {
        String[][] productos = Ejercicio27_5_3_2_CargarProductosDirecto.CargarProductos();
        MenuInventarioRefactorizado(productos);
    }
}
