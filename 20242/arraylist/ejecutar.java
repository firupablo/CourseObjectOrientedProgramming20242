package arraylist;
import java.util.ArrayList;
import java.util.Date;

public class ejecutar {
    
    public static void main(String[] args) {
        // Crear una lista de pedidos
        ArrayList<pedido> pedidos = new ArrayList<>();

        // Crear clientes
        cliente cliente1 = crearCliente("987654321", "Ana Gómez");
        cliente cliente2 = crearCliente("123456789", "Juan Pérez");
        cliente cliente3 = crearCliente("456789123", "María López");

        // Crear pedidos para los clientes
        pedidos.add(crearPedido(cliente1, new Date(), 123456789));
        pedidos.add(crearPedido(cliente2, new Date(), 987654321));
        pedidos.add(crearPedido(cliente3, new Date(), 456789123));

        // Crear y añadir productos a los pedidos
        for (pedido pedido : pedidos) {
            // Crear una impresión con fotos
            Impresion impresion = crearImpresion(pedidos.indexOf(pedido) + 101, "Color");
            agregarFotoAImpresion(impresion, "foto1.jpg");
            agregarFotoAImpresion(impresion, "foto2.jpg");
            agregarProductoAlPedido(pedido, impresion);

            // Crear una cámara diferente para cada pedido
            camara camara;
            if (pedido.getCliente().getNombre().equals("Ana Gómez")) {
            camara = crearCamara(202, "Nikon", "D3500");
            } else if (pedido.getCliente().getNombre().equals("Juan Pérez")) {
            camara = crearCamara(203, "Canon", "EOS Rebel T7");
            } else {
            camara = crearCamara(204, "Sony", "Alpha a6000");
            }
            agregarProductoAlPedido(pedido, camara);
        }

        // Mostrar detalles de todos los pedidos
        for (pedido pedido : pedidos) {
            mostrarDetallesPedido(pedido);
        }
    }

    // Método para crear un cliente
    public static cliente crearCliente(String cedula, String nombre) {
        cliente cliente = new cliente(cedula, nombre);
        System.out.println("Cliente creado: " + nombre);
        return cliente;
    }

    // Método para crear un pedido
    public static pedido crearPedido(cliente cliente, Date fecha, int numeroTarjetaCredito) {
        pedido pedido = new pedido(cliente, fecha, numeroTarjetaCredito);
        System.out.println("Pedido creado para el cliente: " + cliente.getNombre());
        return pedido;
    }

    // Método para crear una impresión
    public static Impresion crearImpresion(int numero, String color) {
        producto impresion = new Impresion(numero, color);
        System.out.println("Impresión creada: Número " + numero + ", Color " + color);
        return (Impresion) impresion;   
    }

    // Método para agregar una foto a una impresión
    public static void agregarFotoAImpresion(Impresion impresion, String fichero) {
        foto foto = new foto(fichero);
        impresion.addFoto(foto);
        System.out.println("Foto agregada a la impresión: " + fichero);
    }

    // Método para crear una cámara
    public static camara crearCamara(int numero, String marca, String modelo) {
        producto camara = new camara(numero, marca, modelo);
        System.out.println("Cámara creada: Marca " + marca + ", Modelo " + modelo);
        return (camara) camara;
    }

    // Método para agregar un producto (Impresión o Cámara) al pedido
    public static void agregarProductoAlPedido(pedido pedido, producto producto) {
        pedido.addProducto(producto);
        System.out.println("Producto agregado al pedido: Número " + producto.getNumero());
    }

    // Método para mostrar los detalles del pedido
    public static void mostrarDetallesPedido(pedido pedido) {
        System.out.println("\nDetalles del Pedido:");
        System.out.println("Cliente: " + pedido.getCliente().getNombre());
        System.out.println("Fecha: " + pedido.getFecha());
        System.out.println("Número de tarjeta de crédito: " + pedido.getNumeroTarjetaCredito());
        System.out.println("Productos en el pedido:");
        
        for (producto producto : pedido.getProductos()) {
            if (producto instanceof Impresion) {
                Impresion impresion = (Impresion) producto;
                System.out.println("- Impresión (Número: " + impresion.getNumero() + ", Color: " + impresion.getColor() + ")");
                for (foto foto : impresion.getFotos()) {
                    System.out.println("  * Foto: " + foto);
                }
            } else if (producto instanceof camara) {
                camara camara = (camara) producto;
                System.out.println("- Cámara (Número: " + camara.getNumero() + ", Marca: " + camara.getMarca() + ", Modelo: " + camara.getModelo() + ")");
            }
        }
    }
}
