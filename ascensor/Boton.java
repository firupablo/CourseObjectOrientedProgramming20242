package ascensor;
public class Boton {
    private String tipo; // "subida", "bajada", o "seleccion de piso"
    private boolean iluminado;

    public Boton(String tipo) {
        this.tipo = tipo;
        this.iluminado = false;
    }

    public void presionar() {
        iluminado = true;
        System.out.println("Botón de " + tipo + " presionado, 'sonidito'..iluminado......apagado");

    }

    public boolean isIluminado() {
        return iluminado;
    }
}
