package a2261330036_patronesmatriz2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class PatronesMatrizParte2 {

    public static BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));

    public static String Dialogo(String texto) throws IOException {
        System.out.println(texto + " : ");
        return lector.readLine();
    }

    public static String Leer(String texto) throws IOException {
        String cadena = Dialogo(texto);
        if (cadena != null) {
            cadena = cadena.trim();
            if (cadena.isEmpty()) {
                cadena = null;
            }
        } else {
            cadena = null;
        }
        return cadena;
    }

    public static boolean EsNumeroEntero(String dato) {
        try {
            Integer.parseInt(dato);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static String DesplegarMenu(String titulo, String[] menu) throws IOException {
        System.out.println(titulo);
        for (String item : menu) {
            System.out.println(item);
        }
        return Leer("Seleccione una opcion");
    }

    public static void LimpiarMatriz(String[][] m) {
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                m[i][j] = " ";
            }
        }
    }

    public static void MostrarMatriz(String[][] m) {
        System.out.println("");
        System.out.println("+----------------------------------------+");
        for (int i = 0; i < 20; i++) {
            System.out.print("|");
            for (int j = 0; j < 20; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println("|");
        }
        System.out.println("+----------------------------------------+");
        System.out.println("");
    }

    public static void CruzRellena(String[][] m) {
        LimpiarMatriz(m);
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                int r = i + 1;
                int c = j + 1;
                if ((r >= 9 && r <= 11) || (c >= 9 && c <= 11)) {
                    m[i][j] = "*";
                }
            }
        }
        System.out.println("Patron: Cruz rellena generada.");
        MostrarMatriz(m);
    }

    public static void CruzHueca(String[][] m) {
        LimpiarMatriz(m);
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                int r = i + 1;
                int c = j + 1;
                if ((r == 9 || r == 11) && (c >= 3 && c <= 18)) {
                    m[i][j] = "*";
                }
                if ((c == 9 || c == 11) && (r >= 3 && r <= 18)) {
                    m[i][j] = "*";
                }
            }
        }
        System.out.println("Patron: Cruz hueca generada.");
        MostrarMatriz(m);
    }

    public static void TableroAjedrez(String[][] m) {
        LimpiarMatriz(m);
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                int r = i + 1;
                int c = j + 1;
                if ((r + c) % 2 == 0) {
                    m[i][j] = "*";
                }
            }
        }
        System.out.println("Patron: Tablero de ajedrez generado.");
        MostrarMatriz(m);
    }

    public static void LineasHorizontales(String[][] m) {
        LimpiarMatriz(m);
        for (int i = 0; i < 20; i++) {
            int r = i + 1;
            if (r % 3 == 1) {
                for (int j = 0; j < 20; j++) {
                    m[i][j] = "*";
                }
            }
        }
        System.out.println("Patron: Lineas horizontales generado.");
        MostrarMatriz(m);
    }

    public static void LineasVerticales(String[][] m) {
        LimpiarMatriz(m);
        for (int j = 0; j < 20; j++) {
            int c = j + 1;
            if (c % 3 == 1) {
                for (int i = 0; i < 20; i++) {
                    m[i][j] = "*";
                }
            }
        }
        System.out.println("Patron: Lineas verticales generado.");
        MostrarMatriz(m);
    }

    public static void MarcoDoble(String[][] m) {
        LimpiarMatriz(m);
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                int r = i + 1;
                int c = j + 1;
                if (r == 1 || r == 20 || c == 1 || c == 20) {
                    m[i][j] = "*";
                }
                if (r == 4 || r == 17 || c == 4 || c == 17) {
                    m[i][j] = "*";
                }
            }
        }
        System.out.println("Patron: Marco doble generado.");
        MostrarMatriz(m);
    }

    public static void FlechaDerecha(String[][] m) {
        LimpiarMatriz(m);
        int centro = 10;
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                int r1 = centro - (i - j);
                int r2 = centro + (i - j);
                int col = 20 - i;
                if (r1 >= 1 && r1 <= 20 && col >= 1 && col <= 20) {
                    m[r1 - 1][col - 1] = "*";
                }
                if (r2 >= 1 && r2 <= 20 && col >= 1 && col <= 20) {
                    m[r2 - 1][col - 1] = "*";
                }
            }
        }
        for (int j = 1; j <= 15; j++) {
            if (centro >= 1 && centro <= 20 && j >= 1 && j <= 20) {
                m[centro - 1][j - 1] = "*";
            }
            if (centro - 1 >= 1 && centro - 1 <= 20 && j >= 1 && j <= 20) {
                m[centro - 2][j - 1] = "*";
            }
            if (centro + 1 >= 1 && centro + 1 <= 20 && j >= 1 && j <= 20) {
                m[centro][j - 1] = "*";
            }
        }
        System.out.println("Patron: Flecha derecha generada.");
        MostrarMatriz(m);
    }

    public static void Circulo(String[][] m) {
        LimpiarMatriz(m);
        double cx = 10.5;
        double cy = 10.5;
        double r = 8.0;
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                double rIdx = i + 1;
                double cIdx = j + 1;
                double d = Math.sqrt(Math.pow(rIdx - cx, 2) + Math.pow(cIdx - cy, 2));
                if (d >= r - 0.6 && d <= r + 0.6) {
                    m[i][j] = "*";
                }
            }
        }
        System.out.println("Patron: Circulo generado.");
        MostrarMatriz(m);
    }

    public static void EspiralCuadrada(String[][] m) {
        LimpiarMatriz(m);
        int top = 1;
        int bottom = 20;
        int left = 1;
        int right = 20;
        while (top <= bottom && left <= right) {
            for (int j = left; j <= right; j++) {
                m[top - 1][j - 1] = "*";
            }
            for (int i = top + 1; i <= bottom; i++) {
                m[i - 1][right - 1] = "*";
            }
            if (top < bottom) {
                for (int j = right - 1; j >= left; j--) {
                    m[bottom - 1][j - 1] = "*";
                }
            }
            if (left < right) {
                for (int i = bottom - 1; i >= top + 1; i--) {
                    m[i - 1][left - 1] = "*";
                }
            }
            top += 2;
            bottom -= 2;
            left += 2;
            right -= 2;
        }
        System.out.println("Patron: Espiral cuadrada generada.");
        MostrarMatriz(m);
    }

    public static void Corazon(String[][] m) {
        LimpiarMatriz(m);
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                int r = i + 1;
                int c = j + 1;
                double x = (c - 10.5) / 6.0;
                double y = -(r - 8.0) / 6.0;
                double term = (x * x + y * y - 1.0);
                if (Math.pow(term, 3) - (x * x * Math.pow(y, 3)) <= 0.0) {
                    m[i][j] = "*";
                }
            }
        }
        System.out.println("Patron: Corazon generado.");
        MostrarMatriz(m);
    }

    public static void MenuPatrones(String[][] matriz) throws IOException {
        String[] menu = {
            "1. Cruz (+) rellena",
            "2. Cruz hueca (contorno)",
            "3. Tablero de ajedrez",
            "4. Lineas horizontales alternas",
            "5. Lineas verticales alternas",
            "6. Marco doble (borde + borde interno)",
            "7. Flecha hacia la derecha",
            "8. Circulo aproximado",
            "9. Espiral cuadrada",
            "10. Corazon",
            "11. Mostrar matriz actual",
            "0. Salir"
        };
        String opcion = "";
        do {
            opcion = DesplegarMenu("===== MENU DE PATRONES (PARTE 2) =====", menu);
            if (opcion == null) {
                System.out.println("Opcion incorrecta o valor nulo.");
            } else {
                switch (opcion) {
                    case "1":
                        CruzRellena(matriz);
                        break;
                    case "2":
                        CruzHueca(matriz);
                        break;
                    case "3":
                        TableroAjedrez(matriz);
                        break;
                    case "4":
                        LineasHorizontales(matriz);
                        break;
                    case "5":
                        LineasVerticales(matriz);
                        break;
                    case "6":
                        MarcoDoble(matriz);
                        break;
                    case "7":
                        FlechaDerecha(matriz);
                        break;
                    case "8":
                        Circulo(matriz);
                        break;
                    case "9":
                        EspiralCuadrada(matriz);
                        break;
                    case "10":
                        Corazon(matriz);
                        break;
                    case "11":
                        MostrarMatriz(matriz);
                        break;
                    case "0":
                        System.out.println("Saliendo...");
                        break;
                    default:
                        System.out.println("Opcion no valida.");
                        break;
                }
            }
        } while (opcion == null || opcion.compareTo("0") != 0);
    }

    public static void main(String[] args) throws IOException {
        String[][] matriz = new String[20][20];
        LimpiarMatriz(matriz);
        MenuPatrones(matriz);
    }
}
