import java.util.Scanner;

public class Primo {

    // Método que determina si un número es primo
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false; // 0, 1 y negativos no son primos
        }

        // Basta con comprobar divisores hasta la raíz cuadrada
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false; // si tiene divisor, no es primo
            }
        }

        return true; // no se encontró divisor → es primo
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número entero: ");
        int numero = sc.nextInt();

        if (esPrimo(numero)) {
            System.out.println("El número " + numero + " es primo.");
        } else {
            System.out.println("El número " + numero + " no es primo.");
        }

        sc.close();
    }
}
