public class OperacionesMatriz {
    public static void main(String[] args) {
        // Declaración de la matriz bidimensional de 5 filas y 4 columnas
        int[][] numeros = new int[5][4];
        
        // Declaración e inicialización de las variables acumuladoras y de resultado
        int suma = 0;
        int resta = 0;
        double multiplicacion = 1.0; // Inicializada en 1 y tipo double para soportar números masivos
        double division;
        double raiz;
        
        // 1. Ciclos anidados para la inserción y almacenamiento de datos aleatorios
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                // Genera números aleatorios entre 1 y 100 (evitamos el 0 para no anular la multiplicación)
                numeros[i][j] = (int) (Math.random() * 100) + 1;
            }
        }
        
        System.out.println("=== MATRIZ GENERADA ===");
        // 2. Ciclos anidados para la lectura, impresión y acumulación de operaciones
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(numeros[i][j] + "\t");
                
                // Acumulación consecutiva de los valores de la matriz
                suma = suma + numeros[i][j];
                resta = resta - numeros[i][j];
                multiplicacion = multiplicacion * numeros[i][j];
            }
            System.out.println(); // Salto de línea por fila
        }
        
        // 3. Procesamiento de las operaciones matemáticas finales (fuera de los ciclos)
        raiz = Math.sqrt(suma); // Método nativo para calcular la raíz cuadrada
        
        // Validación para evitar un error de división por cero en caso de que la suma sea 0
        if (suma != 0) {
            division = multiplicacion / suma;
        } else {
            division = 0;
        }
        
        // 4. Impresión de los resultados finales en pantalla
        System.out.println("\n=== RESULTADOS DE LAS OPERACIONES ===");
        System.out.println("1. La suma de todos los valores es: " + suma);
        System.out.println("2. La resta de todos los valores es: " + resta);
        System.out.printf("3. La multiplicación de todos los valores es: %.2e\n", multiplicacion); // Notación científica por el tamaño
        System.out.printf("4. La raíz cuadrada de la suma es: %.4f\n", raiz);
        System.out.printf("5. La división (multiplicación / suma) es: %.2e\n", division);
    }
}
