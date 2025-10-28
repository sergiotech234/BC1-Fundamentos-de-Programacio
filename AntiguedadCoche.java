import java.time.LocalDate;
import java.util.Scanner;

public class AntiguedadCoche {
    String marca;
    String modelo;
    int año;
    boolean seguro;

    public void mostrardatos(){
        System.out.println("Marca del coche: " +marca);
        System.out.println("Modelo del coche: " +modelo);
        System.out.println("Año del coche: " +año);
        if(seguro){
            System.out.println("El seguro esta activo");
        }else{
            System.out.println("El seguro no esta activo");
        }
    }
    public void antiguedadCoche(){
        int AñoActual=LocalDate.now().getYear();
        int edad=AñoActual-año;
            System.out.println("La antigüedad del coche es de " + edad + " años.");
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        AntiguedadCoche[] Vehiculos = new  AntiguedadCoche [3];
        int n=3;

        for(int i=0;i<n;i++){
            Vehiculos[i]=new AntiguedadCoche();
            System.out.println("Introduce los datos del vehiculo"+ (i+1)+ ":");
            System.out.println("Introduce el nombre de la marca:");
            Vehiculos[i].marca=sc.nextLine();
            System.out.println("Introduce el modelo:");
            Vehiculos[i].modelo=sc.nextLine();
            System.out.println("Introduce el año:");
            Vehiculos[i].año=sc.nextInt();
            System.out.println("Introduce si tiene o no el seguro:");
            Vehiculos[i].seguro=sc.nextBoolean();
            sc.nextLine();
        }
        System.out.println("informacion del vehiculo");
        for(int i=0;i<n;i++){
            Vehiculos[i].mostrardatos();
            Vehiculos[i].antiguedadCoche();
        }
        sc.close();
    }

}