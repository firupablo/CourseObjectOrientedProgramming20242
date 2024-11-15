package ascensor;

public class Puerta {
    private boolean abierta;// true si la puerta está abierta

    public Puerta() {
        this.abierta = false;
    }

    // Método para abrir la puerta
    public void abrir() {
        abierta = true;
        System.out.println("Puerta abierta.");
    }

    // Método para cerrar la puerta
    public void cerrar() {
        abierta = false;
        System.out.println("Puerta cerrada.");
    }

    // Getters
    public boolean isAbierta() {
        return abierta;
    }
}
