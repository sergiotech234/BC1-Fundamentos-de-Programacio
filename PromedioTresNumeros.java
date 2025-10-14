import java.util.Scanner;
public class PromedioTresNumeros {
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Introduce el primer numero: ");
		double primer = scanner.nextDouble();

		System.out.print("Introduce el segundo numero: ");
		double segundo = scanner.nextDouble();

        
		System.out.print("Introduce el tercer numero: ");
		double tercero = scanner.nextDouble();

		double promedio = (primer + segundo + tercero)/3;

		System.out.print("El promedio de tres numeros es:" + promedio);
		scanner.close();
	}
}