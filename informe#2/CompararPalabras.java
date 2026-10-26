import java.util.Scanner;

public class CompararPalabras {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        // Solicitar la primera palabra al usuario
        System.out.print("Ingrese la primera palabra: ");
        String palabra1 = teclado.nextLine();
        
        // Solicitar la segunda palabra al usuario
        System.out.print("Ingrese la segunda palabra: ");
        String palabra2 = teclado.nextLine();
        
        System.out.println("\n--- RESULTADOS DE LA COMPARACIÓN ---");
        
        // 1. Comparación estricta usando equals() (Distingue mayúsculas y minúsculas)
        if (palabra1.equals(palabra2)) {
            System.out.println("Usando equals(): Las palabras son EXACTAMENTE iguales.");
        } else {
            System.out.println("Usando equals(): Las palabras NO son exactamente iguales (revisa las mayúsculas).");
        }
        
        // 2. Comparación flexible usando equalsIgnoreCase() (Ignora mayúsculas y minúsculas)
        if (palabra1.equalsIgnoreCase(palabra2)) {
            System.out.println("Usando equalsIgnoreCase(): Las palabras son iguales (ignorando mayúsculas/minúsculas).");
        } else {
            System.out.println("Usando equalsIgnoreCase(): Las palabras son COMPLETAMENTE diferentes.");
        }
        
        teclado.close();
    }
}

