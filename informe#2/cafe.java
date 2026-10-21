import java.util.Scanner;

public class cafe {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("¿Quieres un cafe?: ");
        String respuesta = teclado.nextLine();
        String NO = "NO";
        String SI = "SI";

        if (respuesta.equalsIgnoreCase(SI)) {
            System.out.println("¿Vas a comprarlo?: ");
            String respuesta2 = teclado.nextLine();
            if (respuesta2.equalsIgnoreCase(SI)) {
                System.out.println("*" + "¡Que disfrutes tu cafe!");
            } else {
                System.out.println("¡Que tengas un buen dia!");
            }
        } else if (respuesta.equalsIgnoreCase(NO)) {
            System.out.println("¡seguir estudiando!");
        } else {
            System.out.println("Respuesta no válida. ");
        }
        teclado.close();



    }
}