package ascensor;

public class BotonAscensor extends Boton {
    private int numeroPiso;

    public BotonAscensor(String tipo, String iluminado, int numeroPiso) {
        super(tipo, iluminado);
        this.numeroPiso = numeroPiso;
    }

    public int getNumeroPiso() {
        return numeroPiso;
    }

    public void setNumeroPiso(int numeroPiso) {
        this.numeroPiso = numeroPiso;
    }

    @Override
    public String toString() {
        return "BotonAscensor [numeroPiso=" + numeroPiso + "]";
    }
    
}
