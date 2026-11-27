package a2261330036_matricescadenasavanzado;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class MatricesCadenasAvanzado {

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

    public static void InicializarMatriz(String[][] M) {
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                M[i][j] = "";
            }
        }
    }

    public static void LlenarManual(String[][] M) throws IOException {
        System.out.println("Ingrese las palabras (Enter para dejar vacio):");
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                String val = Dialogo("M[" + (i + 1) + "," + (j + 1) + "]");
                if (val == null) {
                    M[i][j] = "";
                } else {
                    M[i][j] = val.trim();
                }
            }
        }
        System.out.println("Matriz llenada.");
    }

    public static void LlenarAleatorio(String[][] M) {
        String[] palabras = {
            "sol", "luna", "mar", "cielo", "arbol",
            "reconocer", "oso", "radar", "computadora", "libro",
            "nube", "fuego", "anilina", "programa", "a"
        };
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                int idx = (int) (Math.random() * palabras.length);
                M[i][j] = palabras[idx];
            }
        }
        System.out.println("Matriz llenada con palabras aleatorias.");
    }

    public static void MostrarMatrizCad(String[][] M, String nombre) {
        System.out.println("");
        System.out.println("===== MATRIZ " + nombre + " =====");
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.printf("%-12s ", M[i][j]);
            }
            System.out.println("");
        }
        System.out.println("");
    }

    public static void BuscarPalabra(String[][] M) throws IOException {
        String buscada = Leer("Palabra");
        if (buscada == null) {
            System.out.println("Dato nulo.");
            return;
        }
        boolean encontrada = false;
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if (M[i][j].equals(buscada)) {
                    System.out.println("Encontrada en [" + (i + 1) + "," + (j + 1) + "]");
                    encontrada = true;
                }
            }
        }
        if (!encontrada) {
            System.out.println("No encontrada.");
        }
    }

    public static void ContarOcurrencias(String[][] M) throws IOException {
        String buscada = Leer("Palabra");
        if (buscada == null) {
            System.out.println("Dato nulo.");
            return;
        }
        int cont = 0;
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if (M[i][j].equals(buscada)) {
                    cont++;
                }
            }
        }
        System.out.println("Ocurrencias: " + cont);
    }

    public static void ReemplazarPalabra(String[][] M) throws IOException {
        String vieja = Leer("Vieja");
        String nueva = Leer("Nueva");
        if (vieja == null || nueva == null) {
            System.out.println("Dato nulo.");
            return;
        }
        int cont = 0;
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if (M[i][j].equals(vieja)) {
                    M[i][j] = nueva;
                    cont++;
                }
            }
        }
        System.out.println("Reemplazos: " + cont);
    }

    public static void PalabraMasLargaCorta(String[][] M) {
        int lenMax = 0;
        int lenMin = 999;
        String masLarga = "";
        String masCorta = "";
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if (!M[i][j].isEmpty()) {
                    int len = M[i][j].length();
                    if (len > lenMax) {
                        lenMax = len;
                        masLarga = M[i][j];
                    }
                    if (len < lenMin) {
                        lenMin = len;
                        masCorta = M[i][j];
                    }
                }
            }
        }
        System.out.println("Mas larga: '" + masLarga + "' (" + lenMax + ")");
        System.out.println("Mas corta: '" + masCorta + "' (" + lenMin + ")");
    }

    public static void ContarVacias(String[][] M) {
        int vacias = 0;
        int llenas = 0;
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if (M[i][j].isEmpty()) {
                    vacias++;
                } else {
                    llenas++;
                }
            }
        }
        System.out.println("Vacias: " + vacias + " | Llenas: " + llenas);
    }

    public static void TranspuestaCad(String[][] M, String[][] T) {
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                T[i][j] = M[j][i];
            }
        }
        MostrarMatrizCad(T, "M^T");
    }

    public static void ConcatenarTodo(String[][] M) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if (!M[i][j].isEmpty()) {
                    sb.append(M[i][j]).append(" ");
                }
            }
        }
        String cadenaFinal = sb.toString();
        System.out.println(cadenaFinal);
        System.out.println("Longitud: " + cadenaFinal.length());
    }

    public static boolean esPalindromo(String palabra) {
        int len = palabra.length();
        if (len < 2) {
            return false;
        }
        int mitad = len / 2;
        for (int i = 0; i < mitad; i++) {
            if (palabra.charAt(i) != palabra.charAt(len - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void BuscarPalindromos(String[][] M) {
        int cont = 0;
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if (!M[i][j].isEmpty() && esPalindromo(M[i][j])) {
                    System.out.println("[" + (i + 1) + "," + (j + 1) + "] = " + M[i][j]);
                    cont++;
                }
            }
        }
        System.out.println("Total: " + cont);
    }

    public static void OrdenarFilas(String[][] M) {
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 19; j++) {
                for (int k = 0; k < 19 - j; k++) {
                    if (M[i][k].compareTo(M[i][k + 1]) > 0) {
                        String temp = M[i][k];
                        M[i][k] = M[i][k + 1];
                        M[i][k + 1] = temp;
                    }
                }
            }
        }
        MostrarMatrizCad(M, "M filas ordenadas");
    }

    public static void OrdenarToda(String[][] M) {
        String[] V = new String[400];
        int idx = 0;
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                V[idx] = M[i][j];
                idx++;
            }
        }
        for (int a = 0; a < 399; a++) {
            for (int b = 0; b < 399 - a; b++) {
                if (V[b].compareTo(V[b + 1]) > 0) {
                    String temp = V[b];
                    V[b] = V[b + 1];
                    V[b + 1] = temp;
                }
            }
        }
        idx = 0;
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                M[i][j] = V[idx];
                idx++;
            }
        }
        MostrarMatrizCad(M, "M ordenada global");
    }

    public static void ContarVocalesConsonantes(String[][] M) {
        int vocales = 0;
        int consonantes = 0;
        String vocalesStr = "aeiouAEIOU";
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                int len = M[i][j].length();
                for (int k = 0; k < len; k++) {
                    char c = M[i][j].charAt(k);
                    if (vocalesStr.indexOf(c) >= 0) {
                        vocales++;
                    } else if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                        consonantes++;
                    }
                }
            }
        }
        System.out.println("Vocales: " + vocales + " | Consonantes: " + consonantes);
    }

    public static void ConvertirMayusculas(String[][] M) {
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                M[i][j] = M[i][j].toUpperCase();
            }
        }
        MostrarMatrizCad(M, "M mayusculas");
    }

    public static void ConvertirMinusculas(String[][] M) {
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                M[i][j] = M[i][j].toLowerCase();
            }
        }
        MostrarMatrizCad(M, "M minusculas");
    }

    public static void InvertirPalabras(String[][] M) {
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                StringBuilder sb = new StringBuilder(M[i][j]);
                M[i][j] = sb.reverse().toString();
            }
        }
        MostrarMatrizCad(M, "M invertida");
    }

    public static void FiltrarPorLongitud(String[][] M) throws IOException {
        String s = Leer("Longitud minima");
        if (s == null || !EsNumeroEntero(s)) {
            System.out.println("Numero no valido.");
            return;
        }
        int minLen = Integer.parseInt(s);
        int eliminadas = 0;
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if (!M[i][j].isEmpty()) {
                    if (M[i][j].length() < minLen) {
                        M[i][j] = "";
                        eliminadas++;
                    }
                }
            }
        }
        System.out.println("Eliminadas: " + eliminadas);
        MostrarMatrizCad(M, "M filtrada");
    }

    public static boolean coincideComodin(String texto, String patron) {
        int lt = texto.length();
        int lp = patron.length();
        boolean[][] dp = new boolean[lt + 1][lp + 1];
        dp[0][0] = true;
        for (int j = 1; j <= lp; j++) {
            if (patron.charAt(j - 1) == '*') {
                dp[0][j] = dp[0][j - 1];
            } else {
                dp[0][j] = false;
            }
        }
        for (int i = 1; i <= lt; i++) {
            dp[i][0] = false;
        }
        for (int i = 1; i <= lt; i++) {
            for (int j = 1; j <= lp; j++) {
                char cPatron = patron.charAt(j - 1);
                char cTexto = texto.charAt(i - 1);
                if (cPatron == '*') {
                    if (dp[i][j - 1] || dp[i - 1][j]) {
                        dp[i][j] = true;
                    } else {
                        dp[i][j] = false;
                    }
                } else {
                    if (cPatron == '?' || cPatron == cTexto) {
                        dp[i][j] = dp[i - 1][j - 1];
                    } else {
                        dp[i][j] = false;
                    }
                }
            }
        }
        return dp[lt][lp];
    }

    public static void BusquedaComodines(String[][] M) throws IOException {
        String patron = Leer("Patron (use * y ?)");
        if (patron == null) {
            System.out.println("Patron nulo.");
            return;
        }
        int cont = 0;
        System.out.println("Coincidencias:");
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if (!M[i][j].isEmpty() && coincideComodin(M[i][j].toLowerCase(), patron.toLowerCase())) {
                    System.out.println(" [" + (i + 1) + "," + (j + 1) + "] = " + M[i][j]);
                    cont++;
                }
            }
        }
        System.out.println("Total: " + cont);
    }

    public static boolean esDigito(char c) {
        return c >= '0' && c <= '9';
    }

    public static boolean esLetraNum(char c) {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9');
    }

    public static boolean matchChar(char car, char pat) {
        if (pat == '.') {
            return true;
        } else if (pat == 'd') {
            return esDigito(car);
        } else if (pat == 'w') {
            return esLetraNum(car);
        } else {
            return car == pat;
        }
    }

    public static boolean coincideRegex(String texto, String patron) {
        int lt = texto.length();
        int lp = patron.length();
        int i = 0;
        int j = 0;
        boolean ancladoIni = false;
        boolean ancladoFin = false;
        boolean ok = true;
        if (lp > 0 && patron.charAt(0) == '^') {
            ancladoIni = true;
            j = 1;
        }
        if (lp > 0 && patron.charAt(lp - 1) == '$') {
            ancladoFin = true;
            lp = lp - 1;
        }
        while (j < lp && ok) {
            char c = patron.charAt(j);
            if (c == '\\' && j + 1 < lp) {
                c = patron.charAt(j + 1);
                j++;
            }
            char cSig = (j + 1 < lp) ? patron.charAt(j + 1) : '\0';
            boolean cuant = (cSig == '*' || cSig == '+' || cSig == '?');
            if (cuant) {
                if (cSig == '*') {
                    while (i < lt && matchChar(texto.charAt(i), c)) {
                        i++;
                    }
                } else if (cSig == '+') {
                    if (i >= lt || !matchChar(texto.charAt(i), c)) {
                        ok = false;
                    } else {
                        while (i < lt && matchChar(texto.charAt(i), c)) {
                            i++;
                        }
                    }
                } else {
                    if (i < lt && matchChar(texto.charAt(i), c)) {
                        i++;
                    }
                }
                j += 2;
            } else {
                if (i >= lt) {
                    ok = false;
                } else {
                    if (matchChar(texto.charAt(i), c)) {
                        i++;
                        j++;
                    } else {
                        ok = false;
                    }
                }
            }
        }
        if (ok) {
            if (ancladoFin && i < lt) {
                ok = false;
            }
            if (ancladoIni && j < lp) {
                ok = false;
            }
        }
        return ok;
    }

    public static void BusquedaRegexSimple(String[][] M) throws IOException {
        String patron = Leer("Patron regex (^ $ . * + ? \\d \\w)");
        if (patron == null) {
            System.out.println("Patron nulo.");
            return;
        }
        int cont = 0;
        System.out.println("Coincidencias:");
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if (!M[i][j].isEmpty() && coincideRegex(M[i][j], patron)) {
                    System.out.println(" [" + (i + 1) + "," + (j + 1) + "] = " + M[i][j]);
                    cont++;
                }
            }
        }
        System.out.println("Total: " + cont);
    }

    public static void ContarPalabrasDistintas(String[][] M) {
        String[] unicas = new String[400];
        int distintos = 0;
        int total = 0;
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if (!M[i][j].isEmpty()) {
                    total++;
                    String palabra = M[i][j];
                    boolean yaEsta = false;
                    for (int k = 0; k < distintos; k++) {
                        if (unicas[k].equals(palabra)) {
                            yaEsta = true;
                            break;
                        }
                    }
                    if (!yaEsta) {
                        unicas[distintos] = palabra;
                        distintos++;
                    }
                }
            }
        }
        System.out.println("Total celdas con texto: " + total);
        System.out.println("Palabras distintas: " + distintos);
        System.out.println("");
        System.out.println("Listado:");
        for (int k = 0; k < distintos; k++) {
            System.out.println(" " + (k + 1) + ". " + unicas[k]);
        }
    }

    public static void HistogramaFrecuencias(String[][] M) {
        String[] unicas = new String[400];
        int[] frec = new int[400];
        int distintos = 0;
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if (!M[i][j].isEmpty()) {
                    String palabra = M[i][j];
                    boolean yaEsta = false;
                    for (int k = 0; k < distintos; k++) {
                        if (unicas[k].equals(palabra)) {
                            frec[k]++;
                            yaEsta = true;
                            break;
                        }
                    }
                    if (!yaEsta) {
                        unicas[distintos] = palabra;
                        frec[distintos] = 1;
                        distintos++;
                    }
                }
            }
        }
        String[] ordenadas = new String[distintos];
        int[] ordenadasF = new int[distintos];
        for (int k = 0; k < distintos; k++) {
            ordenadas[k] = unicas[k];
            ordenadasF[k] = frec[k];
        }
        for (int a = 0; a < distintos - 1; a++) {
            for (int b = 0; b < distintos - 1 - a; b++) {
                if (ordenadasF[b] < ordenadasF[b + 1]) {
                    String temp = ordenadas[b];
                    ordenadas[b] = ordenadas[b + 1];
                    ordenadas[b + 1] = temp;
                    int tempF = ordenadasF[b];
                    ordenadasF[b] = ordenadasF[b + 1];
                    ordenadasF[b + 1] = tempF;
                }
            }
        }
        int maxF = 0;
        for (int k = 0; k < distintos; k++) {
            if (ordenadasF[k] > maxF) {
                maxF = ordenadasF[k];
            }
        }
        System.out.println("");
        System.out.println("===== HISTOGRAMA DE FRECUENCIAS =====");
        for (int k = 0; k < distintos; k++) {
            System.out.print(ordenadas[k] + " (" + ordenadasF[k] + "): ");
            int tamBarra = 0;
            if (maxF > 0) {
                tamBarra = (ordenadasF[k] * 40) / maxF;
            }
            StringBuilder barra = new StringBuilder();
            for (int a = 0; a < tamBarra; a++) {
                barra.append("#");
            }
            System.out.println(barra.toString());
        }
        System.out.println("");
        System.out.println("Total distintos: " + distintos);
    }

    public static void FrecuenciaLetras(String[][] M) {
        String[] letras = {
            "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m",
            "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"
        };
        int[] freq = new int[26];
        int[] ordenIdx = new int[26];
        for (int k = 0; k < 26; k++) {
            freq[k] = 0;
            ordenIdx[k] = k;
        }
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                String val = M[i][j].toLowerCase();
                int len = val.length();
                for (int k = 0; k < len; k++) {
                    char c = val.charAt(k);
                    if (c >= 'a' && c <= 'z') {
                        freq[c - 'a']++;
                    }
                }
            }
        }
        for (int a = 0; a < 25; a++) {
            for (int b = 0; b < 25 - a; b++) {
                if (freq[ordenIdx[b]] < freq[ordenIdx[b + 1]]) {
                    int temp = ordenIdx[b];
                    ordenIdx[b] = ordenIdx[b + 1];
                    ordenIdx[b + 1] = temp;
                }
            }
        }
        int maxF = 0;
        for (int k = 0; k < 26; k++) {
            if (freq[k] > maxF) {
                maxF = freq[k];
            }
        }
        System.out.println("");
        System.out.println("===== FRECUENCIA DE LETRAS =====");
        for (int k = 0; k < 26; k++) {
            int idx = ordenIdx[k];
            if (freq[idx] > 0) {
                System.out.print(letras[idx] + " (" + freq[idx] + "): ");
                int tamBarra = 0;
                if (maxF > 0) {
                    tamBarra = (freq[idx] * 40) / maxF;
                }
                StringBuilder barra = new StringBuilder();
                for (int a = 0; a < tamBarra; a++) {
                    barra.append("*");
                }
                System.out.println(barra.toString());
            }
        }
    }

    public static void CompararMatrices(String[][] M, String[][] N) {
        int vaciasM = 0;
        int vaciasN = 0;
        int iguales = 0;
        int diferentes = 0;
        boolean sonIguales = true;
        System.out.println("");
        System.out.println("===== COMPARACION M vs N =====");
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if (M[i][j].isEmpty()) {
                    vaciasM++;
                }
                if (N[i][j].isEmpty()) {
                    vaciasN++;
                }
                if (M[i][j].equals(N[i][j])) {
                    if (!M[i][j].isEmpty()) {
                        iguales++;
                    }
                } else {
                    diferentes++;
                    sonIguales = false;
                    System.out.println(" Dif [" + (i + 1) + "," + (j + 1) + "]: M='" + M[i][j] + "' vs N='" + N[i][j] + "'");
                }
            }
        }
        System.out.println("");
        System.out.println("----- RESULTADOS -----");
        System.out.println("Celdas iguales (no vacias): " + iguales);
        System.out.println("Celdas diferentes: " + diferentes);
        System.out.println("Vacias en M: " + vaciasM);
        System.out.println("Vacias en N: " + vaciasN);
        System.out.println("");
        if (sonIguales) {
            System.out.println("RESULTADO: M y N son IDENTICAS.");
        } else {
            System.out.println("RESULTADO: M y N son DIFERENTES.");
        }
    }

    public static void MapaDiferencias(String[][] M, String[][] N) {
        System.out.println("");
        System.out.println("===== MAPA DE DIFERENCIAS ( . = igual | X = difiere ) =====");
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if (M[i][j].equals(N[i][j])) {
                    System.out.print(" . ");
                } else {
                    System.out.print(" X ");
                }
            }
            System.out.println("");
        }
        System.out.println("");
    }

    public static void main(String[] args) throws IOException {
        String[][] M = new String[20][20];
        String[][] N = new String[20][20];
        String[][] T = new String[20][20];
        InicializarMatriz(M);
        InicializarMatriz(N);
        InicializarMatriz(T);

        String[] menuPrincipal = {
            "--- BASICAS ---",
            "1. Llenar M manualmente",
            "2. Llenar M con palabras aleatorias",
            "3. Llenar N con palabras aleatorias",
            "4. Mostrar M",
            "5. Mostrar N",
            "6. Buscar palabra exacta",
            "7. Contar ocurrencias",
            "8. Reemplazar palabra",
            "9. Mostrar mas larga / mas corta",
            "10. Contar vacias / llenas",
            "11. Transpuesta de M",
            "12. Concatenar toda M",
            "13. Buscar palindromos",
            "14. Ordenar filas de M",
            "15. Ordenar toda M",
            "16. Contar vocales y consonantes",
            "17. Convertir a MAYUSCULAS",
            "18. Convertir a minusculas",
            "19. Invertir palabras",
            "20. Filtrar por longitud minima",
            "--- AVANZADAS ---",
            "21. Busqueda con comodines (* y ?)",
            "22. Busqueda con patron regex simplificado",
            "23. Contar palabras distintas en M",
            "24. Histograma de frecuencias de palabras",
            "25. Frecuencia de letras en M",
            "26. Comparar M y N (igualdad y diferencias)",
            "27. Mapa visual de diferencias M vs N",
            "0. Salir"
        };

        boolean ejecutar = true;
        while (ejecutar) {
            String opcionStr = DesplegarMenu("==========================================\n MATRICES DE CADENAS AVANZADO v2 \n==========================================", menuPrincipal);
            if (opcionStr != null && EsNumeroEntero(opcionStr)) {
                int op = Integer.parseInt(opcionStr);
                switch (op) {
                    case 1:
                        LlenarManual(M);
                        break;
                    case 2:
                        LlenarAleatorio(M);
                        break;
                    case 3:
                        LlenarAleatorio(N);
                        break;
                    case 4:
                        MostrarMatrizCad(M, "M");
                        break;
                    case 5:
                        MostrarMatrizCad(N, "N");
                        break;
                    case 6:
                        BuscarPalabra(M);
                        break;
                    case 7:
                        ContarOcurrencias(M);
                        break;
                    case 8:
                        ReemplazarPalabra(M);
                        break;
                    case 9:
                        PalabraMasLargaCorta(M);
                        break;
                    case 10:
                        ContarVacias(M);
                        break;
                    case 11:
                        TranspuestaCad(M, T);
                        break;
                    case 12:
                        ConcatenarTodo(M);
                        break;
                    case 13:
                        BuscarPalindromos(M);
                        break;
                    case 14:
                        OrdenarFilas(M);
                        break;
                    case 15:
                        OrdenarToda(M);
                        break;
                    case 16:
                        ContarVocalesConsonantes(M);
                        break;
                    case 17:
                        ConvertirMayusculas(M);
                        break;
                    case 18:
                        ConvertirMinusculas(M);
                        break;
                    case 19:
                        InvertirPalabras(M);
                        break;
                    case 20:
                        FiltrarPorLongitud(M);
                        break;
                    case 21:
                        BusquedaComodines(M);
                        break;
                    case 22:
                        BusquedaRegexSimple(M);
                        break;
                    case 23:
                        ContarPalabrasDistintas(M);
                        break;
                    case 24:
                        HistogramaFrecuencias(M);
                        break;
                    case 25:
                        FrecuenciaLetras(M);
                        break;
                    case 26:
                        CompararMatrices(M, N);
                        break;
                    case 27:
                        MapaDiferencias(M, N);
                        break;
                    case 0:
                        System.out.println("Saliendo...");
                        ejecutar = false;
                        break;
                    default:
                        System.out.println("Opcion fuera de rango.");
                        break;
                }
            } else {
                System.out.println("Opcion no valida. Ingrese un numero entero.");
            }
        }
    }
}
