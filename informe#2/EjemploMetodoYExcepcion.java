import java.util.Scanner;

public class EjemploMetodoYExcepcion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese un número entero (o escriba texto para forzar el error): ");
        String entrada = sc.nextLine();
        
        // 1. Aplicación de la Excepción: NumberFormatException (Manejo de formato numérico)
        try {
            // Intenta convertir la cadena en un entero usando el método parse extraído del documento
            int numero = Integer.parseInt(entrada); 
            System.out.println("Éxito: El número entero ingresado es: " + numero);
        } catch (NumberFormatException e) {
            // Se ejecuta estrictamente si el texto no se puede convertir a número
            System.out.println("Excepción capturada: Error de formato numérico (Debe ingresar un número válido).");
        }
        
        System.out.println(); // Línea en blanco para separar el output
        
        // 2. Aplicación del Método de String: toUpperCase() (Convertir a mayúsculas)
        String textoMayusculas = entrada.toUpperCase();
        System.out.println("Texto transformado a mayúsculas: " + textoMayusculas);
        
        sc.close();
    }
}
