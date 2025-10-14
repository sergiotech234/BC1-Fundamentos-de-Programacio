public class Main {
    public static void main(String[] args) {
        int [] num = {1, 3, 5, 7, 2, 6, 5, 7, 43, 45};
        int resultado = sumarElementosArrays(num);
        System.out.println("La suma es: " + resultado);
    }

    public static int sumarElementosArrays(int[] num) {
        int suma = 0;
        for (int i = 0;i < num.length; i++){
            suma += num[i];
        }
        return suma;
    }
}

