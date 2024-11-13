package ascensor;
public abstract class Boton {
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
        System.out.println("Botón de " + tipo + " presionado, 'sonidito'..iluminado");
        sonido = false;
    }

    public void apagar() {
        iluminado = false;

    }

    public String getTipo() {
        return tipo;
    }

    public boolean isIluminado() {
        return iluminado;
    }

    public boolean isSonido() {
        return sonido;
    }



}
