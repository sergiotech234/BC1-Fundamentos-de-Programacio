import java.util.Scanner;
public class GestorNotas {
    public static void main(String[] args) {
        final int MAX_ESTUDIANTES = 10;
        String[] nombres = new String[MAX_ESTUDIANTES];
        double[] notas = new double[MAX_ESTUDIANTES];
        int cantidad = 0;

        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n===== GESTOR DE NOTAS =====");
            System.out.println("1. Registrar estudiante");
            System.out.println("2. Calcular promedio general y calificación global");
            System.out.println("3. Mostrar estadísticas");
            System.out.println("4. Buscar estudiante por nombre");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1: // Registrar estudiante
                    if (cantidad < MAX_ESTUDIANTES) {
                        System.out.print("Ingrese nombre del estudiante: ");
                        nombres[cantidad] = sc.nextLine();

                        System.out.print("Ingrese nota del estudiante: ");
                        double nota = sc.nextDouble();
                        while (nota < 0 || nota > 10) {
                            System.out.print("Nota inválida. Ingrese una nota entre 0 y 10: ");
                            nota = sc.nextDouble();
                        }
                        notas[cantidad] = nota;
                        cantidad++;

                        System.out.println(" Estudiante registrado con éxito.");
                    } else {
                        System.out.println(" No se pueden agregar más estudiantes (máx. 10).");
                    }
                    break;

                case 2: // Promedio general
                    if (cantidad == 0) {
                        System.out.println(" No hay estudiantes registrados.");
                    } else {
                        double suma = 0;
                        for (int i = 0; i < cantidad; i++) {
                            suma += notas[i];
                        }
                        double promedio = suma / cantidad;
                        String estado = (promedio >= 5) ? "APROBADO" : "SUSPENDIDO";

                        System.out.println(" Promedio general: " + promedio);
                        System.out.println("Calificación global: " + estado);
                    }
                    break;

                case 3: // Estadísticas
                    if (cantidad == 0) {
                        System.out.println("No hay estudiantes registrados.");
                    } else {
                        double max = notas[0];
                        double min = notas[0];
                        int aprobados = 0, suspensos = 0;

                        for (int i = 0; i < cantidad; i++) {
                            if (notas[i] > max) max = notas[i];
                            if (notas[i] < min) min = notas[i];
                            if (notas[i] >= 6) aprobados++;
                            else suspensos++;
                        }

                        System.out.println(" Estadísticas:");
                        System.out.println(" - Nota más alta: " + max);
                        System.out.println(" - Nota más baja: " + min);
                        System.out.println(" - Cantidad de aprobados (≥6): " + aprobados);
                        System.out.println(" - Cantidad de suspensos: " + suspensos);
                    }
                    break;

                case 4: // Buscar estudiante
                    if (cantidad == 0) {
                        System.out.println(" No hay estudiantes registrados.");
                    } else {
                        System.out.print("Ingrese el nombre a buscar: ");
                        String buscar = sc.nextLine();
                        boolean encontrado = false;

                        for (int i = 0; i < cantidad; i++) {
                            if (nombres[i].equalsIgnoreCase(buscar)) {
                                System.out.println(" Estudiante encontrado: " + nombres[i] + " - Nota: " + notas[i]);
                                encontrado = true;
                                break;
                            }
                        }

                        if (!encontrado) {
                            System.out.println(" Estudiante no encontrado.");
                        }
                    }
                    break;

                case 5:
                    System.out.println(" Saliendo del programa...");
                    break;

                default:
                    System.out.println(" Opción inválida, intente de nuevo.");
            }

        } while (opcion != 5);

        sc.close();
    }
}
