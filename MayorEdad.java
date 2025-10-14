import java.util.Scanner;
import java.time.LocalDate;

public class MayorEdad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el año de nacimiento: ");
        int anho = scanner.nextInt();

        int anhoActual = LocalDate.now().getYear();

        if(anhoActual - anho >= 18){
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("No es mayor de edad");
        }
        scanner.close();
    }
}
