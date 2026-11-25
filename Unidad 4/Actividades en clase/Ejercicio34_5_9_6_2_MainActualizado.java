package a2261330036_estudiodecaso;

import java.io.IOException;

public class Ejercicio34_5_9_6_2_MainActualizado {

    public static String[][] productos;

    public static void main(String[] args) throws IOException {
        productos = Ejercicio27_5_3_2_CargarProductosDirecto.CargarProductos();
        Ejercicio33_5_9_2_MenuPrincipalActualizado.MenuPrincipal(productos);
    }
}
