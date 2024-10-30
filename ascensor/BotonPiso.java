package ascensor;

public class BotonPiso extends Boton {
    private int numeroPiso;

    public BotonPiso(String tipo, String iluminado, int numeroPiso) {
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
        return "BotonPiso [numeroPiso=" + numeroPiso + "]";
    }
    
}
