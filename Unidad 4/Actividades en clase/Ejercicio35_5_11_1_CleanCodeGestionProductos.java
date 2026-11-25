package a2261330036_estudiodecaso;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Ejercicio35_5_11_1_CleanCodeGestionProductos {

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

    public static boolean EsNumeroValido(String valorIngresado) {
        if (valorIngresado == null || valorIngresado.isEmpty()) return false;
        try {
            Double.parseDouble(valorIngresado);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static int BuscarProductoPorCodigo(String codigoBuscado, String[][] matrizProductos) {
        int posicionFila = -1;
        for (int indiceFila = 0; indiceFila < matrizProductos.length; indiceFila++) {
            if (matrizProductos[indiceFila][0].trim().equalsIgnoreCase(codigoBuscado.trim())) {
                posicionFila = indiceFila;
                break;
            }
        }
        return posicionFila;
    }

    public static void ModificarPrecio(String[][] matrizProductos) throws IOException {
        String codigoBuscado = Leer("Introduce el codigo del producto a modificar");
        if (codigoBuscado != null) {
            int posicionFila = BuscarProductoPorCodigo(codigoBuscado, matrizProductos);
            if (posicionFila > -1) {
                String nombreProducto = matrizProductos[posicionFila][1];
                String precioActual = matrizProductos[posicionFila][2];
                System.out.println("Producto localizado: " + nombreProducto + " (Precio actual: $" + precioActual + ")");
                String nuevoPrecioIngresado = Leer("Introduce el nuevo precio de venta");
                if (nuevoPrecioIngresado != null && EsNumeroValido(nuevoPrecioIngresado)) {
                    matrizProductos[posicionFila][2] = nuevoPrecioIngresado;
                    System.out.println("Precio actualizado con exito a $" + nuevoPrecioIngresado);
                } else {
                    System.out.println("Error: El precio ingresado no es valido.");
                }
            } else {
                System.out.println("Error: No existe ningun producto con el codigo " + codigoBuscado);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        String[][] matrizProductos = Ejercicio27_5_3_2_CargarProductosDirecto.CargarProductos();
        ModificarPrecio(matrizProductos);
    }
}
