package arraylistScanner;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class ejecutar {

    public static void main(String[] args) {
        // Crear una lista de pedidos
        ArrayList<pedido> pedidos = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite el numero de pedidos a realizar: ");
        int numPedidos = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < numPedidos; i++) {
            System.out.println("Digite el nombre del cliente" + (i + 1) + ": ");
            String nombre = sc.nextLine();
            System.out.println("Digite la cedula del cliente: ");
            String cedula = sc.nextLine();
            cliente cliente = crearCliente(cedula, nombre);
            System.out.println("Digite el numero de tarjeta de credito: ");
            String numeroTarjetaCredito = sc.nextLine();
            pedidos.add(crearPedido(cliente, new Date(), numeroTarjetaCredito));
        }

        // Crear y añadir productos a los pedidos
        for (int j = 0; j < numPedidos; j++) {
            System.out.println("con que camara desea tomar las fotos del pedido" + (j + 1) + " (1) (2) (3):  ");
            System.out.println("\n1. Canon    2. Nikon      3. Sony");
            int camaran = sc.nextInt();
            camara camara;
            if (camaran == 1) {
                camara = crearCamara(202, "Canon", "EOS Rebel T7");
            } else if (camaran == 2) {
                camara = crearCamara(203, "Nikon", "D3500");
            } else {
                camara = crearCamara(204, "Sony", "Alpha a6000");
            }
            agregarProductoAlPedido(pedidos.get(j), camara);
            System.out.println("Digite el numero de fotos a agregar a la impresion del cliente "
                    + pedidos.get(j).getCliente().getNombre() + ": ");
            int numFotos = sc.nextInt();
            sc.nextLine();

            for (int k = 0; k < numFotos; k++) {
                System.out.println("Digite el nombre de la foto " + (k + 1) + ":");
                String nombreFoto = sc.nextLine();
                System.out.println("la desea a color(1) o blanco_negro(2):");
                int color = sc.nextInt();
                sc.nextLine();
                String colorFoto = color == 1 ? "Color" : "Blanco";
                Impresion impresion = crearImpresion(pedidos.indexOf(pedidos.get(j)) + 101, colorFoto);
                agregarFotoAImpresion(impresion, nombreFoto);
                agregarProductoAlPedido(pedidos.get(j), impresion);

            }

        }
        sc.close();

        // Mostrar detalles de todos los pedidos
        for (int i = 0; i < numPedidos; i++) {
            System.out.println("\nDetalles del pedido " + (i + 1) + ":");
            mostrarDetallesPedido(pedidos.get(i));
        }
    }

    // Método para crear un cliente
    public static cliente crearCliente(String cedula, String nombre) {
        cliente cliente = new cliente(cedula, nombre);
        System.out.println("Cliente creado: " + nombre);
        return cliente;
    }

    // Método para crear un pedido
    public static pedido crearPedido(cliente cliente, Date fecha, String numeroTarjetaCredito) {
        pedido pedido = new pedido(cliente, fecha, numeroTarjetaCredito);
        System.out.println("Pedido creado para el cliente: " + cliente.getNombre());
        return pedido;
    }

    // Método para crear una impresión
    public static Impresion crearImpresion(int numero, String color) {
        Impresion impresion = new Impresion(numero, color);
        System.out.println("Impresión creada: Número " + numero + ", Color " + color);
        return impresion;
    }

    // Método para agregar una foto a una impresión
    public static void agregarFotoAImpresion(Impresion impresion, String fichero) {
        foto foto = new foto(fichero);
        impresion.addFoto(foto);
        System.out.println("Foto agregada a la impresión: " + fichero);
    }

    // Método para crear una cámara
    public static camara crearCamara(int numero, String marca, String modelo) {
        camara camara = new camara(numero, marca, modelo);
        System.out.println("Cámara creada: Marca " + marca + ", Modelo " + modelo);
        return camara;
    }

    // Método para agregar un producto (Impresión o Cámara) al pedido
    public static void agregarProductoAlPedido(pedido pedido, producto producto) {
        pedido.addProducto(producto);
        System.out.println("Producto agregado al pedido: Número " + producto.getNumero());
    }

    // Método para mostrar los detalles del pedido
    public static void mostrarDetallesPedido(pedido pedido) {
        System.out.println("Cliente: " + pedido.getCliente().getNombre());
        System.out.println("Fecha: " + pedido.getFecha());
        System.out.println("Número de tarjeta de crédito: " + pedido.getNumeroTarjetaCredito());
        System.out.println("Productos en el pedido:");

        for (producto producto : pedido.getProductos()) {
            if (producto instanceof Impresion) {
                Impresion impresion = (Impresion) producto;
                System.out.println(
                        "- Impresión (Número: " + impresion.getNumero() + ", Color: " + impresion.getColor() + ")");
                for (foto foto : impresion.getFotos()) {
                    System.out.println("  * Foto: " + foto);
                }
            } else if (producto instanceof camara) {
                camara camara = (camara) producto;
                System.out.println("- Cámara (Número: " + camara.getNumero() + ", Marca: " + camara.getMarca()
                        + ", Modelo: " + camara.getModelo() + ")");
            }
        }

    }
}
