import java.util.Scanner;

public class productos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        // Mostrar el menú de productos del supermercado
        System.out.println("--- SUPERMERCADO AL COSTO COLOMBIA ---");
        System.out.println("1. Arroz Blanco (1 kg)");
        System.out.println("2. Leche Entera (Bolsa 1 L)");
        System.out.println("3. Aceite Vegetal (Botella 1 L)");
        System.out.println("4. Huevos AA (Cubeta x30)");
        System.out.println("5. Café Molido (Paquete 500g)");
        System.out.print("Por favor, seleccione el producto que desea consultar (1-5): ");
        
        int opcion = teclado.nextInt();
        System.out.println(); // Línea en blanco para ordenar la salida

        // Estructura Switch Case para evaluar el producto elegido
        switch (opcion) {
            case 1:
                System.out.println("Producto seleccionado: Arroz Blanco (1 kg)");
                System.out.println("El valor del producto es: $4.200 COP");
                break;
            case 2:
                System.out.println("Producto seleccionado: Leche Entera (Bolsa 1 L)");
                System.out.println("El valor del producto es: $3.900 COP");
                break;
            case 3:
                System.out.println("Producto seleccionado: Aceite Vegetal (Botella 1 L)");
                System.out.println("El valor del producto es: $12.500 COP");
                break;
            case 4:
                System.out.println("Producto seleccionado: Huevos AA (Cubeta x30)");
                System.out.println("El valor del producto es: $16.800 COP");
                break;
            case 5:
                System.out.println("Producto seleccionado: Café Molido (Paquete 500g)");
                System.out.println("El valor del producto es: $14.500 COP");
                break;
            default:
                System.out.println("Opción no válida. Intente de nuevo con un número del 1 al 5.");
                break;
        }

        teclado.close();
    }
}
