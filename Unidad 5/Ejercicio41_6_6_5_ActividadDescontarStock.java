package a2261330036_estudiodecaso;

public class Ejercicio41_6_6_5_ActividadDescontarStock {

    public static int DescontarStock(String[][] vproductos, String codigo, int cantidad) {
        if (codigo == null || vproductos == null) {
            return -2;
        }
        int posicion = -1;
        for (int ciclo = 0; ciclo < vproductos.length; ciclo++) {
            if (vproductos[ciclo][0].compareTo(codigo.trim()) == 0) {
                posicion = ciclo;
                break;
            }
        }
        if (posicion == -1) {
            return -2;
        }
        int stockActual = Integer.parseInt(vproductos[posicion][3].trim());
        if (stockActual == 0) {
            return 0;
        }
        if (cantidad > stockActual) {
            return -1;
        }
        int nuevoStock = stockActual - cantidad;
        vproductos[posicion][3] = String.valueOf(nuevoStock);
        return 1;
    }

    public static void main(String[] args) {
        String[][] productos = Ejercicio27_5_3_2_CargarProductosDirecto.CargarProductos();
        int r1 = DescontarStock(productos, "999", 5);
        System.out.println("Resultado producto inexistente (esperado -2): " + r1);
        int r2 = DescontarStock(productos, "001", 15);
        System.out.println("Resultado exceso de stock (esperado -1): " + r2);
        productos[0][3] = "0";
        int r3 = DescontarStock(productos, "001", 5);
        System.out.println("Resultado stock cero (esperado 0): " + r3);
        int r4 = DescontarStock(productos, "002", 4);
        System.out.println("Resultado descuento exitoso (esperado 1): " + r4);
        System.out.println("Nuevo stock producto 002: " + productos[1][3]);
    }
}
