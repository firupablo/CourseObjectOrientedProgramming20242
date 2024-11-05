package ascensor;
public class Boton {
    private String tipo; // "subida", "bajada", o "seleccion de piso"
    private boolean iluminado;
    private boolean sonido;

    public Boton(String tipo) {
        this.tipo = tipo;
        this.iluminado = false;
        this.sonido = false;
    }

    public void presionar() {
        iluminado = true;
        sonido = true;
        System.out.println("Botón de " + tipo + " presionado, 'sonidito'..iluminado......apagado");
        iluminado = false;
        sonido = false;

    }

    public String getTipo() {
        return tipo;
    }

}
