import java.util.Scanner;
public class Calculadora_factorial {
    public static long calcularFactorial(int num) {
        if (num < 0) {
            return -1; 
        }
        if (num == 0 || num == 1) {
            return 1;  
        }
        
        long resultado = 1; 
        for (int i = 2; i <= num; i++) {
            resultado = resultado * i;
        }
        return resultado;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa un número entero positivo (ej. 5): ");
        int numero = sc.nextInt();
        long factorial = calcularFactorial(numero);
        if (factorial == -1) {
            System.out.println("Error: El factorial no se define para números negativos.");
        } else {
            System.out.println("El factorial de " + numero + " es: " + factorial);
        }
        sc.close();
    }
}