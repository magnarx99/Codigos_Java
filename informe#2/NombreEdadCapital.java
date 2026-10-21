import java.util.Scanner;

public class NombreEdadCapital {
    public static void main(String [] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        String nombre = teclado.nextLine();
        System.out.print("Ingrese su edad: ");
        int edad = teclado.nextInt();
        System.out.print("Ingrese su capital: ");
        double capital = teclado.nextDouble();

        //calcular

        if ((edad >= 18) && (capital >= 1000000)) {
                System.out.println("Usted es mayor de edad y tiene un capital mayor a 1 millón.");
            }
        else {
            System.out.println("Usted no cumple uno de los requisitos.");
        }

        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);    
        System.out.println("Capital: " + capital);

        teclado.close();

    }
}
