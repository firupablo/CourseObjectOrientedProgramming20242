package ascensor;

public class Piso {
    private int numero;
    private Boton botonSubida;
    private Boton botonBajada;

    public Piso(int numero) {
        this.numero = numero;
        this.botonSubida = new Boton("subida");
        this.botonBajada = new Boton("bajada");
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
