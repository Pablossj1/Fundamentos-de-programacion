package a2261330036_estudiodecaso;

public class Ejercicio30_5_6_ExisteProducto {

    public static int ExisteProducto(String codigo, String[][] vproductos) {
        int enc, pos, tam, ciclo;
        enc = -1;
        pos = 0;
        tam = vproductos.length;
        for (ciclo = 0; ciclo < tam; ciclo++) {
            if (vproductos[ciclo][0].compareTo(codigo.trim()) == 0) {
                enc = pos;
            }
            pos++;
        }
        return enc;
    }

    public static void main(String[] args) {
        String[][] productos = Ejercicio27_5_3_2_CargarProductosDirecto.CargarProductos();
        System.out.println("Buscar '003': " + ExisteProducto("003", productos));
        System.out.println("Buscar '009': " + ExisteProducto("009", productos));
        System.out.println("Buscar '999': " + ExisteProducto("999", productos));
    }
}
