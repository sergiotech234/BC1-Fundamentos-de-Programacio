import java.util.Scanner;

public class Conversor_de_Base {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedir número decimal
        System.out.print("Introduce un número decimal: ");
        int numero = sc.nextInt();

        // Mostrar opciones de conversión
        System.out.println("¿A qué base quieres convertirlo?");
        System.out.println("1. Binario");
        System.out.println("2. Octal");
        System.out.println("3. Hexadecimal");
        System.out.print("Elige una opción (1-3): ");
        int opcion = sc.nextInt();

        String resultado = "";  // Aquí guardaremos el número convertido

        // Usamos switch para decidir la conversión
        switch (opcion) {
            case 1:
                resultado = convertirABinario(numero);
                System.out.println("El número en BINARIO es: " + resultado);
                break;
            case 2:
                resultado = Integer.toOctalString(numero);
                System.out.println("El número en OCTAL es: " + resultado);
                break;
            case 3:
                resultado = Integer.toHexString(numero).toUpperCase();
                System.out.println("El número en HEXADECIMAL es: " + resultado);
                break;
            default:
                System.out.println("Opción no válida");
        }

        sc.close();
    }

    // Método para convertir manualmente a binario (usando StringBuilder)
    public static String convertirABinario(int numero) {
        if (numero == 0) return "0";

        StringBuilder binario = new StringBuilder();

        while (numero > 0) {
            int residuo = numero % 2;  // obtenemos el resto
            binario.insert(0, residuo); // insertamos al inicio
            numero /= 2;                // dividimos entre 2
        }

        return binario.toString();
    }
}
