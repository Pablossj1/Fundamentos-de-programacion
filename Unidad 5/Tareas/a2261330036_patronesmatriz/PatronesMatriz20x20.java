package a2261330036_patronesmatriz;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class PatronesMatriz20x20 {

    public static String[][] matriz = new String[21][21];
    public static BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));

    public static String Dialogo(String texto) throws IOException {
        System.out.println(texto + " : ");
        if (lectura == null) {
            lectura = new BufferedReader(new InputStreamReader(System.in));
        }
        return lectura.readLine();
    }

    public static String MostrarMenuForEach(String[] opciones) {
        String cadena = "";
        for (String info : opciones) {
            cadena = cadena + info + "\n";
        }
        return cadena;
    }

    public static String DesplegarMenu(String Titulo1, String[] menu) throws IOException {
        String cadena = Titulo1 + "\n\n" + MostrarMenuForEach(menu) + "\n Que opcion deseas ";
        return Dialogo(cadena);
    }

    public static void LimpiarMatriz(String[][] m) {
        for (int i = 1; i <= 20; i++) {
            for (int j = 1; j <= 20; j++) {
                m[i][j] = " ";
            }
        }
    }

    public static void MostrarMatriz(String[][] m) {
        System.out.println("");
        System.out.println("+----------------------------------------+");
        for (int i = 1; i <= 20; i++) {
            System.out.print("|");
            for (int j = 1; j <= 20; j++) {
                System.out.print(m[i][j] != null ? m[i][j] + " " : "  ");
            }
            System.out.println("|");
        }
        System.out.println("+----------------------------------------+");
        System.out.println("");
    }

    public static void CuadradoRelleno(String[][] m) {
        LimpiarMatriz(m);
        for (int i = 5; i <= 14; i++) {
            for (int j = 5; j <= 14; j++) {
                m[i][j] = "*";
            }
        }
        System.out.println("Patron: Cuadrado relleno generado.");
        MostrarMatriz(m);
    }

    public static void CuadradoHueco(String[][] m) {
        LimpiarMatriz(m);
        for (int i = 5; i <= 14; i++) {
            for (int j = 5; j <= 14; j++) {
                if (i == 5 || i == 14 || j == 5 || j == 14) {
                    m[i][j] = "*";
                }
            }
        }
        System.out.println("Patron: Cuadrado hueco generado.");
        MostrarMatriz(m);
    }

    public static void TrianguloIzq(String[][] m) {
        LimpiarMatriz(m);
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                m[i][j] = "*";
            }
        }
        System.out.println("Patron: Triangulo izquierdo generado.");
        MostrarMatriz(m);
    }

    public static void TrianguloDer(String[][] m) {
        LimpiarMatriz(m);
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                m[i][11 - j] = "*";
            }
        }
        System.out.println("Patron: Triangulo derecho generado.");
        MostrarMatriz(m);
    }

    public static void Piramide(String[][] m) {
        LimpiarMatriz(m);
        int centro = 10;
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                m[i][centro - (i - j)] = "*";
                m[i][centro + (i - j)] = "*";
            }
        }
        System.out.println("Patron: Piramide generada.");
        MostrarMatriz(m);
    }

    public static void PiramideInvertida(String[][] m) {
        LimpiarMatriz(m);
        int centro = 10;
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= (11 - i); j++) {
                m[i][centro - (11 - i - j)] = "*";
                m[i][centro + (11 - i - j)] = "*";
            }
        }
        System.out.println("Patron: Piramide invertida generada.");
        MostrarMatriz(m);
    }

    public static void Rombo(String[][] m) {
        LimpiarMatriz(m);
        int centro = 10;
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                m[i][centro - (i - j)] = "*";
                m[i][centro + (i - j)] = "*";
            }
        }
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= (10 - i); j++) {
                m[i + 10][centro - ((10 - i) - j)] = "*";
                m[i + 10][centro + ((10 - i) - j)] = "*";
            }
        }
        System.out.println("Patron: Rombo generado.");
        MostrarMatriz(m);
    }

    public static void DiagonalPrincipal(String[][] m) {
        LimpiarMatriz(m);
        for (int i = 1; i <= 20; i++) {
            m[i][i] = "*";
        }
        System.out.println("Patron: Diagonal principal generada.");
        MostrarMatriz(m);
    }

    public static void DiagonalSecundaria(String[][] m) {
        LimpiarMatriz(m);
        for (int i = 1; i <= 20; i++) {
            m[i][21 - i] = "*";
        }
        System.out.println("Patron: Diagonal secundaria generada.");
        MostrarMatriz(m);
    }

    public static void Equis(String[][] m) {
        LimpiarMatriz(m);
        for (int i = 1; i <= 20; i++) {
            m[i][i] = "*";
            m[i][21 - i] = "*";
        }
        System.out.println("Patron: X (ambas diagonales) generada.");
        MostrarMatriz(m);
    }

    public static void MenuPatrones(String[][] m) throws IOException {
        String[] opciones = {
            "1. Cuadrado relleno",
            "2. Cuadrado hueco",
            "3. Triangulo rectangulo izquierdo",
            "4. Triangulo rectangulo derecho",
            "5. Piramide",
            "6. Piramide invertida",
            "7. Rombo",
            "8. Diagonal principal",
            "9. Diagonal secundaria",
            "10. X (ambas diagonales)",
            "11. Mostrar matriz actual",
            "0. Salir"
        };
        String opcion = "0";
        do {
            opcion = DesplegarMenu("===== MENU DE PATRONES =====", opciones);
            if (opcion == null) {
                System.out.println("opcion incorrecta ");
                break;
            } else {
                switch (opcion) {
                    case "1":
                        CuadradoRelleno(m);
                        break;
                    case "2":
                        CuadradoHueco(m);
                        break;
                    case "3":
                        TrianguloIzq(m);
                        break;
                    case "4":
                        TrianguloDer(m);
                        break;
                    case "5":
                        Piramide(m);
                        break;
                    case "6":
                        PiramideInvertida(m);
                        break;
                    case "7":
                        Rombo(m);
                        break;
                    case "8":
                        DiagonalPrincipal(m);
                        break;
                    case "9":
                        DiagonalSecundaria(m);
                        break;
                    case "10":
                        Equis(m);
                        break;
                    case "11":
                        MostrarMatriz(m);
                        break;
                    case "0":
                        System.out.println("Saliendo...");
                        break;
                    default:
                        System.out.println("No existe esta opcion ");
                        break;
                }
            }
        } while (opcion != null && opcion.compareTo("0") != 0);
    }

    public static void main(String[] args) throws IOException {
        LimpiarMatriz(matriz);
        MenuPatrones(matriz);
    }
}
