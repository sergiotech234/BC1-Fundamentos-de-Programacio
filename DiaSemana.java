import java.util.Scanner;
public class DiaSemana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el numero de la semana del 1 al 7: ");
        int dia = scanner.nextInt();

        switch (dia) {
            case 1:
            System.out.print("Es lunes");
                break;
            
            case 2:
            System.out.print("Es Martes");
                break;
            
            case 3:
            System.out.print("Es Miercoles");
                break;

            case 4:
             System.out.print("Es Jueves");
                 break;

            case 5:
            System.out.print("Es Viernes");
                 break;

            case 6:
            System.out.print("Es Sabado");
                break;
            
            case 7:
            System.out.print("Es Domingo");
                 break;
            default:
            System.out.print("No hay dia");
                break;
        }
        scanner.close();
        }
}

