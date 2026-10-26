import java.util.Scanner;

public class ConversionNombresNumeros {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        // Vector para almacenar los 5 nombres ingresados por el usuario
        String[] nombres = new String[5];
        
        // Vectores de equivalencia según la tabla de la guía didáctica
        char[] caracteres = {
            'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L',
            'M', 'N', 'Ñ', ' ', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'
        };
        
        int[] numeros = {
            1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12,
            13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27
        };
        
        int x = 0; // Variable de control para el ciclo while
        
        System.out.println("=== INGRESO DE NOMBRES ===");
        // Ciclo while para solicitar los 5 nombres por teclado
        while (x < 5) {
            System.out.print("Ingrese el nombre " + (x + 1) + " (en MAYÚSCULAS): ");
            nombres[x] = teclado.nextLine();
            x++;
        }
        
        System.out.println("\n=== NOMBRES CONVERTIDOS A NÚMEROS ===");
        x = 0; // Reiniciamos el controlador para recorrer el vector y procesarlo
        String nombreAuxiliar = "";
        
        // Ciclo while principal que recorre las 5 posiciones del vector nombres
        while (x < 5) {
            // Ciclo for 1: Recorre los caracteres del nombre actual uno a uno
            for (int j = 0; j < nombres[x].length(); j++) {
                
                // Ciclo for 2: Busca el carácter actual en el abecedario de referencia
                for (int k = 0; k < caracteres.length; k++) {
                    
                    // Condicional que compara la letra del nombre con el vector de caracteres
                    if (nombres[x].charAt(j) == caracteres[k]) {
                        // Concatenación: junta los valores en formato texto en lugar de sumarlos
                        nombreAuxiliar = nombreAuxiliar + numeros[k];
                        break; // Rompe el ciclo interno al encontrar la coincidencia
                    }
                }
            }
            
            // Reemplaza el nombre original por la cadena numérica generada
            nombres[x] = nombreAuxiliar;
            System.out.println("Resultado " + (x + 1) + ": " + nombres[x]);
            
            // Reinicio de variables para la siguiente iteración
            nombreAuxiliar = "";
            x++;
        }
        
        teclado.close();
    }
}
