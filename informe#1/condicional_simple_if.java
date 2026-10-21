import java.util.Scanner;
public class condicional_simple_if {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese el primer número: ");
            int a = scanner.nextInt();
            System.out.print("Ingrese el segundo número: ");
            int b = scanner.nextInt();
            if (a > b) {
                System.out.println("El primer numero es mayor que el segundo número.");
            }

            if (a < b) {
                System.out.println("El segundo numero es mayor que el primer numero.");
            }
        }
    }
}