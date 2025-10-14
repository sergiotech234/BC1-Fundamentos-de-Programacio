import java.util.Scanner;
public class Personal {
	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			
			System.out.print("Introduce tu nombre: ");
			String nombre = scanner.nextLine();

			System.out.print("Introduce tu edad: ");
			int edad = scanner.nextInt();

			System.out.println("Hola, " + nombre.toUpperCase() + ". Tienes " + edad +" años.");

			scanner.close();
	}
}