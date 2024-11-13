package ascensor;

public class BotonPiso extends Boton {
    private String direccion;

    public BotonPiso(String direccion) {
        super("piso");
        this.direccion = direccion;
    }

    public String getPisoDestino() {
        return direccion;
    }
    
}
