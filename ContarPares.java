import java.util.Scanner;
public class ContarPares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[5];

        System.out.println("Introduce 5 números enteros:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        int contador = 0;
// para poder poner un numero par tenemos que poner variable [i]%2 == 0
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                contador++;
            }
        }

        System.out.println("La cantidad de números pares que hay es: " + contador);

        scanner.close();
    }
}
