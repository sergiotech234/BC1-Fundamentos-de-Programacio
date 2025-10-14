import java.util.Scanner;
public class VocalMayuscula {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese una vocal: ");
        String entrada = sc.nextLine().toLowerCase(); // Convertimos a minúscula para validar fácilmente

        // Validar que sea una sola letra y una vocal
        if (entrada.length() == 1 && esVocal(entrada.charAt(0))) {
            char vocalMayuscula = Character.toUpperCase(entrada.charAt(0));
            System.out.println("La vocal en mayúscula es: " + vocalMayuscula);
        } else {
            System.out.println("Error: debe ingresar una única vocal (a, e, i, o, u).");
        }

        sc.close();
    }

    // Método auxiliar para validar si el carácter es una vocal
    public static boolean esVocal(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
