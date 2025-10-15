import java.util.Scanner;

public class CajeroAutomatico {
        
    static double saldo = 1000.0;  // Variable de estado: saldo inicial (puedes cambiarlo)
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Creamos un objeto Scanner
        boolean continuar = true;  // Variable para controlar el bucle (manejo de estado)
        
        while(continuar) {  // Bucle while para mantener el menú activo
            System.out.println("\n--- Simulador de Cajero Automático ---");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Retirar dinero");
            System.out.println("3. Depositar dinero");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            
            int opcion = scanner.nextInt();  // Leer la opción del usuario
            
            switch(opcion) {  // Estructura de control: switch para manejar las opciones
                case 1:
                    consultarSaldo();  // Llamamos a la función para consultar saldo
                    break;
                case 2:
                    retirarDinero(scanner);  // Llamamos a la función para retirar
                    break;
                case 3:
                    depositarDinero(scanner);  // Llamamos a la función para depositar
                    break;
                case 4:
                    continuar = false;  // Cambiamos el estado para salir del bucle
                    System.out.println("Gracias por usar el cajero. ¡Adiós!");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elige de 1 a 4.");
            }
        }
        
        scanner.close();  // Cerramos el Scanner para buena práctica
    }
    
    // Función para consultar el saldo
    public static void consultarSaldo() {
        System.out.println("Tu saldo actual es: $" + saldo);
    }
    
    // Función para retirar dinero
    public static void retirarDinero(Scanner scanner) {
        System.out.print("Ingresa la cantidad a retirar: ");
        double cantidad = scanner.nextDouble();  // Leer la cantidad
         if(cantidad > 0) {  // Condicional: Verificamos si la cantidad es positiva
            if(cantidad <= saldo) {  // Condicional: Verificamos si hay fondos suficientes
                saldo -= cantidad;  // Actualizamos el estado: restamos la cantidad al saldo
                System.out.println("Retiro exitoso. Saldo restante: $" + saldo);
            } else {
                System.out.println("Fondos insuficientes. Tu saldo es: $" + saldo);
            }
        } else {
            System.out.println("Cantidad inválida. Debe ser mayor a 0.");
        }
    }
    
    // Función para depositar dinero
    public static void depositarDinero(Scanner scanner) {
        System.out.print("Ingresa la cantidad a depositar: ");
        double cantidad = scanner.nextDouble();  // Leer la cantidad
        
        if(cantidad > 0) {  // Condicional: Verificamos si la cantidad es positiva
            saldo += cantidad;  // Actualizamos el estado: sumamos la cantidad al saldo
            System.out.println("Depósito exitoso. Saldo actual: $" + saldo);
        } else {
            System.out.println("Cantidad inválida. Debe ser mayor a 0.");
        }
    }
}
