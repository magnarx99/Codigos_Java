public class MatrizAleatoria {
    public static void main(String[] args) {
        // Declaración de la matriz bidimensional: 5 filas y 4 columnas
        int[][] numeros = new int[5][4];
        
        // 1. Ciclos anidados para la inserción y almacenamiento de datos aleatorios
        for (int i = 0; i < 5; i++) { // Ciclo externo controla las filas (0 a 4)
            for (int j = 0; j < 4; j++) { // Ciclo interno controla las columnas (0 a 3)
                // Genera números aleatorios entre 0 y 100
                numeros[i][j] = (int) (Math.random() * 101);
            }
        }
        
        System.out.println("=== MATRIZ GENERADA EN FORMA DE TABLA ===");
        
        // 2. Ciclos anidados para la lectura e impresión con formato de tabla
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                // Imprime el valor actual seguido de una tabulación para alinear columnas
                System.out.print(numeros[i][j] + "\t");
            }
            // Instrucción de impresión vacía para hacer el salto de línea al terminar cada fila
            System.out.println();
        }
    }
}
