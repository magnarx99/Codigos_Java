import java.util.Scanner;

public class PromedioEstudianteVectores {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        // Declaración de los dos vectores para almacenar 5 elementos cada uno
        double[] notas = new double[5];
        int[] porcentajes = new int[5];
        
        int sumaPorcentajes = 0;
        double promedioFinal = 0;
        
        System.out.println("=== CONFIGURACIÓN DE PORCENTAJES ===");
        // Primer ciclo para solicitar y almacenar los porcentajes en el vector
        for (int i = 0; i < porcentajes.length; i++) {
            System.out.print("Ingrese el porcentaje para la nota " + (i + 1) + " (%): ");
            porcentajes[i] = teclado.nextInt();
            sumaPorcentajes += porcentajes[i]; // Acumulador para validar el total
        }
        
        // Validación técnica: Si no suma el 100%, el programa advierte y se detiene
        if (sumaPorcentajes != 100) {
            System.out.println("\n[ERROR] La suma de los porcentajes debe ser exactamente 100%. "
                    + "Ingresaste un total de: " + sumaPorcentajes + "%. Ejecute de nuevo.");
            teclado.close();
            return; // Finaliza la ejecución del programa
        }
        
        System.out.println("\n=== INGRESO DE NOTAS DEL ESTUDIANTE ===");
        // Segundo ciclo para solicitar las notas y guardarlas en el vector de notas
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Ingrese la nota " + (i + 1) + " (Equivale al " + porcentajes[i] + "%): ");
            notas[i] = teclado.nextDouble();
        }
        
        // Tercer ciclo para realizar la operación aritmética utilizando ambos vectores
        for (int i = 0; i < notas.length; i++) {
            // Fórmula: Promedio = (Nota * (Porcentaje / 100)) + Promedio acumulado
            promedioFinal += (notas[i] * porcentajes[i]) / 100.0;
        }
        
        // 4. Impresión de resultados en pantalla
        System.out.println("\n=== RESULTADO FINAL ===");
        System.out.printf("El promedio ponderado final del estudiante es: %.2f\n", promedioFinal);
        
        // Validar si el estudiante aprueba (mínimo 3.0 en la escala estándar de Colombia)
        if (promedioFinal >= 3.0) {
            System.out.println("Estado: ¡APROBADO!");
        } else {
            System.out.println("Estado: REPROBADO");
        }
        
        teclado.close();
    }
}
