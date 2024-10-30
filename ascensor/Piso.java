package ascensor;

public class Piso {
    private int numeroPiso;
    private int solicitudes;

    public Piso(int numeroPiso, int solicitudes) {
        this.numeroPiso = numeroPiso;
        this.solicitudes = solicitudes;
    }

    public int getNumeroPiso() {
        return numeroPiso;
    }

    public void setNumeroPiso(int numeroPiso) {
        this.numeroPiso = numeroPiso;
    }

    public int getSolicitudes() {
        return solicitudes;
    }

    public void setSolicitudes(int solicitudes) {
        this.solicitudes = solicitudes;
    }

    @Override
    public String toString() {
        return "Piso [numeroPiso=" + numeroPiso + ", solicitudes=" + solicitudes + "]";
    }

    public void solicitarAscensor(String direccion) {
        System.out.println("El piso " + numeroPiso + " solicita un ascensor hacia " + direccion);
        solicitudes++;
    }
}
