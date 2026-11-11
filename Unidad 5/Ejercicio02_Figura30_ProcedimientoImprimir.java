package a2261330036_estudiodecaso;

/**
 * Ejercicio 02 - Figura 30: Estructura de un procedimiento
 * Descripcion: Demuestra un procedimiento de tipo void que realiza una accion
 * (imprimir un texto en consola) sin devolver ningun valor.
 */
public class Ejercicio02_Figura30_ProcedimientoImprimir {

    // Codigo en Java de la Figura 30
    public static void ImprimirNombre(String parametro) {
        System.out.println(parametro);
    }

    public static void main(String[] args) {
        System.out.println("=== Ejercicio 02: Figura 30 - Estructura de un procedimiento ===");
        ImprimirNombre("Hola mundo desde un procedimiento modularizado en Java.");
        ImprimirNombre("Este metodo ejecuta una accion y no retorna valor.");
    }
}
