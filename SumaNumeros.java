import java.util.Scanner;
public class SumaNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int suma = 0;
        int numero;

        System.out.println("Introduce números para sumar (introduce un número negativo para terminar):");        

        do {
            System.out.print("Número: ");
            numero = sc.nextInt();

            if (numero >= 0) {
                suma += numero;
            }

        } while (numero >= 0);
     
        System.out.println("La suma total es: " + suma);

        sc.close();
    }
}
