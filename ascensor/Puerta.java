package ascensor;
public class Puerta {
    private boolean abierta;

    public Puerta() {
        this.abierta = false;
    }

    public void abrir() {
        abierta = true;
        System.out.println("Puerta abierta.");
    }

    public void cerrar() {
        abierta = false;
        System.out.println("Puerta cerrada.");
    }

    public boolean isAbierta() {
        return abierta;
    }
}
