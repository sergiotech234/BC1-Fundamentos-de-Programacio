import java.util.Scanner;
public class CifradoCesar {
public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el mensaje: ");
        String mensaje = sc.nextLine();

        System.out.print("Introduce el desplazamiento (número): ");
        int desplazamiento = sc.nextInt();

        String cifrado = cifrar(mensaje, desplazamiento);
        String descifrado = descifrar(cifrado, desplazamiento);

        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Mensaje original: " + mensaje);
        System.out.println("Mensaje cifrado: " + cifrado);
        System.out.println("Mensaje descifrado: " + descifrado);

        sc.close();
    }

    // Método para cifrar el texto
    public static String cifrar(String texto, int desplazamiento) {
        StringBuilder resultado = new StringBuilder();

        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);

            if (Character.isLetter(c)) {
                char base = Character.isUpperCase(c) ? 'A' : 'a';
                // Aplicamos la fórmula del cifrado: (posición + desplazamiento) mod 26
                c = (char) ((c - base + desplazamiento) % 26 + base);
            }

            resultado.append(c);
        }

        return resultado.toString();
    }

    // Método para descifrar el texto
    public static String descifrar(String texto, int desplazamiento) {
        // Descifrar es lo mismo que cifrar con desplazamiento negativo
        return cifrar(texto, 26 - (desplazamiento % 26));
    }
}
