import java.util.Scanner;

public class InversoCaracteresString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese una cadena de texto: ");
        String texto = sc.nextLine();

        System.out.println("\nLa cadena en orden inverso es:");

        // Recorremos el string desde el final hasta el inicio
        for (int i = texto.length() - 1; i >= 0; i--) {
            System.out.print(texto.charAt(i));
        }

        System.out.println(); // salto de línea final
        sc.close();
    }
}

