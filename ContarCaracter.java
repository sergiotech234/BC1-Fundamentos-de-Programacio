import java.util.Scanner;

public class ContarCaracter {

    // Método que cuenta cuántas veces aparece un carácter en una cadena
    public static int contarVecesCaracter(String cadena, char caracter) {
        int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == caracter) {
                contador++;
            }
        }
        return contador;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese una cadena de texto: ");
        String texto = sc.nextLine();

        System.out.print("Ingrese el carácter a buscar: ");
        char caracter = sc.next().charAt(0); // Leer solo un carácter

        int veces = contarVecesCaracter(texto, caracter);

        System.out.println("El carácter '" + caracter + "' aparece " + veces + " veces en la cadena.");

        sc.close();
    }
}
