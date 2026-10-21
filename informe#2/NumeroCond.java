import java.util.Scanner;

public class NumeroCond {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);

        System.out.println("Ponga su primer numero");
        int numero1 = teclado.nextInt();
        System.out.println("Ponga su segundo numero");
        int numero2 = teclado.nextInt();

        if (numero1 > numero2) {
            System.out.println("El numero 1 es mayor");
        }
        
        else if (numero1 == numero2) {
            System.out.println("Son iguales");
        } else {
            System.out.println("El numero 2 es mayor");
        }

        teclado.close();


    }
}
