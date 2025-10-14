public class Suma {
        public static void main(String[] args) {
            int[] numeros = {1, 2, 3, 4};
    
            int suma = 0;
    
            for (int i = 0; i < numeros.length; i++) {
                suma += numeros[i];  
            }
    
            System.out.println("La suma es: " + suma);
        }
    }