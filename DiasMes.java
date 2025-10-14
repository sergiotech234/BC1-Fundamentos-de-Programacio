import java.util.Scanner;
public class DiasMes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el numero de la mes del 1 al 12: ");
        int mes = scanner.nextInt();

        switch (mes) {
            case 1:
            System.out.print("Enero tiene 31 dias");
                break;
            case 2:
            System.out.print("Febero tiene 28 o 29 dias");
                break;
            case 3:
            System.out.print("Marzo tiene 31 dias");
                break;
            case 4:
             System.out.print("Abril tiene 30 dias");
                 break;
            case 5:
            System.out.print("Mayo tiene 31 dias");
                 break;
            case 6:
            System.out.print("Junio tiene 30 dias");
                break;
            case 7:
            System.out.print("Julio tiene 31 dias");
                 break;
            case 8:
            System.out.print("Agosto tiene 31 dias");
                break;
            case 9:
            System.out.print("Septiembre tiene 30 dias");
                 break;
            case 10:
            System.out.print("Octubre tiene 31 dias");
                break;
            case 11:
            System.out.print("Noviembre tiene 30 dias");
                break;
            case 12:
            System.out.print("Diciembre tiene 31 dias");
                break;    
            default:
            System.out.print("No existe el mes marcado");
                break;
        }
        scanner.close();
    }
}
