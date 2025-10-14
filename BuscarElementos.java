import java.util.Scanner;

public class BuscarElementos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numero = new int[5];

        System.out.println("Introduce 5 números enteros: ");

        for (int i = 0; i < numero.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numero[i] = scanner.nextInt();
        }
        System.out.print("Introduce el número que quieres buscar: ");
        int buscar = scanner.nextInt();

        int posicion = -1;  
 //creamos la variable para poder sumarle uno a la siguiente porque el break anula a i++
        for (int i = 0; i < numero.length; i++) {
            if (numero[i] == buscar) {
                posicion = i+1;
                break;  
            }
        }

        if (posicion != -1) {
            System.out.println("El número " + buscar + " se encuentra en la posición: " + posicion);
        } else {
            System.out.println("El número " + buscar + " no se encontró en el array.");
        }

        scanner.close();
    }
}
