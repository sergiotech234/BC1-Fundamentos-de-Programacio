import java.util.Scanner; 
public class ChequeaMultiplo {
    int multiplo; 
    public ChequeaMultiplo(int multiplo) { 
        this.multiplo = multiplo;
    }
    public boolean esMultiplo(int numero) { 
        if (multiplo == 0) { 
            return false;
        }
        return numero % multiplo == 0; 
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el número del cual quiere verificar múltiplos:"); 
        int multiploIngresado = scanner.nextInt(); 
        
        ChequeaMultiplo checker = new ChequeaMultiplo(multiploIngresado);
        
        System.out.println("Ingrese el número a verificar:");
        int numeroAVerificar = scanner.nextInt(); 
        
        if (checker.esMultiplo(numeroAVerificar)) { 
            System.out.println(numeroAVerificar + " es múltiplo de " + multiploIngresado);
        } else {
            System.out.println(numeroAVerificar + " no es múltiplo de " + multiploIngresado); 
        }
        
        scanner.close(); 
    }
}  
