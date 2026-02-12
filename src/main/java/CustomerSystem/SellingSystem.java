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
    // Customer Atributes
    static int idCustomer;
    static String nameCustomer;
    static String apellido;
    static String direccion;
    static long telefono;
    static String correo;
    static int actualizarProducto;
    static int eliminarProducto;
    static int actualizarDatos;
    static int eliminarDatos;
    static int nuevaId;

    // Aquí comienza a leer y ejecutar el codigo debido al Main
    // Aquí coloco las funciones que se ejecutaran con la clase SellingSystem
    public static void main(String[] args) {

        createProducts();
        getProducts();
        System.out.println("¿Desea actualizar su producto? 1. Sí / 2. No");
        actualizarProducto = sc.nextInt();
        if (actualizarProducto == 1){
            System.out.println("Ingrese el ID del producto que desea actualizar: ");
            int id = sc.nextInt();
            sc.nextLine();
            updateProducts(id);
        } else if (actualizarProducto == 2){
            System.out.println("Okay");
        } else {
            System.out.println("Por favor ingrese un valor numerico");
        }

        System.out.println("¿Desea eliminar un producto? 1. Sí / 2. No");
        eliminarProducto = sc.nextInt();
        if (eliminarProducto == 1){
            System.out.println("Ingrese el ID que desea eliminar");
            id = sc.nextInt();

            if (nuevaId == id) {
                deleteProduct(id);
            } else {
                System.out.println("ID no encontrado");
            }

        } else if (eliminarProducto == 2) {
            System.out.println("Okay");
        } else {
            System.out.println("Por favor ingrese un valor Numerico");
        }

        createCustomers();
        getCustomers();
        System.out.println("¿Desea actualizar los datos del cliente?");
        actualizarDatos = sc.nextInt();
        if (actualizarDatos == 1){
            System.out.println("Ingrese el ID del Cliente a actualizar:");
            idCustomer = sc.nextInt();
            sc.nextLine();
            updateCustomers(idCustomer);
        } else if (actualizarDatos == 2) {
            System.out.println("Okay");
        } else {
            System.out.println("Por favor ingrese un valor Numerico");
        }

        System.out.println("¿Desea eliminar los datos del cliente?");
        eliminarDatos = sc.nextInt();
        if (eliminarDatos == 1){
            System.out.println("Ingrese el ID del Cliente a eliminar");
            idCustomer = sc.nextInt();
            sc.nextLine();
            deleteCustomers(idCustomer);
        } else if (eliminarDatos == 2) {
            System.out.println("Okay");
        } else {
            System.out.println("Por favor Ingrese un valor numerico");
        }

    }

    // Metodo Crear productos
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
            state =sc.nextBoolean();
        }

        // Metodo de Mostrar productos
        public static void getProducts(){

            System.out.println("ID: " + id + "\n" +
                    "Description: " + description + "\n" +
                    "Price: " + price + "\n" +
                    "Quantity " + quantity + "\n" +
                    "State: " + state + "\n");
        }

        // Metodo de Actualizar productos
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

    // Metodo de Eliminar productos
    public static void deleteProduct(int deleteId){

        if (deleteId == id){
            System.out.println(
                    "            id = 0; \n" +
                    "            description = \" \";\n" +
                    "            price = 0.0;\n" +
                    "            quantity = 0;\n" +
                    "            state = false);");

            System.out.println("El ID fue eliminado Correctamente");
        } else {
            System.out.println( "ID: " + id + " no encontrado");
        }
    }



    // CLIENTES



    // Metodo Crear clientes
    public static void createCustomers(){

        System.out.println("CREAR CLIENTE");
        System.out.println("Ingrese el ID del Cliente");
        idCustomer = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese el Nombre");
        nameCustomer = sc.nextLine();
        System.out.println("Ingrese el apellido");
        apellido = sc.nextLine();
        System.out.println("Ingrese la dirección de residencia");
        direccion = sc.nextLine();
        System.out.println("Ingrese el numero de telefono");
        telefono = sc.nextLong();
        sc.nextLine();
        System.out.println("Ingrese su correo electronico");
        correo = sc.nextLine();
    }

    // Metodo Mostrar clientes
    public static void getCustomers(){
        System.out.println("ID Cliente: " + idCustomer + "\n" +
                "Nombre: " + nameCustomer + "\n" +
                "Apellido: " + apellido + "\n" +
                "Dirección: " + direccion + "\n" +
                "Telefono: " + telefono + "\n" +
                "Correo: " + correo + "\n");
    }

    // Metodo Actualizar Clientes
    public static void updateCustomers(int findIdCustomers){

        if (findIdCustomers == idCustomer){
            System.out.println("Ingrese el ID del cliente:");
            idCustomer = sc.nextInt();
            sc.nextLine();
            System.out.println("Ingrese el nombre: ");
            nameCustomer = sc.nextLine();
            System.out.println("Ingrese el apellido:");
            apellido = sc.nextLine();
            System.out.println("Ingrese la dirección de residencia:");
            direccion = sc.nextLine();
            System.out.println("Ingrese el telefono: ");
            telefono = sc.nextLong();
            sc.nextLine();
            System.out.println("Ingrese el correo electronico: ");
            correo = sc.nextLine();

        }else {
            System.out.println("No se encontró el ID del cliente");
        }
    }

    // Metodo Eliminar clientes
    public static void deleteCustomers(int deleteIdCustomers){

        if (deleteIdCustomers == idCustomer){
            System.out.println(
                            "            ID Cliente  \n" +
                            "            Nombre  \n" +
                            "            Apellido  \n" +
                            "            Dirección  \n" +
                            "            Telefono  \n" +
                            "            Correo  ");
            System.out.println("ID del Cliente eliminada exitosamente ");

        } else {
            System.out.println( "ID Cliente : " + id + " no encontrado");
        }

    }
    
}
