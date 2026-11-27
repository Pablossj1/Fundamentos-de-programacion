package a2261330036_juegosconmatrices;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class JuegosConMatrices {

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

    public static void TresEnRaya() throws IOException {
        String[][] tab = new String[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tab[i][j] = " ";
            }
        }
        int turno = 1;
        int ganador = 0;
        int jugadas = 0;
        while (ganador == 0 && jugadas < 9) {
            System.out.println("");
            System.out.println("  1   2   3");
            for (int i = 0; i < 3; i++) {
                System.out.print((i + 1) + " ");
                for (int j = 0; j < 3; j++) {
                    System.out.print(tab[i][j]);
                    if (j < 2) {
                        System.out.print(" | ");
                    }
                }
                System.out.println("");
                if (i < 2) {
                    System.out.println(" ---+---+---");
                }
            }
            String marca = (turno == 1) ? "X" : "O";
            System.out.println("");
            System.out.println("Turno de " + marca);
            String sf = Leer("Fila (1-3)");
            String sc = Leer("Columna (1-3)");
            if (sf != null && sc != null && EsNumeroEntero(sf) && EsNumeroEntero(sc)) {
                int fila = Integer.parseInt(sf);
                int col = Integer.parseInt(sc);
                if (fila >= 1 && fila <= 3 && col >= 1 && col <= 3 && tab[fila - 1][col - 1].equals(" ")) {
                    tab[fila - 1][col - 1] = marca;
                    jugadas++;
                    for (int i = 0; i < 3; i++) {
                        if (tab[i][0].equals(marca) && tab[i][1].equals(marca) && tab[i][2].equals(marca)) {
                            ganador = turno;
                        }
                    }
                    for (int j = 0; j < 3; j++) {
                        if (tab[0][j].equals(marca) && tab[1][j].equals(marca) && tab[2][j].equals(marca)) {
                            ganador = turno;
                        }
                    }
                    if (tab[0][0].equals(marca) && tab[1][1].equals(marca) && tab[2][2].equals(marca)) {
                        ganador = turno;
                    }
                    if (tab[0][2].equals(marca) && tab[1][1].equals(marca) && tab[2][0].equals(marca)) {
                        ganador = turno;
                    }
                    if (ganador == 0) {
                        turno = (turno == 1) ? 2 : 1;
                    }
                } else {
                    System.out.println("Movimiento invalido.");
                }
            } else {
                System.out.println("Entrada no numerica valida.");
            }
        }
        System.out.println("");
        for (int i = 0; i < 3; i++) {
            System.out.print("  ");
            for (int j = 0; j < 3; j++) {
                System.out.print(tab[i][j]);
                if (j < 2) {
                    System.out.print(" | ");
                }
            }
            System.out.println("");
            if (i < 2) {
                System.out.println(" ---+---+---");
            }
        }
        if (ganador == 1) {
            System.out.println("GANA X!");
        } else if (ganador == 2) {
            System.out.println("GANA O!");
        } else {
            System.out.println("EMPATE!");
        }
    }

    public static void Buscaminas() throws IOException {
        int[][] tab = new int[8][8];
        int[][] visible = new int[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                tab[i][j] = 0;
                visible[i][j] = 0;
            }
        }
        int minasPuestas = 0;
        while (minasPuestas < 10) {
            int fila = (int) (Math.random() * 8);
            int col = (int) (Math.random() * 8);
            if (tab[fila][col] != -1) {
                tab[fila][col] = -1;
                minasPuestas++;
            }
        }
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (tab[i][j] != -1) {
                    int cont = 0;
                    for (int r = i - 1; r <= i + 1; r++) {
                        for (int c = j - 1; c <= j + 1; c++) {
                            if (r >= 0 && r < 8 && c >= 0 && c < 8) {
                                if (tab[r][c] == -1) {
                                    cont++;
                                }
                            }
                        }
                    }
                    tab[i][j] = cont;
                }
            }
        }
        int vivo = 1;
        int descubiertas = 0;
        while (vivo == 1 && descubiertas < 54) {
            System.out.println("");
            System.out.print("  ");
            for (int j = 1; j <= 8; j++) {
                System.out.print(j + " ");
            }
            System.out.println("");
            for (int i = 0; i < 8; i++) {
                System.out.print((i + 1) + " ");
                for (int j = 0; j < 8; j++) {
                    if (visible[i][j] == 1) {
                        if (tab[i][j] == -1) {
                            System.out.print("* ");
                        } else if (tab[i][j] == 0) {
                            System.out.print(". ");
                        } else {
                            System.out.print(tab[i][j] + " ");
                        }
                    } else {
                        System.out.print("# ");
                    }
                }
                System.out.println("");
            }
            System.out.println("Descubiertas: " + descubiertas + "/54");
            String sf = Leer("Fila (1-8)");
            String sc = Leer("Columna (1-8)");
            if (sf != null && sc != null && EsNumeroEntero(sf) && EsNumeroEntero(sc)) {
                int fila = Integer.parseInt(sf);
                int col = Integer.parseInt(sc);
                if (fila >= 1 && fila <= 8 && col >= 1 && col <= 8 && visible[fila - 1][col - 1] == 0) {
                    visible[fila - 1][col - 1] = 1;
                    if (tab[fila - 1][col - 1] == -1) {
                        System.out.println("BOOM! Pisaste una mina.");
                        vivo = 0;
                    } else {
                        descubiertas++;
                        if (tab[fila - 1][col - 1] == 0) {
                            for (int r = fila - 2; r <= fila; r++) {
                                for (int c = col - 2; c <= col; c++) {
                                    if (r >= 0 && r < 8 && c >= 0 && c < 8) {
                                        if (visible[r][c] == 0 && tab[r][c] != -1) {
                                            visible[r][c] = 1;
                                            descubiertas++;
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    System.out.println("Movimiento invalido.");
                }
            } else {
                System.out.println("Entrada invalida.");
            }
        }
        if (vivo == 1) {
            System.out.println("GANASTE! Encontraste todas las casillas seguras.");
        } else {
            System.out.println("GAME OVER. Tablero completo:");
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {
                    if (tab[i][j] == -1) {
                        System.out.print("* ");
                    } else {
                        System.out.print(tab[i][j] + " ");
                    }
                }
                System.out.println("");
            }
        }
    }

    public static void Serpiente() throws IOException {
        String[][] tab = new String[10][10];
        int[][] cuerpo = new int[100][2];
        int largo = 3;
        cuerpo[0][0] = 4;
        cuerpo[0][1] = 4;
        cuerpo[1][0] = 4;
        cuerpo[1][1] = 3;
        cuerpo[2][0] = 4;
        cuerpo[2][1] = 2;
        int comidaF = (int) (Math.random() * 10);
        int comidaC = (int) (Math.random() * 10);
        int dir = 4;
        int juegoActivo = 1;
        while (juegoActivo == 1) {
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    tab[i][j] = ".";
                }
            }
            tab[comidaF][comidaC] = "@";
            for (int i = 0; i < largo; i++) {
                if (i == 0) {
                    tab[cuerpo[i][0]][cuerpo[i][1]] = "O";
                } else {
                    tab[cuerpo[i][0]][cuerpo[i][1]] = "o";
                }
            }
            System.out.println("");
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    System.out.print(tab[i][j] + " ");
                }
                System.out.println("");
            }
            System.out.println("Largo: " + largo + " | @=comida | O=cabeza | o=cuerpo");
            System.out.println("W=arriba S=abajo A=izq D=der Q=salir");
            String tecla = Leer("Movimiento");
            if (tecla == null) {
                tecla = "";
            }
            tecla = tecla.toLowerCase();
            if (tecla.equals("q")) {
                juegoActivo = 0;
            } else {
                if (tecla.equals("w")) {
                    dir = 1;
                } else if (tecla.equals("s")) {
                    dir = 2;
                } else if (tecla.equals("a")) {
                    dir = 3;
                } else if (tecla.equals("d")) {
                    dir = 4;
                }
                int nuevaF = cuerpo[0][0];
                int nuevaC = cuerpo[0][1];
                if (dir == 1) {
                    nuevaF = nuevaF - 1;
                } else if (dir == 2) {
                    nuevaF = nuevaF + 1;
                } else if (dir == 3) {
                    nuevaC = nuevaC - 1;
                } else if (dir == 4) {
                    nuevaC = nuevaC + 1;
                }
                if (nuevaF < 0 || nuevaF > 9 || nuevaC < 0 || nuevaC > 9) {
                    System.out.println("Chocaste con la pared. GAME OVER.");
                    juegoActivo = 0;
                } else {
                    boolean choque = false;
                    for (int i = 0; i < largo; i++) {
                        if (cuerpo[i][0] == nuevaF && cuerpo[i][1] == nuevaC) {
                            choque = true;
                        }
                    }
                    if (choque) {
                        System.out.println("Te mordiste. GAME OVER.");
                        juegoActivo = 0;
                    } else {
                        int crecio = 0;
                        if (nuevaF == comidaF && nuevaC == comidaC) {
                            crecio = 1;
                        }
                        if (crecio == 1) {
                            largo++;
                            for (int i = largo - 1; i >= 1; i--) {
                                cuerpo[i][0] = cuerpo[i - 1][0];
                                cuerpo[i][1] = cuerpo[i - 1][1];
                            }
                            cuerpo[0][0] = nuevaF;
                            cuerpo[0][1] = nuevaC;
                            int cont = 0;
                            do {
                                comidaF = (int) (Math.random() * 10);
                                comidaC = (int) (Math.random() * 10);
                                cont = 0;
                                for (int i = 0; i < largo; i++) {
                                    if (cuerpo[i][0] == comidaF && cuerpo[i][1] == comidaC) {
                                        cont = 1;
                                    }
                                }
                            } while (cont != 0);
                            if (largo == 100) {
                                System.out.println("GANASTE! Llenaste el tablero.");
                                juegoActivo = 0;
                            }
                        } else {
                            for (int i = largo - 1; i >= 1; i--) {
                                cuerpo[i][0] = cuerpo[i - 1][0];
                                cuerpo[i][1] = cuerpo[i - 1][1];
                            }
                            cuerpo[0][0] = nuevaF;
                            cuerpo[0][1] = nuevaC;
                        }
                    }
                }
            }
        }
        System.out.println("Juego terminado. Largo final: " + largo);
    }

    public static void Damas() throws IOException {
        String[][] tab = new String[6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                tab[i][j] = ".";
            }
        }
        for (int i = 4; i <= 5; i++) {
            for (int j = 0; j < 6; j++) {
                if ((i + j) % 2 == 0) {
                    tab[i][j] = "X";
                }
            }
        }
        for (int i = 0; i <= 1; i++) {
            for (int j = 0; j < 6; j++) {
                if ((i + j) % 2 == 0) {
                    tab[i][j] = "O";
                }
            }
        }
        int turno = 1;
        int ganador = 0;
        while (ganador == 0) {
            System.out.println("");
            System.out.print("  ");
            for (int j = 1; j <= 6; j++) {
                System.out.print(j + " ");
            }
            System.out.println("");
            for (int i = 0; i < 6; i++) {
                System.out.print((i + 1) + " ");
                for (int j = 0; j < 6; j++) {
                    System.out.print(tab[i][j] + " ");
                }
                System.out.println("");
            }
            int contX = 0;
            for (int i = 0; i < 6; i++) {
                for (int j = 0; j < 6; j++) {
                    if (tab[i][j].equals("X")) {
                        contX++;
                    }
                }
            }
            if (contX == 0) {
                ganador = 2;
            }
            int contO = 0;
            for (int i = 0; i < 6; i++) {
                for (int j = 0; j < 6; j++) {
                    if (tab[i][j].equals("O")) {
                        contO++;
                    }
                }
            }
            if (contO == 0) {
                ganador = 1;
            }
            if (ganador == 0) {
                if (turno == 1) {
                    System.out.println("Turno: X (jugador)");
                    String sfi = Leer("Fila origen (1-6)");
                    String sci = Leer("Col origen (1-6)");
                    String sff = Leer("Fila destino (1-6)");
                    String scf = Leer("Col destino (1-6)");
                    if (sfi != null && sci != null && sff != null && scf != null &&
                        EsNumeroEntero(sfi) && EsNumeroEntero(sci) && EsNumeroEntero(sff) && EsNumeroEntero(scf)) {
                        int fi = Integer.parseInt(sfi) - 1;
                        int ci = Integer.parseInt(sci) - 1;
                        int ff = Integer.parseInt(sff) - 1;
                        int cf = Integer.parseInt(scf) - 1;
                        boolean movValido = false;
                        if (fi >= 0 && fi < 6 && ci >= 0 && ci < 6 && ff >= 0 && ff < 6 && cf >= 0 && cf < 6) {
                            if (tab[fi][ci].equals("X") && tab[ff][cf].equals(".")) {
                                if (ff == fi - 1 && (cf == ci - 1 || cf == ci + 1)) {
                                    movValido = true;
                                } else if (ff == fi - 2 && (cf == ci - 2 || cf == ci + 2)) {
                                    int medioF = (fi + ff) / 2;
                                    int medioC = (ci + cf) / 2;
                                    if (tab[medioF][medioC].equals("O")) {
                                        movValido = true;
                                        tab[medioF][medioC] = ".";
                                    }
                                }
                            }
                        }
                        if (movValido) {
                            tab[ff][cf] = "X";
                            tab[fi][ci] = ".";
                            turno = 2;
                        } else {
                            System.out.println("Movimiento invalido.");
                        }
                    } else {
                        System.out.println("Entrada invalida.");
                    }
                } else {
                    System.out.println("Turno: O (CPU)...");
                    boolean movValido = false;
                    for (int i = 0; i < 6; i++) {
                        for (int j = 0; j < 6; j++) {
                            if (!movValido && tab[i][j].equals("O")) {
                                if (i + 2 < 6 && j + 2 < 6 && tab[i + 1][j + 1].equals("X") && tab[i + 2][j + 2].equals(".")) {
                                    tab[i + 2][j + 2] = "O";
                                    tab[i + 1][j + 1] = ".";
                                    tab[i][j] = ".";
                                    movValido = true;
                                } else if (i + 2 < 6 && j - 2 >= 0 && tab[i + 1][j - 1].equals("X") && tab[i + 2][j - 2].equals(".")) {
                                    tab[i + 2][j - 2] = "O";
                                    tab[i + 1][j - 1] = ".";
                                    tab[i][j] = ".";
                                    movValido = true;
                                }
                            }
                        }
                    }
                    if (!movValido) {
                        for (int i = 0; i < 6; i++) {
                            for (int j = 0; j < 6; j++) {
                                if (!movValido && tab[i][j].equals("O")) {
                                    if (i + 1 < 6 && j + 1 < 6 && tab[i + 1][j + 1].equals(".")) {
                                        tab[i + 1][j + 1] = "O";
                                        tab[i][j] = ".";
                                        movValido = true;
                                    } else if (i + 1 < 6 && j - 1 >= 0 && tab[i + 1][j - 1].equals(".")) {
                                        tab[i + 1][j - 1] = "O";
                                        tab[i][j] = ".";
                                        movValido = true;
                                    }
                                }
                            }
                        }
                    }
                    if (movValido) {
                        turno = 1;
                    } else {
                        ganador = 1;
                    }
                }
            }
        }
        if (ganador == 1) {
            System.out.println("GANASTE (X)!");
        } else {
            System.out.println("Gano la CPU (O).");
        }
    }

    public static void Memoria() throws IOException {
        String[][] original = new String[5][5];
        String[][] visible = new String[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                original[i][j] = ".";
                visible[i][j] = ".";
            }
        }
        String letrasABC = "ABCDE";
        int k = 0;
        while (k < 5) {
            int fila = (int) (Math.random() * 5);
            int col = (int) (Math.random() * 5);
            if (original[fila][col].equals(".")) {
                original[fila][col] = String.valueOf(letrasABC.charAt(k));
                k++;
            }
        }
        System.out.println("");
        System.out.println("Memoriza las posiciones de A, B, C, D, E:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(original[i][j] + " ");
            }
            System.out.println("");
        }
        Dialogo("Presiona ENTER cuando hayas memorizado...");
        int aciertos = 0;
        int intentos = 0;
        while (aciertos < 5 && intentos < 10) {
            System.out.println("");
            System.out.println("Intento " + (intentos + 1) + "/10 - Aciertos: " + aciertos + "/5");
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    System.out.print(visible[i][j] + " ");
                }
                System.out.println("");
            }
            String letraBuscada = Leer("Que letra (A-E)");
            if (letraBuscada != null) {
                letraBuscada = letraBuscada.toUpperCase();
            } else {
                letraBuscada = "";
            }
            String sf = Leer("Fila (1-5)");
            String sc = Leer("Col (1-5)");
            if (sf != null && sc != null && EsNumeroEntero(sf) && EsNumeroEntero(sc)) {
                int fila = Integer.parseInt(sf);
                int col = Integer.parseInt(sc);
                if (fila >= 1 && fila <= 5 && col >= 1 && col <= 5) {
                    if (!visible[fila - 1][col - 1].equals(".")) {
                        System.out.println("Esa posicion ya fue descubierta.");
                    } else {
                        intentos++;
                        if (original[fila - 1][col - 1].equals(letraBuscada)) {
                            System.out.println("CORRECTO!");
                            visible[fila - 1][col - 1] = letraBuscada;
                            aciertos++;
                        } else {
                            System.out.println("FALLASTE. En esa posicion habia '" + original[fila - 1][col - 1] + "'.");
                        }
                    }
                } else {
                    System.out.println("Posicion invalida.");
                }
            } else {
                System.out.println("Entrada invalida.");
            }
        }
        if (aciertos == 5) {
            System.out.println("GANASTE! Encontraste las 5 letras.");
        } else {
            System.out.println("GAME OVER. Solo acertaste " + aciertos + " de 5.");
        }
    }

    public static void Laberinto() throws IOException {
        int[][] lab = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                lab[i][j] = 0;
            }
        }
        for (int j = 0; j < 8; j++) {
            lab[2][j] = 1;
        }
        for (int j = 2; j < 10; j++) {
            lab[5][j] = 1;
        }
        for (int i = 0; i < 6; i++) {
            lab[i][7] = 1;
        }
        for (int i = 3; i < 10; i++) {
            lab[i][2] = 1;
        }
        lab[0][0] = 0;
        lab[9][9] = 0;
        int fila = 0;
        int col = 0;
        int salidaF = 9;
        int salidaC = 9;
        int pasos = 0;
        int juegoActivo = 1;
        while (juegoActivo == 1) {
            System.out.println("");
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    if (i == fila && j == col) {
                        System.out.print("@ ");
                    } else if (i == salidaF && j == salidaC) {
                        System.out.print("S ");
                    } else if (lab[i][j] == 1) {
                        System.out.print("# ");
                    } else {
                        System.out.print(". ");
                    }
                }
                System.out.println("");
            }
            System.out.println("Pasos: " + pasos + " | @=tu | S=salida | #=pared");
            System.out.println("W=arriba S=abajo A=izq D=der Q=salir");
            String tecla = Leer("Movimiento");
            if (tecla == null) {
                tecla = "";
            }
            tecla = tecla.toLowerCase();
            if (tecla.equals("q")) {
                juegoActivo = 0;
            } else if (tecla.equals("w")) {
                if (fila > 0 && lab[fila - 1][col] != 1) {
                    fila--;
                    pasos++;
                } else {
                    System.out.println("Movimiento bloqueado.");
                }
            } else if (tecla.equals("s")) {
                if (fila < 9 && lab[fila + 1][col] != 1) {
                    fila++;
                    pasos++;
                } else {
                    System.out.println("Movimiento bloqueado.");
                }
            } else if (tecla.equals("a")) {
                if (col > 0 && lab[fila][col - 1] != 1) {
                    col--;
                    pasos++;
                } else {
                    System.out.println("Movimiento bloqueado.");
                }
            } else if (tecla.equals("d")) {
                if (col < 9 && lab[fila][col + 1] != 1) {
                    col++;
                    pasos++;
                } else {
                    System.out.println("Movimiento bloqueado.");
                }
            } else {
                System.out.println("Movimiento bloqueado.");
            }
            if (fila == salidaF && col == salidaC) {
                System.out.println("FELICIDADES! Llegaste a la salida en " + pasos + " pasos.");
                juegoActivo = 0;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        String[] menuPrincipal = {
            "1. Tres en Raya (Tic-Tac-Toe) 3x3",
            "2. Buscaminas simplificado 8x8",
            "3. Serpiente (Snake) 10x10",
            "4. Damas simplificado 6x6",
            "5. Memoria (Adivina la posicion) 5x5",
            "6. Laberinto 10x10",
            "0. Salir"
        };
        boolean ejecutar = true;
        while (ejecutar) {
            String opcionStr = DesplegarMenu("==========================================\n 6 JUEGOS CON MATRICES EN CONSOLA \n==========================================", menuPrincipal);
            if (opcionStr != null && EsNumeroEntero(opcionStr)) {
                int op = Integer.parseInt(opcionStr);
                switch (op) {
                    case 1:
                        TresEnRaya();
                        break;
                    case 2:
                        Buscaminas();
                        break;
                    case 3:
                        Serpiente();
                        break;
                    case 4:
                        Damas();
                        break;
                    case 5:
                        Memoria();
                        break;
                    case 6:
                        Laberinto();
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
