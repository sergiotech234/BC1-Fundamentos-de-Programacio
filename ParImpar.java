import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un numero: ");
        int numero = scanner.nextInt();

        if( numero == 0){
            System.out.println("Es es un caso especial");
        } else if (numero %2 == 0){
            System.out.println("Es par");
        } else {
            System.out.println("Es impar");
        }
        scanner.close();
    }
}
