public class DeteccionPrimo {

    // Función para verificar si un número es primo
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false; // No son primos los menores o iguales a 1
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false; // Si tiene más divisores, no es primo
            }
        }
        return true; // Es primo
    }

    public static void main(String[] args) {
        // Array de ejemplo
        int[] numeros = {3, 4, 5, 6, 7, 8, 9, 10, 11, 13, 15, 17};

        System.out.println("Números primos en el array:");
        
        // Recorrer el array y mostrar los primos
        for (int num : numeros) {
            if (esPrimo(num)) {
                System.out.println(num);
            }
        }
    }
}
