import java.util.Scanner;

public class ejercicio7 {    
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            System.out.println("Ingrese un numero entero");
            int a = teclado.nextInt();
            System.out.println("Ingrese otro numero entero");
            int b = teclado.nextInt();

            System.out.println("a > b = " + (a > b));
            System.out.println("a==b =" + (a==b));
            System.out.println("a%b==0: " + (a % b == 0));
            System.out.println("a>b && b>0: " + (a > b && b > 0));
        
        
            if (a > b) {
                System.out.println("a es mayor que b");
            } else if (a == b) {
                System.out.println("a es igual a b");
            } else {
                System.out.println("a es menor que b");
            }
        }
        
        
        
    }
}
