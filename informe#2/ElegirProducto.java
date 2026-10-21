import java.util.Scanner;

public class ElegirProducto {
    public static void main (String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese el producto que desea comprar");
        String producto = teclado.nextLine();
        
        switch (producto.toLowerCase()) {
            case "arroz":
                System.out.println("Ha elegido el Producto 1");
                break;
            case "frijoles":
                System.out.println("Ha elegido el Producto 2");
                break;
            case "lentejas":
                System.out.println("Ha elegido el Producto 3");
                break;
            case "aceite":
                System.out.println("Ha elegido el Producto 4");
                break;
            case "azucar":
                System.out.println("Ha elegido el Producto 5");
                break;
            default:
                System.out.println("Producto no válido");
                break;
        }
        teclado.close();
    }
}
