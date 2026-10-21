import java.util.Scanner;

public class CicloParesDinamico {
    public static void main(String[] args) {
        // Creamos la variable Scanner para leer la entrada del usuario
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce el número límite para el ciclo: ");
        int limite = teclado.nextInt(); // Guarda el valor ingresado por el usuario

        int contador = 0; // Desde donde empezará a contar los números pares

        // El ciclo ahora se ejecuta hasta el valor de la variable 'limite'
        for (int i = 0; i <= limite; i += 2) {
            System.out.print(i + " ");
            contador++;

            // Cambia de renglón cada 10 valores impresos
            if (contador % 10 == 0) {
                System.out.println();
            }
        }

        // buena practica :)
        teclado.close();
    }
}


   

