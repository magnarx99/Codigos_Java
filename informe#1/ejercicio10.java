public class ejercicio10 {
    public static void main(String[] args) {
        long bytes = 5_000_000L;
        double kb = bytes / 1000.0;
        double kib = bytes / 1024.0;
        System.out.println("Bytes: " + bytes);
        System.out.println("KB (decimal): " + kb);
        System.out.println("KiB (binario): " + kib);        
    }
}
