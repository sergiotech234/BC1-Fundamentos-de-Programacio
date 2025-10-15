import java.util.ArrayList;
import java.util.Scanner;

// Clase Producto con atributos básicos
class Producto {
    String nombre;
    String codigo;
    int cantidad;
    double precio;

    public Producto(String nombre, String codigo, int cantidad, double precio) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    // Método para mostrar el producto
    public String mostrar() {
        return "Código: " + codigo + ", Nombre: " + nombre + 
               ", Cantidad: " + cantidad + ", Precio: $" + precio;
    }

    // Método para calcular el valor total de este producto
    public double valorTotal() {
        return cantidad * precio;
    }
}

public class GestorInventario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Producto> inventario = new ArrayList<>();
        int opcion;

        do {
            System.out.println("\n--- GESTOR DE INVENTARIO SIMPLE ---");
            System.out.println("1. Agregar producto");
            System.out.println("2. Eliminar producto");
            System.out.println("3. Modificar producto");
            System.out.println("4. Mostrar inventario");
            System.out.println("5. Buscar producto");
            System.out.println("6. Valor total del inventario");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    agregarProducto(inventario, sc);
                    break;
                case 2:
                    eliminarProducto(inventario, sc);
                    break;
                case 3:
                    modificarProducto(inventario, sc);
                    break;
                case 4:
                    mostrarInventario(inventario);
                    break;
                case 5:
                    buscarProducto(inventario, sc);
                    break;
                case 6:
                    System.out.println("Valor total: $" + calcularValorTotal(inventario));
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 0);

        sc.close();
    }

    // Métodos simples para cada función
    public static void agregarProducto(ArrayList<Producto> inventario, Scanner sc) {
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Código: ");
        String codigo = sc.nextLine();
        System.out.print("Cantidad: ");
        int cantidad = sc.nextInt();
        System.out.print("Precio: ");
        double precio = sc.nextDouble();
        sc.nextLine(); // limpiar buffer

        inventario.add(new Producto(nombre, codigo, cantidad, precio));
        System.out.println("Producto agregado.");
    }

    public static void eliminarProducto(ArrayList<Producto> inventario, Scanner sc) {
        System.out.print("Código del producto a eliminar: ");
        String codigo = sc.nextLine();
        boolean encontrado = false;

        for (int i = 0; i < inventario.size(); i++) {
            if (inventario.get(i).codigo.equalsIgnoreCase(codigo)) {
                inventario.remove(i);
                System.out.println("Producto eliminado.");
                encontrado = true;
                break;
            }
        }
        if (!encontrado) System.out.println("Producto no encontrado.");
    }

    public static void modificarProducto(ArrayList<Producto> inventario, Scanner sc) {
        System.out.print("Código del producto a modificar: ");
        String codigo = sc.nextLine();

        for (Producto p : inventario) {
            if (p.codigo.equalsIgnoreCase(codigo)) {
                System.out.print("Nuevo nombre (" + p.nombre + "): ");
                String nombre = sc.nextLine();
                if (!nombre.isEmpty()) p.nombre = nombre;

                System.out.print("Nueva cantidad (" + p.cantidad + "): ");
                String cant = sc.nextLine();
                if (!cant.isEmpty()) p.cantidad = Integer.parseInt(cant);

                System.out.print("Nuevo precio (" + p.precio + "): ");
                String precio = sc.nextLine();
                if (!precio.isEmpty()) p.precio = Double.parseDouble(precio);

                System.out.println("Producto modificado.");
                return;
            }
        }
        System.out.println("Producto no encontrado.");
    }

    public static void mostrarInventario(ArrayList<Producto> inventario) {
        if (inventario.isEmpty()) {
            System.out.println("Inventario vacío.");
        } else {
            System.out.println("\n--- INVENTARIO ---");
            for (Producto p : inventario) {
                System.out.println(p.mostrar());
            }
        }
    }

    public static void buscarProducto(ArrayList<Producto> inventario, Scanner sc) {
        System.out.print("Introduce nombre o código: ");
        String busqueda = sc.nextLine();
        boolean encontrado = false;

        for (Producto p : inventario) {
            if (p.nombre.equalsIgnoreCase(busqueda) || p.codigo.equalsIgnoreCase(busqueda)) {
                System.out.println("Producto encontrado: " + p.mostrar());
                encontrado = true;
            }
        }
        if (!encontrado) System.out.println("No se encontró el producto.");
    }

    public static double calcularValorTotal(ArrayList<Producto> inventario) {
        double total = 0;
        for (Producto p : inventario) {
            total += p.valorTotal();
        }
        return total;
    }
}
