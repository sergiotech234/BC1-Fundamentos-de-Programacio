import java.util.Scanner;

public class BuscarArrays{
    public static void main(String[] args) {
        int[] numArray ={12,34,76,98,123,345};
        Scanner numero = new Scanner(System.in);
        System.out.print("Ingrese el número que desea buscar en el array:"); 
        int numeroBuscar = numero.nextInt();

        boolean localizado = false;
        for(int i = 0; i < numArray.length; i++){
            if(numArray[i] == numeroBuscar) { 
                System.out.print("El número " + numeroBuscar + " se encuentra en la posición " + i + "."); 
                localizado = true;  
                break;
        }
    }
    if(!localizado) {
        System.out.println("El número " + numeroBuscar + " no existe en el array.");
    }  
    System.out.println("Búsqueda completada."); 
    numero.close();
}
}