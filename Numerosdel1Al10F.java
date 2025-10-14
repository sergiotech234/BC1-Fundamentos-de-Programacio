import java.util.Scanner;

public class Numerosdel1Al10F {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
		

        System.out.print("Valor de n:");
		int n = scanner.nextInt();
        int suma =0;
        double media;

        for(int i = 1; i <= n; i++){
            System.out.println(i);
            suma=suma+i;
        }
        media=(double)suma/n;
        System.out.println("La suma es: " +suma);
        //System.out.printlnf("La media es %f: ",media);
        System.out.println("La media es: " +media);
        scanner.close ();
        }
}