package ascensor;

public class Puerta {
    private String estado;

    public Puerta(String estado) {
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Puerta [estado=" + estado + "]";
    }

    public void abrir() {
        System.out.println("La puerta se abre");
        estado = "abierta";
    }

    public void cerrar() {
        System.out.println("La puerta se cierra");
        estado = "cerrada";
    }

    public void detectarObstaculo() {
        System.out.println("la puerta detecta un obstaculo");
        estado = "abierta";
    }

    public void mantenerAbierta() {
        System.out.println("La puerta se mantiene abierta");
        estado = "abierta";
    }   
}
