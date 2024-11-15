package ascensor;

public class BotonAbrir extends Boton {

    private boolean abrir; // true si la puerta está abierta

    public BotonAbrir(boolean abrir) {
        super("tiempo extra");
        this.abrir = abrir;
    }

    // Método que se ejecuta al presionar el botón
    public void presionar() {
        abrir = true;
        System.out.println("Botón de " + getTipo() + " presionado, 'sonidito'..iluminado......apagado");
        abrir = false;

    }

    // Getters
    public boolean isAbrir() {
        return abrir;
    }

}
