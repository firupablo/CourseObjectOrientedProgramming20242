package ascensor;

public abstract class Boton {
    private String tipo; // "subida", "bajada", o "seleccion de piso"
    private boolean iluminado; // true si el botón está iluminado
    private boolean sonido; // true si el botón emite un sonido

    public Boton(String tipo) {
        this.tipo = tipo;
        this.iluminado = false;
        this.sonido = false;
    }

    // Método que se ejecuta cuando se presiona el botón
    public void presionar() {
        iluminado = true;
        sonido = true;
        System.out.println("Botón de " + tipo + " presionado, 'sonidito'..iluminado");
        sonido = false;
    }

    // Método que se ejecuta cuando se apaga el botón
    public void apagar() {
        iluminado = false;

    }

    // Getters
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
