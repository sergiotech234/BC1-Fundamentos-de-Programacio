package Ejercicios.BC1;
import java.util.Scanner;
public class palindromo {

    // Método que verifica si una cadena es palíndromo (ignorando mayúsculas y espacios)
    public static boolean esPalindromo(String palabra) {
        // Tomamos la longitud de la palabra
        int longitud = palabra.length();
        
        // Comparamos el primer carácter con el último, el segundo con el penúltimo, etc.
        for (int i = 0; i < longitud / 2; i++) {  // Solo hasta la mitad
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

        // Mostrar la cadena invertida
        System.out.print("La cadena en orden inverso es: ");
        for (int i = texto.length() - 1; i >= 0; i--) {
            System.out.print(texto.charAt(i));
        }
        System.out.println();

        // Verificar si es palíndromo
        if (esPalindromo(texto)) {
            System.out.println("La cadena ES un palíndromo.");
        } else {
            System.out.println("La cadena NO es un palíndromo.");
        }

        sc.close();
    }
}
