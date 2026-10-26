import java.util.Scanner;

public class NumerosPares {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer datos desde el teclado
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Ingrese un número entero límite (n): ");
        int n = teclado.nextInt();
        
        System.out.println("Los números pares entre 0 y " + n + " de forma ascendente son:");
        
        // Ciclo for que inicia en 0 e incrementa de dos en dos hasta llegar a 'n'
        for (int i = 0; i <= n; i += 2) {
            System.out.print(i + " ");
        }
        
        // Cerrar el recurso scanner
        teclado.close();
    }
}
