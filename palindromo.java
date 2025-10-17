import java.util.Scanner;
public class palindromo {

    public static boolean esPalindromo(String palabra) {
        int longitud = palabra.length();
        
        for (int i = 0; i < longitud / 2; i++) { 
            if (palabra.charAt(i) != palabra.charAt(longitud - 1 - i)) {
                return false;  // Si no coinciden, no es palíndromo
            }
        }
        return true;  // Si todo coincide, sí lo es
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese una cadena de texto: ");
        String texto = sc.nextLine();

        System.out.print("La cadena en orden inverso es: ");
        for (int i = texto.length() - 1; i >= 0; i--) {
            System.out.print(texto.charAt(i));
        }
        System.out.println();

        if (esPalindromo(texto)) {
            System.out.println("La cadena ES un palíndromo.");
        } else {
            System.out.println("La cadena NO es un palíndromo.");
        }

        sc.close();
    }
}
