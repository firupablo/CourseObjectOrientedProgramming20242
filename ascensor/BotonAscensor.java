package ascensor;

public class BotonAscensor extends Boton {
    private int pisoDestino; // piso al que se dirige el ascensor

    public BotonAscensor(int pisoDestino) {
        super("ascensor");
        this.pisoDestino = pisoDestino;
    }

    // Método que se ejecuta al presionar el botón
    public void presionar() {
        super.presionar();
        System.out.println("Piso destino: " + pisoDestino);
    }

    // Método que se ejecuta al apagar el botón
    public void apagar() {
        super.apagar();
        System.out.println("Botón numero " + pisoDestino + " apagado");
    }

    // Getters
    public int getPisoDestino() {
        return pisoDestino;
    }

}
