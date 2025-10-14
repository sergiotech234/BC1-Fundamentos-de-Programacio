import java.util.Scanner;

public class Calculadora {
    public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
//leer dos numeros enteros
			System.out.println("Introduce un numero: ");
			int num1= scanner.nextInt();

            System.out.println("Introduce un numero: ");
			int num2= scanner.nextInt();
//realiazar operaciones
            System.out.printf("Suma: %d\n", num1 + num2);
            System.out.printf("Resta: %d\n", num1 - num2);
            System.out.printf("Multiplicacion: %d\n", num1 * num2);
//division con mandejo de division por cero
            if (num2 != 0){
                System.out.printf("Division: %.2f\n",(double) num1 / num2);
            } else {
                System.out.printf("No se puede hacer");
            }
    
        scanner.close();
    }
    
}
