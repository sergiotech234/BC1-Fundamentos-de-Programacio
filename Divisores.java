import java.util.Scanner;
public class Divisores {
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un numero:");

        int num = scanner.nextInt();

        System.out.println("Los divisores de " + num + " son:");

        /*int i = 1;
        do {
            if (num % i == 0) {
                System.out.println(i);
            }
            i++;
        } while (i <= num);
        */

        for (int i=1; i <= num ; i++){
            if (num % i == 0) {
            System.out.println(i);
            }
        }
    scanner.close();
}
}