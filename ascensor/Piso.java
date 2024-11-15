package ascensor;

public class Piso {
    private int numero;// número del piso
    private BotonPiso botonSubida;// botón de subida
    private BotonPiso botonBajada;// botón de bajada

    public Piso(int numero) {
        this.numero = numero;
        this.botonSubida = new BotonPiso("subida");
        this.botonBajada = new BotonPiso("bajada");
    }

    // Getters
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
