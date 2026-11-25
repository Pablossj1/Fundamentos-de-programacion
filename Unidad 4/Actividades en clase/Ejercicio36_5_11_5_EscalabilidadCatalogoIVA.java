package a2261330036_estudiodecaso;

public class Ejercicio36_5_11_5_EscalabilidadCatalogoIVA {

    public static String RellenarEspacios(String dato, int tamano) {
        String cadena = dato;
        for (int ciclo = dato.length() - 1; ciclo < tamano; ciclo++) {
            cadena = cadena + " ";
        }
        return cadena;
    }

    public static String[][] CargarProductosConIVA() {
        String[][] catalogo = {
            { "001", "Arroz 1kg", "35", "10", "0" },
            { "002", "Azúcar 1kg", "25", "10", "0" },
            { "003", "Harina 1kg", "28", "10", "0" },
            { "004", "Aceite 1L", "50", "10", "16" },
            { "005", "Leche 1L", "35", "10", "0" },
            { "006", "Huevos 12 unidades", "45", "10", "0" },
            { "007", "Fideos 500g", "20", "10", "16" },
            { "008", "Sal 1kg", "15", "10", "0" },
            { "009", "Pasta de tomate 400g", "25", "10", "16" },
            { "010", "Atún lata 170g", "35", "10", "16" },
            { "011", "Galletas 200g", "18", "15", "16" },
            { "012", "Cafe soluble 100g", "60", "8", "16" },
            { "013", "Jabon de bano", "16", "25", "16" },
            { "014", "Detergente 1kg", "42", "12", "16" },
            { "015", "Papel higienico 4u", "38", "20", "16" },
            { "016", "Refresco 2L", "32", "18", "16" },
            { "017", "Agua purificada 1L", "12", "30", "0" },
            { "018", "Frijol negro 1kg", "36", "14", "0" },
            { "019", "Lentejas 500g", "22", "10", "0" },
            { "020", "Cloro blanqueador 1L", "19", "16", "16" }
        };
        return catalogo;
    }

    public static String MostrarProductoConIVA(String[] vproducto) {
        String codigo = RellenarEspacios(vproducto[0], 6);
        String producto = RellenarEspacios(vproducto[1], 26);
        String precio = RellenarEspacios("$" + vproducto[2], 10);
        String cantidad = RellenarEspacios(vproducto[3] + " pz", 10);
        String iva = RellenarEspacios(vproducto[4] + "% IVA", 10);
        return codigo + producto + precio + cantidad + iva;
    }

    public static String MostrarListaConIVA(String[][] vproductos) {
        String encabezado = RellenarEspacios("COD", 6) +
                            RellenarEspacios("PRODUCTO", 26) +
                            RellenarEspacios("PRECIO", 10) +
                            RellenarEspacios("STOCK", 10) +
                            RellenarEspacios("IMPUESTO", 10) + "\n" +
                            "--------------------------------------------------------------\n";
        String cuerpo = "";
        for (int i = 0; i < vproductos.length; i++) {
            cuerpo += MostrarProductoConIVA(vproductos[i]) + "\n";
        }
        return encabezado + cuerpo;
    }

    public static void main(String[] args) {
        String[][] catalogo = CargarProductosConIVA();
        System.out.println(MostrarListaConIVA(catalogo));
    }
}
