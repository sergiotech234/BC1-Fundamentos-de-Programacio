package Ejercicios.BC1;
import java.util.Scanner;
public class contador_de_palabras {
    // Método que cuenta cuántas palabras hay en una cadena
    // Una palabra se considera separada por espacios
    public static int contarPalabras(String cadena) {
        // Dividimos la cadena por espacios y contamos las partes
        // Esto maneja espacios simples; para múltiples espacios, usa "\\s+"
        String[] palabras = cadena.split(" ");
        return palabras.length;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese una cadena de texto: ");
        String texto = sc.nextLine();
        int numPalabras = contarPalabras(texto);
        System.out.println("La cadena tiene " + numPalabras + " palabras.");
        sc.close();
    }
}