import java.util.Scanner;

public class velocidad {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese la velocidad del vehiculo");
        int velocidad = teclado.nextInt();


        if (velocidad < 0) {
            System.out.println("velocidad no valida");
        } 
            else
                if (velocidad >= 0 && velocidad <=30) {
            System.out.println("vias escolares");
        }
                else 
                    if (velocidad >= 31 && velocidad <= 60) {
                System.out.println("vias urbana");
            }
                    else     
                        if (velocidad >= 61 && velocidad <= 80) {
                    System.out.println("vias rurales");
                }
                        else 
                            if (velocidad > 100 && velocidad <= 200) {
                        System.out.println("vias autopista");
                    }
                            else 
                                if ( velocidad > 200) {
                            System.out.println("Exceso de velocidad");
                            }
        else {
            System.out.println("velocidad no valida");
        }
        teclado.close();

        
    }
}
