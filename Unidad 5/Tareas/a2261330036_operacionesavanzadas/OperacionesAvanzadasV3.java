package a2261330036_operacionesavanzadas;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.util.Locale;

public class OperacionesAvanzadasV3 {

    public static BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
    public static int n = 20;

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

    public static boolean EsNumeroDouble(String dato) {
        try {
            Double.parseDouble(dato);
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

    public static void CambiarTamanio() throws IOException {
        String input = Leer("Nuevo tamanio (1-50)");
        if (input != null && EsNumeroEntero(input)) {
            int nuevo = Integer.parseInt(input);
            if (nuevo < 1 || nuevo > 50) {
                n = 20;
            } else {
                n = nuevo;
            }
        } else {
            n = 20;
        }
        System.out.println("Tamanio = " + n);
    }

    public static void LlenarAleatorio(double[][] m, int tam) {
        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                m[i][j] = (int) (Math.random() * 9) + 1;
            }
        }
        System.out.println("Matriz aleatoria generada.");
    }

    public static void LlenarManual(double[][] m, int tam) throws IOException {
        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                String val = Leer("A[" + (i + 1) + "," + (j + 1) + "]");
                while (val == null || !EsNumeroDouble(val)) {
                    val = Leer("Invalido. Reingrese A[" + (i + 1) + "," + (j + 1) + "]");
                }
                m[i][j] = Double.parseDouble(val);
            }
        }
    }

    public static void MostrarMatriz(double[][] m, int tam, String nombre) {
        System.out.println("");
        System.out.println("===== " + nombre + " (" + tam + "x" + tam + ") =====");
        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                System.out.printf(Locale.US, "%9.4f ", m[i][j]);
            }
            System.out.println("");
        }
        System.out.println("");
    }

    public static void DeterminanteGauss(double[][] A, int tam) {
        double[][] M = new double[50][50];
        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                M[i][j] = A[i][j];
            }
        }
        double det = 1.0;
        double signo = 1.0;
        boolean singular = false;

        for (int k = 0; k < tam - 1; k++) {
            int pivoteFila = k;
            for (int i = k + 1; i < tam; i++) {
                if (Math.abs(M[i][k]) > Math.abs(M[pivoteFila][k])) {
                    pivoteFila = i;
                }
            }
            if (Math.abs(M[pivoteFila][k]) < 0.000001) {
                singular = true;
                break;
            }
            if (pivoteFila != k) {
                for (int j = 0; j < tam; j++) {
                    double temp = M[k][j];
                    M[k][j] = M[pivoteFila][j];
                    M[pivoteFila][j] = temp;
                }
                signo = signo * -1.0;
            }
            for (int i = k + 1; i < tam; i++) {
                double factor = M[i][k] / M[k][k];
                for (int j = k; j < tam; j++) {
                    M[i][j] = M[i][j] - factor * M[k][j];
                }
            }
        }
        if (singular) {
            System.out.println("det(A) = 0");
        } else {
            det = 1.0;
            for (int i = 0; i < tam; i++) {
                det = det * M[i][i];
            }
            System.out.printf(Locale.US, "det(A) = %.6f\n", (det * signo));
        }
    }

    public static void InversaGaussJordan(double[][] A, int tam, double[][] inv) {
        double[][] M = new double[50][100];
        boolean singular = false;

        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                M[i][j] = A[i][j];
                if (i == j) {
                    M[i][tam + j] = 1.0;
                } else {
                    M[i][tam + j] = 0.0;
                }
            }
        }

        for (int k = 0; k < tam; k++) {
            int pivoteFila = k;
            for (int i = k + 1; i < tam; i++) {
                if (Math.abs(M[i][k]) > Math.abs(M[pivoteFila][k])) {
                    pivoteFila = i;
                }
            }
            if (Math.abs(M[pivoteFila][k]) < 0.000001) {
                singular = true;
                break;
            }
            if (pivoteFila != k) {
                for (int j = 0; j < 2 * tam; j++) {
                    double temp = M[k][j];
                    M[k][j] = M[pivoteFila][j];
                    M[pivoteFila][j] = temp;
                }
            }
            double pivote = M[k][k];
            for (int j = 0; j < 2 * tam; j++) {
                M[k][j] = M[k][j] / pivote;
            }
            for (int i = 0; i < tam; i++) {
                if (i != k) {
                    double factor = M[i][k];
                    for (int j = 0; j < 2 * tam; j++) {
                        M[i][j] = M[i][j] - factor * M[k][j];
                    }
                }
            }
        }

        if (singular) {
            System.out.println("Matriz singular, sin inversa.");
        } else {
            for (int i = 0; i < tam; i++) {
                for (int j = 0; j < tam; j++) {
                    inv[i][j] = M[i][tam + j];
                }
            }
            MostrarMatriz(inv, tam, "A^-1");
        }
    }

    public static void RangoMatriz(double[][] A, int tam) {
        double[][] M = new double[50][50];
        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                M[i][j] = A[i][j];
            }
        }
        int fila = 0;
        int rango = 0;
        for (int colPivote = 0; colPivote < tam; colPivote++) {
            int k = fila;
            while (k < tam && Math.abs(M[k][colPivote]) < 0.000001) {
                k++;
            }
            if (k < tam) {
                if (k != fila) {
                    for (int j = 0; j < tam; j++) {
                        double temp = M[fila][j];
                        M[fila][j] = M[k][j];
                        M[k][j] = temp;
                    }
                }
                for (int i = fila + 1; i < tam; i++) {
                    double factor = M[i][colPivote] / M[fila][colPivote];
                    for (int j = colPivote; j < tam; j++) {
                        M[i][j] = M[i][j] - factor * M[fila][j];
                    }
                }
                rango++;
                fila++;
            }
            if (fila >= tam) {
                break;
            }
        }
        System.out.println("Rango = " + rango);
    }

    public static void ResolverSistema(double[][] A, int tam, double[] b, double[] x) throws IOException {
        System.out.println("Ingrese vector b:");
        for (int i = 0; i < tam; i++) {
            String val = Leer("b[" + (i + 1) + "]");
            while (val == null || !EsNumeroDouble(val)) {
                val = Leer("Invalido. Reingrese b[" + (i + 1) + "]");
            }
            b[i] = Double.parseDouble(val);
        }

        double[][] M = new double[50][51];
        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                M[i][j] = A[i][j];
            }
            M[i][tam] = b[i];
        }

        boolean singular = false;
        for (int k = 0; k < tam; k++) {
            int pivoteFila = k;
            for (int i = k + 1; i < tam; i++) {
                if (Math.abs(M[i][k]) > Math.abs(M[pivoteFila][k])) {
                    pivoteFila = i;
                }
            }
            if (Math.abs(M[pivoteFila][k]) < 0.000001) {
                singular = true;
                break;
            }
            if (pivoteFila != k) {
                for (int j = 0; j <= tam; j++) {
                    double temp = M[k][j];
                    M[k][j] = M[pivoteFila][j];
                    M[pivoteFila][j] = temp;
                }
            }
            double pivote = M[k][k];
            for (int j = 0; j <= tam; j++) {
                M[k][j] = M[k][j] / pivote;
            }
            for (int i = 0; i < tam; i++) {
                if (i != k) {
                    double factor = M[i][k];
                    for (int j = 0; j <= tam; j++) {
                        M[i][j] = M[i][j] - factor * M[k][j];
                    }
                }
            }
        }

        if (singular) {
            System.out.println("Sin solucion unica.");
        } else {
            for (int i = 0; i < tam; i++) {
                x[i] = M[i][tam];
                System.out.printf(Locale.US, "x[%d] = %.6f\n", (i + 1), x[i]);
            }
        }
    }

    public static void FactorizacionLU(double[][] A, int tam, double[][] L, double[][] U) {
        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                L[i][j] = 0.0;
                U[i][j] = 0.0;
            }
        }

        for (int i = 0; i < tam; i++) {
            for (int j = i; j < tam; j++) {
                double suma = 0.0;
                for (int k = 0; k < i; k++) {
                    suma = suma + L[i][k] * U[k][j];
                }
                U[i][j] = A[i][j] - suma;
            }
            L[i][i] = 1.0;
            if (Math.abs(U[i][i]) < 0.000001) {
                System.out.println("Pivote ~0 en U[" + (i + 1) + "," + (i + 1) + "].");
            } else {
                for (int j = i + 1; j < tam; j++) {
                    double suma = 0.0;
                    for (int k = 0; k < i; k++) {
                        suma = suma + L[j][k] * U[k][i];
                    }
                    L[j][i] = (A[j][i] - suma) / U[i][i];
                }
            }
        }
        System.out.println("LU completada.");
        MostrarMatriz(L, tam, "L");
        MostrarMatriz(U, tam, "U");
    }

    public static void ResolverLU(double[][] A, int tam, double[][] L, double[][] U, double[] b, double[] x) throws IOException {
        double[] y = new double[50];
        System.out.println("Ingrese b:");
        for (int i = 0; i < tam; i++) {
            String val = Leer("b[" + (i + 1) + "]");
            while (val == null || !EsNumeroDouble(val)) {
                val = Leer("Invalido. Reingrese b[" + (i + 1) + "]");
            }
            b[i] = Double.parseDouble(val);
        }

        if (L[0][0] == 0.0) {
            FactorizacionLU(A, tam, L, U);
        }

        for (int i = 0; i < tam; i++) {
            double suma = 0.0;
            for (int j = 0; j < i; j++) {
                suma = suma + L[i][j] * y[j];
            }
            y[i] = b[i] - suma;
        }

        for (int i = tam - 1; i >= 0; i--) {
            double suma = 0.0;
            for (int j = i + 1; j < tam; j++) {
                suma = suma + U[i][j] * x[j];
            }
            if (Math.abs(U[i][i]) < 0.000001) {
                System.out.println("Sistema singular.");
                break;
            } else {
                x[i] = (y[i] - suma) / U[i][i];
            }
        }

        for (int i = 0; i < tam; i++) {
            System.out.printf(Locale.US, "x[%d] = %.6f\n", (i + 1), x[i]);
        }
    }

    public static void Cholesky(double[][] A, int tam, double[][] L) {
        boolean positiva = true;
        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                L[i][j] = 0.0;
            }
        }

        for (int i = 0; i < tam; i++) {
            for (int j = 0; j <= i; j++) {
                double suma = 0.0;
                for (int k = 0; k < j; k++) {
                    suma = suma + L[i][k] * L[j][k];
                }
                if (i == j) {
                    double val = A[i][i] - suma;
                    if (val <= 0.0) {
                        System.out.println("A no es definida positiva (falla en [" + (i + 1) + "]).");
                        positiva = false;
                        break;
                    } else {
                        L[i][j] = Math.sqrt(val);
                    }
                } else {
                    if (Math.abs(L[j][j]) < 0.000001) {
                        L[i][j] = 0.0;
                    } else {
                        L[i][j] = (A[i][j] - suma) / L[j][j];
                    }
                }
            }
            if (!positiva) {
                break;
            }
        }

        if (positiva) {
            System.out.println("Cholesky completada (A = L * L^T).");
            MostrarMatriz(L, tam, "L");
        }
    }

    public static void ResolverCholesky(double[][] A, int tam, double[][] L, double[] b, double[] x) throws IOException {
        double[] y = new double[50];
        System.out.println("Ingrese b:");
        for (int i = 0; i < tam; i++) {
            String val = Leer("b[" + (i + 1) + "]");
            while (val == null || !EsNumeroDouble(val)) {
                val = Leer("Invalido. Reingrese b[" + (i + 1) + "]");
            }
            b[i] = Double.parseDouble(val);
        }

        if (L[0][0] == 0.0) {
            Cholesky(A, tam, L);
        }

        for (int i = 0; i < tam; i++) {
            double suma = 0.0;
            for (int j = 0; j < i; j++) {
                suma = suma + L[i][j] * y[j];
            }
            if (Math.abs(L[i][i]) < 0.000001) {
                System.out.println("L[" + (i + 1) + "," + (i + 1) + "] = 0");
            } else {
                y[i] = (b[i] - suma) / L[i][i];
            }
        }

        for (int i = tam - 1; i >= 0; i--) {
            double suma = 0.0;
            for (int j = i + 1; j < tam; j++) {
                suma = suma + L[j][i] * x[j];
            }
            if (Math.abs(L[i][i]) < 0.000001) {
                System.out.println("L[" + (i + 1) + "," + (i + 1) + "] = 0");
            } else {
                x[i] = (y[i] - suma) / L[i][i];
            }
        }

        for (int i = 0; i < tam; i++) {
            System.out.printf(Locale.US, "x[%d] = %.6f\n", (i + 1), x[i]);
        }
    }

    public static void FactorizacionQR(double[][] A, int tam, double[][] Q, double[][] R) {
        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                R[i][j] = 0.0;
                Q[i][j] = A[i][j];
            }
        }

        for (int j = 0; j < tam; j++) {
            double suma = 0.0;
            for (int i = 0; i < tam; i++) {
                suma = suma + Q[i][j] * Q[i][j];
            }
            R[j][j] = Math.sqrt(suma);
            if (R[j][j] < 0.000001) {
                System.out.println("Columna " + (j + 1) + " dependiente. QR puede ser inestable.");
            } else {
                for (int i = 0; i < tam; i++) {
                    Q[i][j] = Q[i][j] / R[j][j];
                }
                for (int k = j + 1; k < tam; k++) {
                    double prod = 0.0;
                    for (int i = 0; i < tam; i++) {
                        prod = prod + Q[i][j] * Q[i][k];
                    }
                    R[j][k] = prod;
                    for (int i = 0; i < tam; i++) {
                        Q[i][k] = Q[i][k] - prod * Q[i][j];
                    }
                }
            }
        }
        System.out.println("QR completada.");
        MostrarMatriz(Q, tam, "Q");
        MostrarMatriz(R, tam, "R");
    }

    public static void Jacobi(double[][] A, int tam, double[] b, double[] x, double[] x0) throws IOException {
        double[] xNuevo = new double[50];
        System.out.println("Ingrese b:");
        for (int i = 0; i < tam; i++) {
            String val = Leer("b[" + (i + 1) + "]");
            while (val == null || !EsNumeroDouble(val)) {
                val = Leer("Invalido. Reingrese b[" + (i + 1) + "]");
            }
            b[i] = Double.parseDouble(val);
        }

        String tolStr = Leer("Tolerancia (ej 0.0001)");
        double tol = (tolStr != null && EsNumeroDouble(tolStr)) ? Double.parseDouble(tolStr) : 0.0001;

        String maxStr = Leer("Max iteraciones");
        int maxIter = (maxStr != null && EsNumeroEntero(maxStr)) ? Integer.parseInt(maxStr) : 100;

        for (int i = 0; i < tam; i++) {
            x[i] = 0.0;
            x0[i] = 0.0;
        }

        int iter = 0;
        boolean convergio = false;

        while (iter < maxIter && !convergio) {
            for (int i = 0; i < tam; i++) {
                double suma = 0.0;
                for (int j = 0; j < tam; j++) {
                    if (j != i) {
                        suma = suma + A[i][j] * x0[j];
                    }
                }
                if (Math.abs(A[i][i]) < 0.000001) {
                    xNuevo[i] = 0.0;
                } else {
                    xNuevo[i] = (b[i] - suma) / A[i][i];
                }
            }
            double error = 0.0;
            for (int i = 0; i < tam; i++) {
                double diff = Math.abs(xNuevo[i] - x0[i]);
                if (diff > error) {
                    error = diff;
                }
            }
            for (int i = 0; i < tam; i++) {
                x0[i] = xNuevo[i];
                x[i] = xNuevo[i];
            }
            iter++;
            if (error < tol) {
                convergio = true;
            }
        }

        if (convergio) {
            System.out.println("Convergencia en " + iter + " iters.");
            for (int i = 0; i < tam; i++) {
                System.out.printf(Locale.US, "x[%d] = %.6f\n", (i + 1), x[i]);
            }
        } else {
            System.out.println("NO convergio en " + maxIter + " iters.");
        }
    }

    public static void GaussSeidel(double[][] A, int tam, double[] b, double[] x) throws IOException {
        System.out.println("Ingrese b:");
        for (int i = 0; i < tam; i++) {
            String val = Leer("b[" + (i + 1) + "]");
            while (val == null || !EsNumeroDouble(val)) {
                val = Leer("Invalido. Reingrese b[" + (i + 1) + "]");
            }
            b[i] = Double.parseDouble(val);
        }

        String tolStr = Leer("Tolerancia");
        double tol = (tolStr != null && EsNumeroDouble(tolStr)) ? Double.parseDouble(tolStr) : 0.0001;

        String maxStr = Leer("Max iteraciones");
        int maxIter = (maxStr != null && EsNumeroEntero(maxStr)) ? Integer.parseInt(maxStr) : 100;

        for (int i = 0; i < tam; i++) {
            x[i] = 0.0;
        }

        int iter = 0;
        boolean convergio = false;

        while (iter < maxIter && !convergio) {
            double error = 0.0;
            for (int i = 0; i < tam; i++) {
                double suma = 0.0;
                for (int j = 0; j < tam; j++) {
                    if (j != i) {
                        suma = suma + A[i][j] * x[j];
                    }
                }
                if (Math.abs(A[i][i]) < 0.000001) {
                    System.out.println("Diagonal cero en [" + (i + 1) + "].");
                } else {
                    double anterior = x[i];
                    x[i] = (b[i] - suma) / A[i][i];
                    double diff = Math.abs(x[i] - anterior);
                    if (diff > error) {
                        error = diff;
                    }
                }
            }
            iter++;
            if (error < tol) {
                convergio = true;
            }
        }

        if (convergio) {
            System.out.println("Convergencia en " + iter + " iters.");
            for (int i = 0; i < tam; i++) {
                System.out.printf(Locale.US, "x[%d] = %.6f\n", (i + 1), x[i]);
            }
        } else {
            System.out.println("NO convergio en " + maxIter + " iters.");
        }
    }

    public static void PotenciaIterada(double[][] A, int tam, double[] x0) throws IOException {
        double[] y = new double[50];
        String tolStr = Leer("Tolerancia");
        double tol = (tolStr != null && EsNumeroDouble(tolStr)) ? Double.parseDouble(tolStr) : 0.0001;

        String maxStr = Leer("Max iteraciones");
        int maxIter = (maxStr != null && EsNumeroEntero(maxStr)) ? Integer.parseInt(maxStr) : 100;

        for (int i = 0; i < tam; i++) {
            x0[i] = 1.0;
        }

        int iter = 0;
        double lambda = 0.0;
        double lambdaAnt = 0.0;
        boolean convergio = false;

        while (iter < maxIter && !convergio) {
            for (int i = 0; i < tam; i++) {
                double suma = 0.0;
                for (int j = 0; j < tam; j++) {
                    suma = suma + A[i][j] * x0[j];
                }
                y[i] = suma;
            }
            double norma = 0.0;
            for (int i = 0; i < tam; i++) {
                if (Math.abs(y[i]) > norma) {
                    norma = Math.abs(y[i]);
                }
            }
            if (norma < 0.000001) {
                System.out.println("Norma ~0, vector trivial.");
                break;
            } else {
                for (int i = 0; i < tam; i++) {
                    x0[i] = y[i] / norma;
                }
                for (int i = 0; i < tam; i++) {
                    if (Math.abs(Math.abs(y[i]) - norma) < 0.000001) {
                        lambda = y[i] / x0[i];
                        break;
                    }
                }
                double error = Math.abs(lambda - lambdaAnt);
                lambdaAnt = lambda;
                iter++;
                if (error < tol && iter > 1) {
                    convergio = true;
                }
            }
        }

        if (convergio) {
            System.out.println("Convergencia en " + iter + " iters.");
            System.out.printf(Locale.US, "Valor propio dominante: %.6f\n", lambda);
            System.out.println("Vector propio:");
            for (int i = 0; i < tam; i++) {
                System.out.printf(Locale.US, "v[%d] = %.6f\n", (i + 1), x0[i]);
            }
        } else {
            System.out.printf(Locale.US, "NO convergio. Ultimo lambda: %.6f\n", lambda);
        }
    }

    public static void JacobiEigen(double[][] A, int tam, double[] eigvals, double[][] V) throws IOException {
        double[][] M = new double[50][50];
        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                M[i][j] = A[i][j];
                if (i == j) {
                    V[i][j] = 1.0;
                } else {
                    V[i][j] = 0.0;
                }
            }
        }

        String tolStr = Leer("Tolerancia (ej 0.0001)");
        double tol = (tolStr != null && EsNumeroDouble(tolStr)) ? Double.parseDouble(tolStr) : 0.0001;
        int maxIter = 100 * tam * tam;
        int iter = 0;
        double off = 0.0;

        do {
            off = 0.0;
            int p = 0;
            int q = 1;
            for (int i = 0; i < tam; i++) {
                for (int j = i + 1; j < tam; j++) {
                    if (Math.abs(M[i][j]) > off) {
                        off = Math.abs(M[i][j]);
                        p = i;
                        q = j;
                    }
                }
            }
            if (off > tol) {
                double app = M[p][p];
                double aqq = M[q][q];
                double apq = M[p][q];
                double theta = (aqq - app) / (2.0 * apq);
                double t;
                if (theta >= 0.0) {
                    t = 1.0 / (theta + Math.sqrt(1.0 + theta * theta));
                } else {
                    t = -1.0 / (-theta + Math.sqrt(1.0 + theta * theta));
                }
                double c = 1.0 / Math.sqrt(1.0 + t * t);
                double s = t * c;

                for (int k = 0; k < tam; k++) {
                    if (k != p && k != q) {
                        double temp = M[k][p];
                        M[k][p] = c * temp - s * M[k][q];
                        M[k][q] = s * temp + c * M[k][q];
                        M[p][k] = M[k][p];
                        M[q][k] = M[k][q];
                    }
                }
                M[p][p] = c * c * app - 2.0 * s * c * apq + s * s * aqq;
                M[q][q] = s * s * app + 2.0 * s * c * apq + c * c * aqq;
                M[p][q] = 0.0;
                M[q][p] = 0.0;

                for (int k = 0; k < tam; k++) {
                    double temp = V[k][p];
                    V[k][p] = c * temp - s * V[k][q];
                    V[k][q] = s * temp + c * V[k][q];
                }
                iter++;
            }
        } while (off > tol && iter < maxIter);

        System.out.println("Iteraciones: " + iter);
        System.out.println("Valores propios (diagonal de M):");
        for (int i = 0; i < tam; i++) {
            eigvals[i] = M[i][i];
            System.out.printf(Locale.US, "lambda[%d] = %.6f\n", (i + 1), eigvals[i]);
        }
        System.out.println("");
        System.out.println("Vectores propios (columnas de V):");
        MostrarMatriz(V, tam, "V (columnas = vectores propios)");
    }

    public static void SVDSimplificado(double[][] A, int tam, double[] S) throws IOException {
        double[][] At = new double[50][50];
        double[][] AtA = new double[50][50];
        double[][] V = new double[50][50];
        double[] eigvals = new double[50];

        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                At[i][j] = A[j][i];
            }
        }

        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                double suma = 0.0;
                for (int k = 0; k < tam; k++) {
                    suma = suma + At[i][k] * A[k][j];
                }
                AtA[i][j] = suma;
            }
        }

        System.out.println("Calculando valores propios de A^T A...");
        JacobiEigen(AtA, tam, eigvals, V);

        System.out.println("");
        System.out.println("Valores singulares (sqrt de eigvals, orden descendente):");
        for (int i = 0; i < tam; i++) {
            S[i] = Math.sqrt(Math.abs(eigvals[i]));
        }

        for (int i = 0; i < tam - 1; i++) {
            for (int j = i + 1; j < tam; j++) {
                if (S[j] > S[i]) {
                    double temp = S[i];
                    S[i] = S[j];
                    S[j] = temp;
                }
            }
        }

        for (int i = 0; i < tam; i++) {
            System.out.printf(Locale.US, "sigma[%d] = %.6f\n", (i + 1), S[i]);
        }
    }

    public static void GuardarMatriz(double[][] A, int tam) throws IOException {
        String archivo = Leer("Nombre de archivo (ej. matriz_A.txt)");
        if (archivo == null) {
            archivo = "matriz_A.txt";
        }
        PrintWriter writer = new PrintWriter(new FileWriter(archivo));
        writer.println(tam);
        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                writer.print(A[i][j] + " ");
            }
            writer.println("");
        }
        writer.close();
        System.out.println("Matriz guardada en " + archivo + " exitosamente.");
    }

    public static void CargarMatriz(double[][] A, int tam) throws IOException {
        String archivo = Leer("Nombre de archivo (ej. matriz_A.txt)");
        if (archivo == null) {
            archivo = "matriz_A.txt";
        }
        try {
            BufferedReader br = new BufferedReader(new FileReader(archivo));
            String lineaTam = br.readLine();
            if (lineaTam != null) {
                int nuevoTam = Integer.parseInt(lineaTam.trim());
                if (nuevoTam >= 1 && nuevoTam <= 50) {
                    n = nuevoTam;
                }
                for (int i = 0; i < n; i++) {
                    String linea = br.readLine();
                    if (linea != null) {
                        String[] partes = linea.trim().split("\\s+");
                        for (int j = 0; j < n && j < partes.length; j++) {
                            A[i][j] = Double.parseDouble(partes[j]);
                        }
                    }
                }
                System.out.println("Matriz cargada de " + archivo + " con tamanio " + n + "x" + n);
            }
            br.close();
        } catch (Exception e) {
            System.out.println("Error al cargar archivo: " + e.getMessage());
        }
    }

    public static void MenuOperacionesAvanzadas(double[][] A, double[][] L, double[][] U, double[][] Q, double[][] R, double[][] V, double[][] S_mat, double[][] inv, double[] b, double[] x, double[] x0, double[] eigvals) throws IOException {
        String[] menu = {
            "--- BASICAS ---",
            "1. Cambiar tamanio n",
            "2. Llenar A con aleatorios",
            "3. Llenar A manualmente",
            "4. Mostrar A",
            "5. Determinante por Gauss",
            "6. Inversa por Gauss-Jordan",
            "7. Rango",
            "8. Resolver Ax=b por Gauss-Jordan",
            "--- FACTORIZACIONES ---",
            "9. Factorizacion LU",
            "10. Resolver Ax=b via LU",
            "11. Descomposicion de Cholesky",
            "12. Resolver Ax=b via Cholesky",
            "13. Factorizacion QR (Gram-Schmidt)",
            "--- ITERATIVOS ---",
            "14. Metodo de Jacobi",
            "15. Metodo de Gauss-Seidel",
            "--- VALORES PROPIOS ---",
            "16. Valor propio dominante (potencias)",
            "17. Todos los valores propios (Jacobi simetricas)",
            "--- SVD ---",
            "18. SVD simplificado (valores singulares)",
            "--- ARCHIVOS ---",
            "19. Guardar matriz A en archivo",
            "20. Cargar matriz A desde archivo",
            "0. Salir"
        };

        double[] S = new double[50];
        String opcion = "";
        do {
            System.out.println("===== OPERACIONES AVANZADAS v3 =====");
            System.out.println("Tamanio actual: " + n + "x" + n);
            opcion = DesplegarMenu("", menu);
            if (opcion == null) {
                System.out.println("Opcion incorrecta o valor nulo.");
            } else {
                switch (opcion) {
                    case "1":
                        CambiarTamanio();
                        break;
                    case "2":
                        LlenarAleatorio(A, n);
                        break;
                    case "3":
                        LlenarManual(A, n);
                        break;
                    case "4":
                        MostrarMatriz(A, n, "A");
                        break;
                    case "5":
                        DeterminanteGauss(A, n);
                        break;
                    case "6":
                        InversaGaussJordan(A, n, inv);
                        break;
                    case "7":
                        RangoMatriz(A, n);
                        break;
                    case "8":
                        ResolverSistema(A, n, b, x);
                        break;
                    case "9":
                        FactorizacionLU(A, n, L, U);
                        break;
                    case "10":
                        ResolverLU(A, n, L, U, b, x);
                        break;
                    case "11":
                        Cholesky(A, n, L);
                        break;
                    case "12":
                        ResolverCholesky(A, n, L, b, x);
                        break;
                    case "13":
                        FactorizacionQR(A, n, Q, R);
                        break;
                    case "14":
                        Jacobi(A, n, b, x, x0);
                        break;
                    case "15":
                        GaussSeidel(A, n, b, x);
                        break;
                    case "16":
                        PotenciaIterada(A, n, x0);
                        break;
                    case "17":
                        JacobiEigen(A, n, eigvals, V);
                        break;
                    case "18":
                        SVDSimplificado(A, n, S);
                        break;
                    case "19":
                        GuardarMatriz(A, n);
                        break;
                    case "20":
                        CargarMatriz(A, n);
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
        double[][] A = new double[50][50];
        double[][] L = new double[50][50];
        double[][] U = new double[50][50];
        double[][] Q = new double[50][50];
        double[][] R = new double[50][50];
        double[][] V = new double[50][50];
        double[][] S_mat = new double[50][50];
        double[][] inv = new double[50][50];
        double[] b = new double[50];
        double[] x = new double[50];
        double[] x0 = new double[50];
        double[] eigvals = new double[50];

        LlenarAleatorio(A, n);
        MenuOperacionesAvanzadas(A, L, U, Q, R, V, S_mat, inv, b, x, x0, eigvals);
    }
}
