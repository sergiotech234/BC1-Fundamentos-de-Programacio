import java.util.Scanner;
public class contador_de_palabras {
    public static int contarPalabras(String cadena) {
        String[] palabras = cadena.split(" ");
        return palabras.length;
    }
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese una cadena de texto: ");
        //Para que cuente palabras, necesitaremos una variable string e int para que se dividan en bloques y se puedan contar los caracteres
        String texto = entrada.nextLine();
        int numPalabras = contarPalabras(texto);
        System.out.println("La cadena tiene " + numPalabras + " palabras.");
        entrada.close();
    }
}