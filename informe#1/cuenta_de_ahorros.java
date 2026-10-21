import java.util.Scanner;

public class cuenta_de_ahorros {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Ingrese su nombre: ");
            String nombre = scanner.nextLine();
            System.out.println("Ingrese su edad:");
            int edad = scanner.nextInt();
            System.out.println("Ingrese su saldo inicial: ");
            double saldo = scanner.nextDouble();

            if (saldo >= 1000000 && edad >= 18) {
                System.out.println("Felicidades, " + nombre + "! Has sido aprobado para abrir una cuenta de ahorros.");
            } 
            if (saldo < 1000000 && edad >= 18) {
                System.out.println("Lo siento, " + nombre + ". No cumples con los requisitos para abrir una cuenta de ahorros.");
            }
            if (saldo < 1000000 && edad < 18) {
                System.out.println("No cumples con ningun requisito");
            }


        }
    }
}
