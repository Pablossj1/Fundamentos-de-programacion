package a2261330036_operacionesmatrices20x20;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class OperacionesMatrices20x20 {

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

    public static void LlenarManual(int[][] m, String nombre) throws IOException {
        System.out.println("Llenando matriz " + nombre + " (20x20):");
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                String val = Leer("Ingrese " + nombre + "[" + (i + 1) + "," + (j + 1) + "]");
                while (val == null || !EsNumeroEntero(val)) {
                    val = Leer("Valor invalido. Reingrese " + nombre + "[" + (i + 1) + "," + (j + 1) + "]");
                }
                m[i][j] = Integer.parseInt(val);
            }
        }
        System.out.println("Matriz " + nombre + " llenada correctamente.");
    }

    public static void LlenarAleatorio(int[][] m, String nombre) {
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                m[i][j] = (int) (Math.random() * 9) + 1;
            }
        }
        System.out.println("Matriz " + nombre + " llenada con valores aleatorios.");
    }

    public static void MostrarMatriz(int[][] m, String nombre) {
        System.out.println("");
        System.out.println("===== MATRIZ " + nombre + " =====");
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.printf("%4d ", m[i][j]);
            }
            System.out.println("");
        }
        System.out.println("");
    }

    public static void SumaMatrices(int[][] A, int[][] B, int[][] C) {
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }
        System.out.println("Suma A + B realizada.");
        MostrarMatriz(C, "C = A + B");
    }

    public static void RestaMatrices(int[][] A, int[][] B, int[][] C) {
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                C[i][j] = A[i][j] - B[i][j];
            }
        }
        System.out.println("Resta A - B realizada.");
        MostrarMatriz(C, "C = A - B");
    }

    public static void MultiplicacionMatrices(int[][] A, int[][] B, int[][] C) {
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                C[i][j] = 0;
            }
        }
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                for (int k = 0; k < 20; k++) {
                    C[i][j] = C[i][j] + A[i][k] * B[k][j];
                }
            }
        }
        System.out.println("Multiplicacion A x B realizada.");
        MostrarMatriz(C, "C = A x B");
    }

    public static void Transpuesta(int[][] A, int[][] C) {
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                C[i][j] = A[j][i];
            }
        }
        System.out.println("Transpuesta de A realizada.");
        MostrarMatriz(C, "C = A^T");
    }

    public static void Escalar(int[][] A, int[][] C) throws IOException {
        String kStr = Leer("Ingrese el escalar k");
        while (kStr == null || !EsNumeroEntero(kStr)) {
            kStr = Leer("Valor invalido. Ingrese el escalar k");
        }
        int k = Integer.parseInt(kStr);
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                C[i][j] = A[i][j] * k;
            }
        }
        System.out.println("Multiplicacion por escalar realizada.");
        MostrarMatriz(C, "C = A x k");
    }

    public static void Identidad(int[][] C) {
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if (i == j) {
                    C[i][j] = 1;
                } else {
                    C[i][j] = 0;
                }
            }
        }
        System.out.println("Matriz identidad generada.");
        MostrarMatriz(C, "I (identidad)");
    }

    public static void Traza(int[][] A) {
        int suma = 0;
        for (int i = 0; i < 20; i++) {
            suma = suma + A[i][i];
        }
        System.out.println("La traza de A es: " + suma);
    }

    public static void EsSimetrica(int[][] A) {
        boolean esSim = true;
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if (A[i][j] != A[j][i]) {
                    esSim = false;
                    break;
                }
            }
            if (!esSim) {
                break;
            }
        }
        if (esSim) {
            System.out.println("La matriz A ES SIMETRICA (A = A^T).");
        } else {
            System.out.println("La matriz A NO es simetrica.");
        }
    }

    public static void SumaElementos(int[][] A) {
        int suma = 0;
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                suma = suma + A[i][j];
            }
        }
        System.out.println("La suma de todos los elementos de A es: " + suma);
    }

    public static void MayorMenor(int[][] A) {
        int mayor = A[0][0];
        int menor = A[0][0];
        int posMayF = 0;
        int posMayC = 0;
        int posMenF = 0;
        int posMenC = 0;
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if (A[i][j] > mayor) {
                    mayor = A[i][j];
                    posMayF = i;
                    posMayC = j;
                }
                if (A[i][j] < menor) {
                    menor = A[i][j];
                    posMenF = i;
                    posMenC = j;
                }
            }
        }
        System.out.println("Mayor elemento: " + mayor + " en posicion [" + (posMayF + 1) + "," + (posMayC + 1) + "]");
        System.out.println("Menor elemento: " + menor + " en posicion [" + (posMenF + 1) + "," + (posMenC + 1) + "]");
    }

    public static void Hadamard(int[][] A, int[][] B, int[][] C) {
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                C[i][j] = A[i][j] * B[i][j];
            }
        }
        System.out.println("Producto Hadamard (elemento a elemento) realizado.");
        MostrarMatriz(C, "C = A .* B");
    }

    public static void Potencia(int[][] A, int[][] C) {
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                C[i][j] = 0;
            }
        }
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                for (int k = 0; k < 20; k++) {
                    C[i][j] = C[i][j] + A[i][k] * A[k][j];
                }
            }
        }
        System.out.println("Potencia A^2 realizada.");
        MostrarMatriz(C, "C = A^2");
    }

    public static void MenuOperaciones(int[][] A, int[][] B, int[][] C) throws IOException {
        String[] menu = {
            "1. Llenar matriz A manualmente",
            "2. Llenar matriz B manualmente",
            "3. Llenar A y B con numeros aleatorios (1-9)",
            "4. Mostrar matriz A",
            "5. Mostrar matriz B",
            "6. Suma A + B",
            "7. Resta A - B",
            "8. Multiplicacion A x B",
            "9. Transpuesta de A",
            "10. Multiplicacion por escalar (A x k)",
            "11. Matriz identidad 20x20",
            "12. Traza de A (suma diagonal)",
            "13. Determinar si A es simetrica",
            "14. Suma de todos los elementos de A",
            "15. Elemento mayor y menor de A",
            "16. Producto de matrices elemento a elemento (Hadamard)",
            "17. Potencia A^2 (A x A)",
            "0. Salir"
        };
        String opcion = "";
        do {
            opcion = DesplegarMenu("===== OPERACIONES CON MATRICES 20x20 =====", menu);
            if (opcion == null) {
                System.out.println("Opcion incorrecta o valor nulo.");
            } else {
                switch (opcion) {
                    case "1":
                        LlenarManual(A, "A");
                        break;
                    case "2":
                        LlenarManual(B, "B");
                        break;
                    case "3":
                        LlenarAleatorio(A, "A");
                        LlenarAleatorio(B, "B");
                        break;
                    case "4":
                        MostrarMatriz(A, "A");
                        break;
                    case "5":
                        MostrarMatriz(B, "B");
                        break;
                    case "6":
                        SumaMatrices(A, B, C);
                        break;
                    case "7":
                        RestaMatrices(A, B, C);
                        break;
                    case "8":
                        MultiplicacionMatrices(A, B, C);
                        break;
                    case "9":
                        Transpuesta(A, C);
                        break;
                    case "10":
                        Escalar(A, C);
                        break;
                    case "11":
                        Identidad(C);
                        break;
                    case "12":
                        Traza(A);
                        break;
                    case "13":
                        EsSimetrica(A);
                        break;
                    case "14":
                        SumaElementos(A);
                        break;
                    case "15":
                        MayorMenor(A);
                        break;
                    case "16":
                        Hadamard(A, B, C);
                        break;
                    case "17":
                        Potencia(A, C);
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
        int[][] A = new int[20][20];
        int[][] B = new int[20][20];
        int[][] C = new int[20][20];
        MenuOperaciones(A, B, C);
    }
}
