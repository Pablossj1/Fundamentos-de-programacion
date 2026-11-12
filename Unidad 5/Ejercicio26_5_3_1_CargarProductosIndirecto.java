package a2261330036_estudiodecaso;

public class Ejercicio26_5_3_1_CargarProductosIndirecto {

    public static String[][] CargarProductos() {
        String[][] producto = new String[10][4];
        producto[0][0] = "001";
        producto[0][1] = "Arroz 1kg";
        producto[0][2] = "35";
        producto[0][3] = "10";
        producto[1][0] = "002";
        producto[1][1] = "Azúcar 1kg";
        producto[1][2] = "25";
        producto[1][3] = "10";
        producto[2][0] = "003";
        producto[2][1] = "Harina 1kg";
        producto[2][2] = "28";
        producto[2][3] = "10";
        producto[3][0] = "004";
        producto[3][1] = "Aceite 1L";
        producto[3][2] = "50";
        producto[3][3] = "10";
        producto[4][0] = "005";
        producto[4][1] = "Leche 1L";
        producto[4][2] = "35";
        producto[4][3] = "10";
        producto[5][0] = "006";
        producto[5][1] = "Huevos 12 unidades";
        producto[5][2] = "45";
        producto[5][3] = "10";
        producto[6][0] = "007";
        producto[6][1] = "Fideos 500g";
        producto[6][2] = "20";
        producto[6][3] = "10";
        producto[7][0] = "008";
        producto[7][1] = "Sal 1kg";
        producto[7][2] = "15";
        producto[7][3] = "10";
        producto[8][0] = "009";
        producto[8][1] = "Pasta de tomate 400g";
        producto[8][2] = "25";
        producto[8][3] = "10";
        producto[9][0] = "010";
        producto[9][1] = "Atún lata 170g";
        producto[9][2] = "35";
        producto[9][3] = "10";
        return producto;
    }

    public static void main(String[] args) {
        String[][] productos = CargarProductos();
        System.out.println("Productos cargados: " + productos.length);
        System.out.println("Primer producto: " + productos[0][0] + " - " + productos[0][1]);
        System.out.println("Ultimo producto: " + productos[9][0] + " - " + productos[9][1]);
    }
}
