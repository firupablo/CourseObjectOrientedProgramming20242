package ascensor;

public class BotonAscensor extends Boton {
    private int pisoDestino;

    public BotonAscensor(int pisoDestino) {
        super("ascensor");
        this.pisoDestino = pisoDestino;
    }

    public void presionar() {
        super.presionar();
        System.out.println("Piso destino: " + pisoDestino);
    }

    public void apagar() {
        super.apagar();
        System.out.println("Botón numero "+pisoDestino+" apagado");
    }

    public int getPisoDestino() {
        return pisoDestino;
    }

    
}
