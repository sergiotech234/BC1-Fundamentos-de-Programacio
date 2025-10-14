import java.util.Arrays;
import java.util.Random;

public class Loteria {
    public static void main(String[] args) {
        final int NUMEROS = 6;
        int[] boleto = new int[NUMEROS];
        Random random = new Random();

        int contador = 0;
        while (contador < NUMEROS) {
            int num = random.nextInt(49) + 1; // genera entre 1 y 49
            boolean repetido = false;

            // Verificar que el número no se repita
            for (int i = 0; i < contador; i++) {
                if (boleto[i] == num) {
                    repetido = true;
                    break;
                }
            }

            if (!repetido) {
                boleto[contador] = num;
                contador++;
            }
        }

        // Ordenar el arreglo
        Arrays.sort(boleto);

        // Mostrar el resultado
        System.out.println("Números de la lotería:");
        for (int i = 0; i < NUMEROS; i++) {
            System.out.print(boleto[i] + (i < NUMEROS - 1 ? " - " : "\n"));
        }
    }
}
