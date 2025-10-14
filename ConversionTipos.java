public class ConversionTipos {
    public static void main(String[] args) {
        double num = 3.14;
        int entero;
        entero = (int) num; //conversion explicada (cast)
        //System.out.print("El valor convertido a int es: " + entero);
            System.out.printf("El valor de %f convertido a int es %d", num, entero);
    }
}
