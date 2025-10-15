public class PrimosArrays {

    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false; 
            }
        }

        return true; // no se encontró divisor → es primo
    }

    // Método principal
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("Números primos en el array:");

        // Usamos un bucle for-each para iterar a través de cada elemento del array
        for (int numero : numeros) {
            if (esPrimo(numero)) { 
                System.out.println(numero + " es un número primo");
            }
        }
    }
}
