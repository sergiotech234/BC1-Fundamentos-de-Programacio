import java.util.InputMismatchException;
import java.util.Scanner;

public class DatosUsuario {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
			
			System.out.print("Introduce tu nombre completo: ");
			String nombrecompleto = scanner.nextLine();

			System.out.print("Introduce tu edad: ");
			int edad = 0;
			
            boolean entradaValida = false;

            while (!entradaValida){
                System.out.println("Introduce tu edad: ");

                try {
                    edad = scanner.nextInt();
                    entradaValida = true;
                }catch (InputMismatchException e) {
                    System.out.println("Entrada no valida. Por favor, introduce un numero entero.");
                    scanner.nextLine();//Limpiar el buffer
                }
            }

			System.out.print("Introduce tu altura: ");
			double altura = scanner.nextDouble();

			System.out.print("Tienes estudios? ");
			Boolean estudios = scanner.nextBoolean();

            System.out.printf("\nNombre: %s\n" , nombrecompleto.toUpperCase());
            System.out.printf("Edad: %d años\n" , edad);
            System.out.printf("Altura: %.2f metros\n" , altura);
            System.out.printf("¿Estudias? %b\n" , estudios);

        scanner.close();
    }
}
