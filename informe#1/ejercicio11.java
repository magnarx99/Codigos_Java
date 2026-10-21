public class ejercicio11 {
    public static void main(String[] args) {
        int flags = 0;
        flags = flags | 4; // bit 2
        flags = flags | 1; // bit 0
        System.out.println("flags (dec) = " + flags);
        System.out.println("flags (bin) = " + Integer.toBinaryString(flags));
    }
}
