package ascensor;

public class BotonPiso extends Boton {
    private String direccion;// subida o bajada

    public BotonPiso(String direccion) {
        super("piso");
        this.direccion = direccion;
    }

    // Método que se ejecuta al presionar el botón
    public String getPisoDestino() {
        return direccion;
    }

}
