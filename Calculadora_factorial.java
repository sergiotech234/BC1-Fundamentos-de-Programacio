package Ejercicios.BC1;
import java.util.Scanner;
public class Calculadora_factorial {
    // Método simple para calcular el factorial de un número
    // Usa un bucle para multiplicar desde 1 hasta n
    public static long calcularFactorial(int num) {
        if (num < 0) {
            return -1;  // Error: factorial no definido para negativos
        }
        if (num == 0 || num == 1) {
            return 1;   // 0! y 1! son 1
        }
        
        long resultado = 1;  // Usamos 'long' para números más grandes (hasta ~20!)
        for (int i = 2; i <= num; i++) {
            resultado = resultado * i;
        }
        return resultado;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa un número entero positivo (ej. 5): ");
        int numero = sc.nextInt();  // Lee un número entero
        long factorial = calcularFactorial(numero);
        if (factorial == -1) {
            System.out.println("Error: El factorial no se define para números negativos.");
        } else {
            System.out.println("El factorial de " + numero + " es: " + factorial);
        }
        sc.close();
    }
}