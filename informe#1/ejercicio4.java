public class ejercicio4 {
    public static void main(String[] args) {
        byte b = 127;
        System.out.println("b = " + b);
        b++;
        System.out.println("b + 1 = " + b); // Overflow pasa de 127 a -128
    }
    
}
