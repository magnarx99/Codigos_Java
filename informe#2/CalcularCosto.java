import java.util.Scanner;

public class CalcularCosto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Lectura de datos de entrada
        System.out.print("Ingrese el día de la semana: ");
        String dia = scanner.nextLine().toLowerCase().trim();

        System.out.print("Ingrese el tipo de producto (fruver/carnes/vinos): ");
        String producto = scanner.nextLine().toLowerCase().trim();

        System.out.print("Ingrese el valor del producto: ");
        double valorProducto = scanner.nextDouble();

        // 2. Lógica para determinar el porcentaje de descuento
        int descuento = 0;

        if (dia.equals("lunes")) {
            if (producto.equals("fruver")) {
                descuento = 30;
            }
        } else if (dia.equals("martes")) {
            if (producto.equals("carnes")) {
                descuento = 30;
            }
        } else if (dia.equals("jueves")) {
            if (producto.equals("vinos")) {
                descuento = 30;
            }
        } else if (dia.equals("miércoles") || dia.equals("miercoles")) {
            if (producto.equals("carnes")) {
                descuento = 15;
            } else if (producto.equals("fruver")) {
                descuento = 10;
            } else if (producto.equals("vinos")) {
                descuento = 5;
            }
        } else if (dia.equals("viernes")) {
            if (producto.equals("vinos")) {
                descuento = 15;
            } else if (producto.equals("fruver")) {
                descuento = 10;
            } else if (producto.equals("carnes")) {
                descuento = 5;
            }
        }

        // 3. Cálculos del costo final
        double valorDescuento = valorProducto * (descuento / 100.0);
        double costoTotal = valorProducto - valorDescuento;

        // 4. Impresión de resultados según el formato solicitado
        System.out.println("Salida =");
        System.out.println("\"Descuento: " + descuento + "%\"");
        
        // Si el costo total es un número entero, se puede mostrar sin decimales
        if (costoTotal % 1 == 0) {
            System.out.println("Costo Total: " + (int)costoTotal + "\"");
        } else {
            System.out.println("Costo Total: " + costoTotal + "\"");
        }

        scanner.close();
    }
}

