import java.util.Scanner;  // Para leer la entrada del usuario
import java.util.Random;   // Para generar números aleatorios
import java.util.Arrays;   // Para usar Arrays si es necesario

public class JuegodeBatallaNavalSimplificado {
    
    static final int TAMANO_TABLERO = 5;  // Tamaño del tablero (5x5)
    static final int NUM_BARCOS = 3;      // Número de barcos
    static char[][] tablero = new char[TAMANO_TABLERO][TAMANO_TABLERO];  // Array bidimensional para el tablero
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();  // Objeto para generar números aleatorios
        inicializarTablero();  // Llamamos a la función para preparar el tablero
        colocarBarcosAleatorios(random);  // Colocamos barcos
        
        int intentos = 0;  // Contador de intentos
        int aciertos = 0;  // Contador de aciertos
        int fallos = 0;    // Contador de fallos
        
        System.out.println("¡Bienvenido a Batalla Naval Simplificado!");
        System.out.println("El tablero es de 5x5. Adivina las posiciones de los " + NUM_BARCOS + " barcos.");
        
        while(aciertos < NUM_BARCOS && intentos < 10) {  // Bucle principal: hasta que se ganen o se acaben los intentos
            mostrarTablero();  // Mostramos el tablero actual
            System.out.print("Ingresa la fila (0-4): ");
            int fila = scanner.nextInt();
            System.out.print("Ingresa la columna (0-4): ");
            int columna = scanner.nextInt();
            
            intentos++;  // Incrementamos el conteo de intentos
            
            if(fila >= 0 && fila < TAMANO_TABLERO && columna >= 0 && columna < TAMANO_TABLERO) {  // Condicional: Verificamos límites
                if(tablero[fila][columna] == 'B') {  // Condicional: Si hay un barco
                    System.out.println("¡Acierto! Has golpeado un barco.");
                    tablero[fila][columna] = 'X';  // Marcamos como acierto
                    aciertos++;
                } else {
                    System.out.println("¡Fallo! No hay barco en esa posición.");
                    tablero[fila][columna] = 'O';  // Marcamos como fallo
                    fallos++;
                }
            } else {
                System.out.println("Coordenadas inválidas. Deben estar entre 0 y 4.");
                intentos--;  // No contamos este intento
            }
        }
        
        System.out.println("\n--- Fin del juego ---");
        System.out.println("Intentos totales: " + intentos);
        System.out.println("Aciertos: " + aciertos);
        System.out.println("Fallos: " + fallos);
        if(aciertos == NUM_BARCOS) {
            System.out.println("¡Felicidades, has ganado!");
        } else {
            System.out.println("Has perdido. ¡Inténtalo de nuevo!");
        }
        
        scanner.close();  // Cerramos el Scanner
    }
    
    // Función para inicializar el tablero
    public static void inicializarTablero() {
        for(int i = 0; i < TAMANO_TABLERO; i++) {  // Bucle anidado para recorrer filas
            for(int j = 0; j < TAMANO_TABLERO; j++) {  // Bucle para recorrer columnas
                tablero[i][j] = '.';  // Inicializamos con '.' (agua)
            }
        }
    }
    
    // Función para colocar barcos aleatorios
    public static void colocarBarcosAleatorios(Random random) {
        int barcosColocados = 0;
        while(barcosColocados < NUM_BARCOS) {
            int fila = random.nextInt(TAMANO_TABLERO);  // Generamos fila aleatoria
            int columna = random.nextInt(TAMANO_TABLERO);  // Generamos columna aleatoria
            if(tablero[fila][columna] == '.') {  // Condicional: Si la celda está vacía
                tablero[fila][columna] = 'B';  // Colocamos el barco
                barcosColocados++;
            }  // Si ya hay un barco, intentamos de nuevo (evita superposiciones)
        }
    }
    
    // Función para mostrar el tablero
    public static void mostrarTablero() {
        System.out.println("\nTablero:");
        for(int i = 0; i < TAMANO_TABLERO; i++) {  // Bucle anidado para imprimir
            for(int j = 0; j < TAMANO_TABLERO; j++) {
                System.out.print(tablero[i][j] + " ");  // Imprimimos cada celda
            }
            System.out.println();  // Nueva línea para la siguiente fila
        }
    }
}
