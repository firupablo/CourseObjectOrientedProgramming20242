package ejercicio4;

public class Perfume {

    private String marca;
    private String nombre;
    private int precio;
    private double cantidad;

    public Perfume(String marca, String nombre, int precio, double cantidad) {
        this.marca = marca;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String aplicar() {
        if (this.cantidad >= 5) {
            this.cantidad -= 5;
            return "Se ha aplicado el perfume, resta un "+this.cantidad+"% de perfume";
        } else {
            return "el perfume se ha acabado";
        }
    }

    public String cambiarPrecio(int precio) {
        this.precio = precio;
        return "El precio de: "+this.nombre+" ha sido cambiado a "+precio;
    }

    public String consultarEstado() {
        return "El perfume '"+this.nombre+"', de la marca '"+this.marca+"', tiene un costo de: "+this.precio+"$ y tiene un "+this.cantidad+"% de perfume restante";
    }
    
}
