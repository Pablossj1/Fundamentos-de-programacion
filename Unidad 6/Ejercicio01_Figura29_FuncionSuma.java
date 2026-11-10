package a2261330036_estudiodecaso;

/**
 * Ejercicio 01 - Figura 29: Estructura de una funcion
 * Descripcion: Demuestra la declaracion y llamado de una funcion que recibe
 * dos parametros enteros y retorna la suma de ambos.
 */
public class Ejercicio01_Figura29_FuncionSuma {

    // Codigo en Java de la Figura 29
    public static int sumar(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println("=== Ejercicio 01: Figura 29 - Estructura de una funcion ===");
        int num1 = 15;
        int num2 = 25;
        int resultado = sumar(num1, num2);
        System.out.println("La suma de " + num1 + " + " + num2 + " es: " + resultado);
    }
}
