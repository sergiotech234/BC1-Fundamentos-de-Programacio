import java.util.Random;
import java.util.Scanner;

public class Juego_Adivinar_el_Numero {
    public static void main(String[] args) {
        Random random = new Random(); 
        Scanner num = new Scanner(System.in); 
        
        int numeroAleatorio = random.nextInt(99) + 1;
        int intentos = 3;  
        boolean adivinado = false; 
        
        System.out.println("¡Bienvenido al Juego de Adivinar el Número!");
        System.out.println("He generado un número entre 1 y 100. Intenta adivinarlo.");

        while (!adivinado) { 
            System.out.print("Ingresa tu número: "); 
            int numeroUsuario = num.nextInt();
            intentos++; 

            if (numeroUsuario == numeroAleatorio) {
                adivinado = true;
                System.out.println("¡Felicidades! Has adivinado el número en " + intentos + " intentos.");
            } else if (numeroUsuario < numeroAleatorio) {
                System.out.println("El número es mayor. Intenta de nuevo.");
            } else {
                System.out.println("El número es menor. Intenta de nuevo.");
            }
        }

        System.out.println("¡Gracias por jugar!");
    }
}