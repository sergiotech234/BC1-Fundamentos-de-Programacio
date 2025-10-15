import java.util.Arrays; 
public class Matriz_Transpuesto {
    public static void main(String[] args) {

        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6} 
        };
        int filasOriginal = matriz.length;
        int columnasOriginal = matriz[0].length;
        int[][] matrizTranspuesta = new int[columnasOriginal][filasOriginal];
        for(int i = 0; i < filasOriginal; i++) { 
            for(int j = 0; j < columnasOriginal; j++) { 
                matrizTranspuesta[j][i] = matriz[i][j];
            }
        }
        System.out.println("\nMatriz transpuesta:"); 
        for(int i = 0; i < columnasOriginal; i++) { 
            System.out.println(Arrays.toString(matrizTranspuesta[i]));
    }
    }
}

