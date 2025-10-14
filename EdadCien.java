
import java.time.LocalDate;
import java.util.Scanner;
public class EdadCien {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el año de nacimiento: ");
        int centenario = 0;
        int edad=0;
        int anho = scanner.nextInt();
        int anhoActual = LocalDate.now().getYear();

        edad = anhoActual - anho;
        System.out.println("Su edad es de: " +edad);

        centenario = 100 - edad;
        System.out.println("Para cumplir los cine años te quedan: " +centenario);

        if(centenario == 100){
            System.out.println("Felicidades tienes los 100 años");
        }else{
            System.out.println("la has cagado no tienes 100 años");
        }
        scanner.close();
    }
}