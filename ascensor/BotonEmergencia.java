package ascensor;

public class BotonEmergencia extends Boton {
    private boolean emergencia;

    public BotonEmergencia(boolean emergencia) {
        super("piso");
        this.emergencia = emergencia;
    }

    public void presionar() {
        emergencia = true;
        System.out.println("Botón de emergencia presionado, 'sonidito'..iluminado......apagado");
        emergencia = false;
    }

    public boolean getEmergencia() {
        return emergencia;
    }

    public void setEmergencia(boolean emergencia) {
        this.emergencia = emergencia;
    }

    
    
}
