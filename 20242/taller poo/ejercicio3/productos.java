package ejercicio3;

public class productos {
    private String nombre;
    private int cantidad;
    private int precio;

    public productos(String nombre, int cantidad, int precio) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
    }


    public String añadir(int monto) {
        cantidad += monto;
        return "Se añadieron " + monto + " unidades de " + nombre;
    }

    public String quitar(int monto) {
        if (cantidad >= monto) {
            cantidad -= monto;
            return "Se quitaron " + monto + " unidades de " + nombre;
        } else {
            return "No hay suficientes unidades de " + nombre;
        }
    }

    public int valorTotal() {
        int total = cantidad * precio;
        return total;
    }
    
}
