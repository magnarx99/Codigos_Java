import java.util.Scanner;

public class ejercicio14 {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            System.out.println("Ingrese un numero entero");
            int nota = teclado.nextInt();

            if (nota >= 90) {
                System.out.println("Excelente");
            }   else if (nota >= 80) {
                System.out.println("Muy bien");
            }   else if (nota <= 60) {
                System.out.println("Insuficiente"); }
                else {
                System.out.println("Regular");
            }
        }
    }
}