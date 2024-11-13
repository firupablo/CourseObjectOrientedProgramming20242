package ascensor;

public class Piso {
    private int numero;
    private BotonPiso botonSubida;
    private BotonPiso botonBajada;

    public Piso(int numero) {
        this.numero = numero;
        this.botonSubida = new BotonPiso("subida");
        this.botonBajada = new BotonPiso("bajada");
    }

    public int getNumero() {
        return numero;
    }

    public Boton getBotonSubida() {
        return botonSubida;
    }

    public Boton getBotonBajada() {
        return botonBajada;
    }
}
