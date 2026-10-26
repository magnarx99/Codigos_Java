import java.util.Scanner;

public class MenuProductos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        // Bandera booleana para controlar la continuidad del ciclo while
        boolean ejecutarPrograma = true;
        
        while (ejecutarPrograma) {
            // 1. Visualización del menú principal de productos
            System.out.println("\n=== MENÚ DE PRODUCTOS ===");
            System.out.println("1. Café Molido (500g)");
            System.out.println("2. Chocolate en Barra");
            System.out.println("3. Azúcar Morena (1kg)");
            System.out.println("4. Leche Entera (1L)");
            System.out.println("5. Galletas Integrales");
            System.out.println("6. Salir del programa");
            System.out.print("Seleccione una opción (1-6): ");
            
            int opcion = teclado.nextInt();
            
            // 2. Procesamiento de la opción seleccionada
            switch (opcion) {
                case 1:
                    System.out.println("\n[INFO] Café Molido - Precio: $15,500 COP. Origen: Antioquia.");
                    break;
                case 2:
                    System.out.println("\n[INFO] Chocolate en Barra - Precio: $4,200 COP. 70% Cacao.");
                    break;
                case 3:
                    System.out.println("\n[INFO] Azúcar Morena - Precio: $3,800 COP. 100% Orgánica.");
                    break;
                case 4:
                    System.out.println("\n[INFO] Leche Entera - Precio: $4,500 COP. Pasteurizada.");
                    break;
                case 5:
                    System.out.println("\n[INFO] Galletas Integrales - Precio: $2,900 COP. Altas en fibra.");
                    break;
                case 6:
                    System.out.println("\nSaliendo del sistema de productos...");
                    ejecutarPrograma = false; // Rompe el ciclo while principal directamente
                    continue; // Salta el resto del código y evalúa la condición del while
                default:
                    System.out.println("\n[ERROR] Opción no válida. Intente de nuevo.");
                    continue; // Regresa al inicio del menú inmediatamente
            }
            
            // 3. Submenú interactivo para decidir si volver al menú o salir
            System.out.println("\n-------------------------------------");
            System.out.println("¿Desea realizar otra operación?");
            System.out.println("1. Volver al menú de productos");
            System.out.println("2. Salir");
            System.out.print("Seleccione (1-2): ");
            int respuestaSubmenu = teclado.nextInt();
            
            if (respuestaSubmenu == 2) {
                System.out.println("\nGracias por usar nuestro sistema. ¡Hasta luego!");
                ejecutarPrograma = false; // Cambia el estado a falso para detener el bucle
            }
        }
        
        teclado.close();
    }
}
