import java.util.Scanner;

        public class tienda {
            public static void main(String[] args) {
                Scanner scanner = new Scanner (System.in);

            System.out.println("Ingrese el nombre");
            String nombre = scanner.nextLine();
            System.out.println("nombre del producto");
            String producto = scanner.nextLine();
            System.out.println("Ingrese el precio");
            int precio = scanner.nextInt();
            System.out.println("cantidad del producto");
            int cantidad = scanner.nextInt();
            System.out.println("Ingrese el descuento");
            int descuento = scanner.nextInt();
            int transporte = 8000;

            
            //CALCULAR
            
            System.out.println("Su nombre es: " + nombre);
            System.out.println("El producto es: " + producto);
            double sub_total = (precio * cantidad);
            System.out.println("El subtotal es: " + sub_total);
            double Descuento = sub_total * descuento / 100.0;
            System.out.println("Su descuento es: " + Descuento);
            double Total = sub_total - Descuento + transporte;
            double promedio = Total / cantidad;
            System.out.println("el promedio de su compra es: " + promedio);
            System.out.println("costo transporte es: " + transporte);
            System.out.println("El total de compra es: " + Total);



            scanner.close();
            }
        }
