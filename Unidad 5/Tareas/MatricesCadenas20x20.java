package a2261330036_matricescadenas20x20;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class MatricesCadenas20x20 {

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
        String buscada = Leer("Palabra a buscar");
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
            System.out.println("Palabra no encontrada.");
        }
    }

    public static void ContarOcurrencias(String[][] M) throws IOException {
        String buscada = Leer("Palabra a contar");
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
        System.out.println("Ocurrencias de '" + buscada + "': " + cont);
    }

    public static void ReemplazarPalabra(String[][] M) throws IOException {
        String vieja = Leer("Palabra a reemplazar");
        String nueva = Leer("Nueva palabra");
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
        System.out.println("Reemplazos realizados: " + cont);
    }

    public static void PalabraMasLargaCorta(String[][] M) {
        int lenMax = 0;
        int lenMin = 999;
        String masLarga = "";
        String masCorta = "";
        int posMaxF = 0;
        int posMaxC = 0;
        int posMinF = 0;
        int posMinC = 0;

        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if (!M[i][j].isEmpty()) {
                    int len = M[i][j].length();
                    if (len > lenMax) {
                        lenMax = len;
                        masLarga = M[i][j];
                        posMaxF = i + 1;
                        posMaxC = j + 1;
                    }
                    if (len < lenMin) {
                        lenMin = len;
                        masCorta = M[i][j];
                        posMinF = i + 1;
                        posMinC = j + 1;
                    }
                }
            }
        }

        System.out.println("Mas larga: '" + masLarga + "' (" + lenMax + " chars) en [" + posMaxF + "," + posMaxC + "]");
        System.out.println("Mas corta: '" + masCorta + "' (" + lenMin + " chars) en [" + posMinF + "," + posMinC + "]");
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
        System.out.println("Transpuesta generada.");
        MostrarMatrizCad(T, "M^T");
    }

    public static void ConcatenarTodo(String[][] M) {
        StringBuilder cadenaFinal = new StringBuilder();
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if (!M[i][j].isEmpty()) {
                    cadenaFinal.append(M[i][j]).append(" ");
                }
            }
        }
        String res = cadenaFinal.toString().trim();
        System.out.println("Cadena concatenada:");
        System.out.println(res);
        System.out.println("Longitud total: " + res.length());
    }

    public static boolean esPalindromo(String palabra) {
        if (palabra == null || palabra.length() < 2) {
            return false;
        }
        int len = palabra.length();
        for (int i = 0; i < len / 2; i++) {
            if (palabra.charAt(i) != palabra.charAt(len - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void BuscarPalindromos(String[][] M) {
        int cont = 0;
        System.out.println("Palindromos encontrados:");
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if (!M[i][j].isEmpty() && esPalindromo(M[i][j])) {
                    System.out.println(" [" + (i + 1) + "," + (j + 1) + "] = " + M[i][j]);
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
        System.out.println("Filas ordenadas alfabeticamente.");
        MostrarMatrizCad(M, "M ordenada por filas");
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
        System.out.println("Matriz ordenada globalmente.");
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
                    char letra = M[i][j].charAt(k);
                    if ((letra >= 'a' && letra <= 'z') || (letra >= 'A' && letra <= 'Z')) {
                        if (vocalesStr.indexOf(letra) != -1) {
                            vocales++;
                        } else {
                            consonantes++;
                        }
                    }
                }
            }
        }
        System.out.println("Vocales: " + vocales);
        System.out.println("Consonantes: " + consonantes);
    }

    public static void ConvertirMayusculas(String[][] M) {
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                M[i][j] = M[i][j].toUpperCase();
            }
        }
        System.out.println("Convertido a MAYUSCULAS.");
        MostrarMatrizCad(M, "M mayusculas");
    }

    public static void ConvertirMinusculas(String[][] M) {
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                M[i][j] = M[i][j].toLowerCase();
            }
        }
        System.out.println("Convertido a minusculas.");
        MostrarMatrizCad(M, "M minusculas");
    }

    public static void InvertirPalabras(String[][] M) {
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                StringBuilder sb = new StringBuilder(M[i][j]);
                M[i][j] = sb.reverse().toString();
            }
        }
        System.out.println("Palabras invertidas.");
        MostrarMatrizCad(M, "M invertida");
    }

    public static void FiltrarPorLongitud(String[][] M) throws IOException {
        String input = Leer("Longitud minima a conservar");
        if (input == null || !EsNumeroEntero(input)) {
            System.out.println("Dato invalido.");
            return;
        }
        int minLen = Integer.parseInt(input);
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
        System.out.println("Palabras eliminadas: " + eliminadas);
        MostrarMatrizCad(M, "M filtrada");
    }

    public static void MenuMatricesCadenas(String[][] M, String[][] T) throws IOException {
        String[] menu = {
            "1. Llenar matriz manualmente",
            "2. Llenar con palabras aleatorias",
            "3. Mostrar matriz",
            "4. Buscar una palabra (posicion)",
            "5. Contar ocurrencias de una palabra",
            "6. Reemplazar palabra por otra",
            "7. Mostrar la palabra mas larga y mas corta",
            "8. Contar cuantas celdas estan vacias",
            "9. Transpuesta de la matriz",
            "10. Concatenar toda la matriz en una cadena",
            "11. Buscar palindromos en la matriz",
            "12. Ordenar cada fila alfabeticamente",
            "13. Ordenar toda la matriz alfabeticamente",
            "14. Contar vocales y consonantes totales",
            "15. Convertir todo a MAYUSCULAS",
            "16. Convertir todo a minusculas",
            "17. Invertir cada palabra",
            "18. Filtrar palabras por longitud minima",
            "0. Salir"
        };

        String opcion = "";
        do {
            opcion = DesplegarMenu("===== MATRICES DE CADENAS 20x20 =====", menu);
            if (opcion == null) {
                System.out.println("Opcion incorrecta o valor nulo.");
            } else {
                switch (opcion) {
                    case "1":
                        LlenarManual(M);
                        break;
                    case "2":
                        LlenarAleatorio(M);
                        break;
                    case "3":
                        MostrarMatrizCad(M, "M");
                        break;
                    case "4":
                        BuscarPalabra(M);
                        break;
                    case "5":
                        ContarOcurrencias(M);
                        break;
                    case "6":
                        ReemplazarPalabra(M);
                        break;
                    case "7":
                        PalabraMasLargaCorta(M);
                        break;
                    case "8":
                        ContarVacias(M);
                        break;
                    case "9":
                        TranspuestaCad(M, T);
                        break;
                    case "10":
                        ConcatenarTodo(M);
                        break;
                    case "11":
                        BuscarPalindromos(M);
                        break;
                    case "12":
                        OrdenarFilas(M);
                        break;
                    case "13":
                        OrdenarToda(M);
                        break;
                    case "14":
                        ContarVocalesConsonantes(M);
                        break;
                    case "15":
                        ConvertirMayusculas(M);
                        break;
                    case "16":
                        ConvertirMinusculas(M);
                        break;
                    case "17":
                        InvertirPalabras(M);
                        break;
                    case "18":
                        FiltrarPorLongitud(M);
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
        String[][] M = new String[20][20];
        String[][] T = new String[20][20];
        InicializarMatriz(M);
        MenuMatricesCadenas(M, T);
    }
}
