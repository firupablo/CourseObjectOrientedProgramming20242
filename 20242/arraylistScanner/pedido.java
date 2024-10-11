package arraylistScanner;
import java.util.Date;
import java.util.ArrayList;

public class pedido {
    private cliente cliente;
    private ArrayList<producto> productos;
    private Date fecha;
    private String numeroTarjetaCredito;

    public pedido(cliente cliente, Date fecha, String numeroTarjetaCredito) {
        this.cliente = cliente;
        this.fecha = fecha;
        this.numeroTarjetaCredito = numeroTarjetaCredito;
        this.productos = new ArrayList<>();
    }

    public void addProducto(producto producto) {
        this.productos.add(producto);
    }

    public cliente getCliente() {
        return cliente;
    }

    public void setCliente(cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<producto> productos) {
        this.productos = productos;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getNumeroTarjetaCredito() {
        return numeroTarjetaCredito;
    }

    public void setNumeroTarjetaCredito(String numeroTarjetaCredito) {
        this.numeroTarjetaCredito = numeroTarjetaCredito;
    }

    
    
}
