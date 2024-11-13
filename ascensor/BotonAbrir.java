package ascensor;

public class BotonAbrir extends Boton {

    private boolean abrir;


    public BotonAbrir(boolean abrir) {
        super("tiempo extra");
        this.abrir = abrir;
    }

    public void presionar() {
        abrir = true;
        System.out.println("Botón de " + getTipo() + " presionado, 'sonidito'..iluminado......apagado");
        abrir = false;

    }

    public boolean isAbrir() {
        return abrir;
    }
    
}
