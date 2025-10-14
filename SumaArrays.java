public class SumaArrays{
    public static void main(String[] args) {
        /* int resultado = suma(1, 3, 5, 7, 2, 6, 5, 7, 43, 45);
        System.out.println("La suma es: " + resultado);
    }

    public static int suma(int a, int b, int c, int d, int e, int f, int g, int h, int i, int j) {
        int s;
        s = a + b + c + d + e + f + g + h + i + j;
        return s; */
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

