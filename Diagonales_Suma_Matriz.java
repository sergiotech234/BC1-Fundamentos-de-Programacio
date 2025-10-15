public class Diagonales_Suma_Matriz {
    public static void main(String[] args) {
        // Matriz 3x3
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Imprimir matriz
        System.out.println("Matriz:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        // Sumar todos los elementos
        int resultado = sumarElementosArrays(matriz);
        System.out.println("La suma de todos los elementos es: " + resultado);
    }

    // Método para sumar todos los elementos de una matriz 2D
    public static int sumarElementosArrays(int[][] matriz) {
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                suma += matriz[i][j];
            }
        }
        return suma;
        //correccion de codigo
    }
}
