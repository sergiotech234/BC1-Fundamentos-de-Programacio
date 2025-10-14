import java.util.Scanner;
public class MostrarInvertidos {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int[] numero = new int[5];
    
            System.out.println("Introduce 5 números enteros: ");
    
            for (int i = 0; i < numero.length; i++) {
                System.out.println("Número " + (i + 1) + ":");
                System.out.print("");
                numero[i] = scanner.nextInt();
            }
            int[] invertido = new int[numero.length];
    
            for (int i = 0; i < numero.length; i++) {
                invertido[i] = numero[numero.length - 1 - i];
            }
    
            System.out.print("Array invertido: ");
            for (int i = 0; i < invertido.length; i++) {
                System.out.print(invertido[i] + " ");
            }
            scanner.close();

            /* 
                    int[] numeros = {5, 8, 50, 7};
            
                    // Creamos un nuevo array para guardar los datos invertidos
                    int[] invertido = new int[numeros.length];
            
                    // Recorremos el array original de atrás hacia adelante
                    for (int i = 0; i < numeros.length; i++) {
                        invertido[i] = numeros[numeros.length - 1 - i];
                    }
            
                    // Imprimir el array invertido
                    System.out.print("Array invertido: ");
                    for (int i = 0; i < invertido.length; i++) {
                        System.out.print(invertido[i] + " ");
                    }
            */

                }
            }
            
