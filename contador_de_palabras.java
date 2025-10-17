import java.util.Scanner;
public class contador_de_palabras {
    public static int contarPalabras(String cadena) {
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