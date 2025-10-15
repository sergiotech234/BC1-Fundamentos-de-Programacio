public class Matriz {
    public static void main(String[] args) {
        int[] num = {1, 3, 5, 7, 2, 6, 5, 7, 43, 45};

        int resultado = sumarElementosArrays(num);
        int resultado2 = maximoElementosArrays(num);
        int resultado3 = minimoElementosArrays(num);

        System.out.println("La suma es: " + resultado);
        System.out.println("El máximo es: " + resultado2);
        System.out.println("El mínimo es: " + resultado3);
    }

    public static int sumarElementosArrays(int[] num) {
        int suma = 0;
        for (int i = 0; i < num.length; i++) {
            suma += num[i];
        }
        return suma;
    }

    public static int maximoElementosArrays(int[] num) {
        int maximo = num[0];  // Inicializamos con el primer elemento del array
        for (int i = 1; i < num.length; i++) {
            if (num[i] > maximo) {
                maximo = num[i];
            }
        }
        return maximo;
    }

    public static int minimoElementosArrays(int[] num) {
        int minimo = num[0];  // Inicializamos con el primer elemento del array
        for (int i = 1; i < num.length; i++) {
            if (num[i] < minimo) {
                minimo = num[i];
            }
        }
        return minimo;
    }
}
