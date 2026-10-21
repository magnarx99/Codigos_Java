import java.util.Scanner;

public class EjercicioEcanner {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("ponga su primer nombre");
        String name = teclado.nextLine();
        System.out.println("ponga su apellido");
        String lastName = teclado.nextLine();
        System.out.println("Su nombre es: " + name + " " + lastName);

        teclado.close();
    }
}
