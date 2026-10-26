import java.util.Scanner;

public class NumerosParesRenglon {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer datos desde el teclado
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Ingrese un número entero límite (n): ");
        int n = teclado.nextInt();
        
        System.out.println("Los números pares entre 0 y " + n + " son:");
        
        // Variable contadora declarada fuera del ciclo para registrar las impresiones
        int contador = 0;
        
        // Ciclo for que inicia en 0 e incrementa de dos en dos hasta 'n'
        for (int i = 0; i <= n; i += 2) {
            System.out.print(i + "\t"); // Usamos \t (tabulación) para alinear las columnas
            contador++;
            
            // Si ya se imprimieron 10 números, hacemos un salto de línea
            if (contador % 10 == 0) {
                System.out.println();
            }
        }
        
        // Cerrar el recurso scanner
        teclado.close();
    }
}

