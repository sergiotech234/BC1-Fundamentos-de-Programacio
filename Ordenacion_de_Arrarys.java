public class Ordenacion_de_Arrarys {
    public static void main(String[] args) {
        int[] numero = {1, 43, 98, 32, 7667};

        for (int i = 0; i < numero.length - 1; i++) {
            int indiceMin = i;
            for (int j = i + 1; j < numero.length; j++) {
                if (numero[j] < numero[indiceMin]) {
                    indiceMin = j;
                }
            }
            // Intercambiamos
            int temp = numero[i];
            numero[i] = numero[indiceMin];
            numero[indiceMin] = temp;
        }

        // Imprimir el array ordenado
        System.out.print("Array ordenado: ");
        for (int i = 0; i < numero.length; i++) {
            System.out.print(numero[i] + " ");
        }
    }
}
