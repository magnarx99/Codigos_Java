public class ejercicio15 {
    public static void main(String[] args) {
        int totalMiB = 512;
        int usadoMiB = 273;
        int libreMiB = totalMiB - usadoMiB;
        double porcentajeUsado = (usadoMiB * 100.0) / totalMiB;
        System.out.println("=== Memoria ===");
        System.out.println("Total: " + totalMiB + " MiB");
        System.out.printf("Usado: %d MiB (%.2f%%)%n", usadoMiB, porcentajeUsado);
        System.out.println("Libre: " + libreMiB + " MiB");
        int ancho = 20;
        int usados = (int) Math.round((porcentajeUsado / 100.0) * ancho);
        int libres = ancho - usados;
        String barra = "[" + "#".repeat(usados) + ".".repeat(libres) + "]";
        System.out.println(barra);
    }
}
