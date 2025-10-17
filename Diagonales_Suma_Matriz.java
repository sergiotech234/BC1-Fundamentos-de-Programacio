public class Diagonales_Suma_Matriz {
    public static void main(String[] args) {
        // Matriz 3x3
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Imprimir matriz original
        System.out.println("Matriz original:");
        imprimirMatriz(matriz);

        // Sumar diagonal principal
        int sumaPrincipal = sumarDiagonalPrincipal(matriz);
        System.out.println("\nLa suma de la diagonal principal es: " + sumaPrincipal);

        invertirDiagonalSecundaria(matriz);
        // Sumar diagonal secundaria después de invertir
        int sumaSecundariaInvertida = sumarDiagonalSecundaria(matriz);
        System.out.println("La suma de la diagonal secundaria invertida es: " + sumaSecundariaInvertida);
    }

    // Método para sumar la diagonal principal
    public static int sumarDiagonalPrincipal(int[][] matriz) {
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            suma += matriz[i][i];
        }
        return suma;
    }

    // Método para sumar la diagonal secundaria
    public static int sumarDiagonalSecundaria(int[][] matriz) {
        int suma = 0;
        int n = matriz.length;
        for (int i = 0; i < n; i++) {
            suma += matriz[i][n - 1 - i];
        }
        return suma;
    }

    // Método para invertir la diagonal secundaria
    public static void invertirDiagonalSecundaria(int[][] matriz) {
        int n = matriz.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = matriz[i][n - 1 - i];
            matriz[i][n - 1 - i] = matriz[n - 1 - i][i];
            matriz[n - 1 - i][i] = temp;
        }
    }

    // Método para imprimir una matriz
    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}