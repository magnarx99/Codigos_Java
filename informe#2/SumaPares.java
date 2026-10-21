import java.util.Scanner;

public class SumaPares {
    public static void main(String[] args) {
        // Crear el objeto scanner para leer los datos de la consola
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar el número "n" (cantidad de iteraciones)
        System.out.print("Ingrese la cantidad de números a evaluar (n): ");
        int n = scanner.nextInt();
        
        // Variable acumuladora para almacenar la suma de los números pares
        int acumuladorPares = 0;
        
        // Ciclo que se ejecuta "n" veces
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese un número: ");
            int numero = scanner.nextInt();
            
            // Verificar si el número ingresado es par usando el operador módulo (%)
            if (numero % 2 == 0) {
                acumuladorPares += numero; // Sumar al acumulador si es par
            }
        }
        
        // Mostrar el resultado total
        System.out.println("Total de la suma de los pares: " + acumuladorPares);
        
        // Cerrar el scanner
        scanner.close();
    }
}
