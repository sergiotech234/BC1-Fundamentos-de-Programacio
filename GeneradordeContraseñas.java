import java.util.Random;
import java.util.Scanner;

public class GeneradordeContraseñas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("¿De cuántos caracteres quieres tu contraseña? ");
        int longitud = sc.nextInt();

        String contrasena = generarContrasena(longitud);

        System.out.println("Tu contraseña generada es: " + contrasena);

        sc.close();
    }

    public static String generarContrasena(int longitud) {
        // Conjuntos de caracteres disponibles
        String letrasMayus = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String letrasMinus = "abcdefghijklmnopqrstuvwxyz";
        String numeros = "0123456789";
        String simbolos = "!@#$%^&*()-_=+[]{};:,.<>?/";

        // Unimos todos los caracteres en un solo string
        String todos = letrasMayus + letrasMinus + numeros + simbolos;

        // Usaremos StringBuilder para construir la contraseña de forma eficiente
        StringBuilder contrasena = new StringBuilder();

        Random random = new Random();

        // Generamos tantos caracteres como indique la longitud
        for (int i = 0; i < longitud; i++) {
            int indice = random.nextInt(todos.length()); // posición aleatoria
            contrasena.append(todos.charAt(indice));     // añadimos el carácter
        }

        return contrasena.toString(); // Convertimos a String normal
    }
}
