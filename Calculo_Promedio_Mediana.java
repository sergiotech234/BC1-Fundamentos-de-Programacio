import java.util.Arrays;

public class Calculo_Promedio_Mediana {
public static void main(String[] args) {
        double[] numero = {4, 7, 1, 9, 3};

        double promedio = calcularPromedio(numero);
        double mediana = calcularMediana(numero);

        System.out.println("Promedio: " + promedio);
        System.out.println("Mediana: " + mediana);
    }

    public static double calcularPromedio(double[] num) {
        double suma = 0;
        for (double n : num) {
            suma += n;
        }
        return suma / num.length;
    }

    public static double calcularMediana(double[] num) {
        Arrays.sort(num);
        int n = num.length;
        if (n % 2 == 0)
            return (num[n / 2 - 1] + num[n / 2]) / 2.0;
        else
            return num[n / 2];
    }
}
