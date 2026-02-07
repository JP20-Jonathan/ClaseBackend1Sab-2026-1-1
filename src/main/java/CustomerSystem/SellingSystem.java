package CustomerSystem;

import java.util.Scanner;

public class SellingSystem {

    static Scanner sc = new Scanner(System.in);

    // Product Atributes
    static int id;
    static String description;
    static double price;
    static int quantity;
    static boolean state;

    public static void main(String[] args) {
        createProducts();
        getProducts();
        int id = sc.nextInt();
        sc.nextLine();
        updateProducts(id);
    }
        // Class Methods
    // Metodo Crear
    public static void createProducts() {

            System.out.println("Ingrese el ID del producto");
            id = sc.nextInt();
            sc.nextLine();
            System.out.println("Ingrese el nombre del producto");
            description = sc.nextLine();
            System.out.println("Ingrese el precio del producto");
            price = sc.nextDouble();
            sc.nextLine();
            System.out.println("Ingrese la cantidad");
            quantity = sc.nextInt();
            sc.nextLine();
            System.out.println("Ingrese el estado del producto");
            sc.nextBoolean();
        }


        // Metodo de Mostrar
        public static void getProducts(){
            System.out.println("ID: " + id + "\n" +
                    "Description: " + description + "\n" +
                    "Price: " + price + "\n" +
                    "Quantity " + quantity + "\n" +
                    "State: " + state + "\n");
        }

        // Metodo de Actualizar
    public static void updateProducts(int findId) {

        if (findId == id) {
            System.out.println("Ingrese el ID del producto");
            id = sc.nextInt();
            sc.nextLine();
            System.out.println("Ingrese el nombre del producto");
            description = sc.nextLine();
            System.out.println("Ingrese el precio del producto");
            price = sc.nextDouble();
            sc.nextLine();
            System.out.println("Ingrese la cantidad");
            quantity = sc.nextInt();
            sc.nextLine();
            System.out.println("Ingrese el estado del producto");
            sc.nextBoolean();

        } else {
            System.out.println("Producto no encontrado");
        }
    }


    // Metodo de Eliminar
    public static void deleteProduct(int deleteId){
        if (deleteId == id){
            id = 0;
            description = " ";
            price = 0.0;
            quantity = 0;
            state = false;
        } else {
            System.out.println( "ID: " + id + "ID no encontrado");
        }
    }
    

    // Metodos Cliente
    
}
