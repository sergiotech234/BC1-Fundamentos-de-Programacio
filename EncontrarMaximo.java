import java.util.Scanner;
public class EncontrarMaximo {  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numero = new int[5];

        System.out.println("Introduce 5 números enteros: ");

        for (int i = 0; i < numero.length; i++) {
            System.out.println("Número " + (i + 1) + ":");
            System.out.print("");
            numero[i] = scanner.nextInt();
        }
        //Para encontrar el numero maximo tenemos que crear una varible maximo 
        int maximo = 0;
        int posicion =1;
        for (int i = 1; i < numero.length; i++) {
            if(numero[i] > maximo){
                maximo=numero[i];
                posicion=i+1;
            }
        }

        System.out.println("Este es el numero:" + maximo + " la posicion del numero es: "+ posicion);
        scanner.close();
    }
}
