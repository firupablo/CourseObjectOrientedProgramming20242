package ascensor;

public class Boton {
    private String tipo;
    private String iluminado;

    public Boton(String tipo, String iluminado) {
        this.tipo = tipo;
        this.iluminado = iluminado;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getIluminado() {
        return iluminado;
    }

    public void setIluminado(String iluminado) {
        this.iluminado = iluminado;
    }

    @Override
    public String toString() {
        return "Boton [tipo=" + tipo + ", iluminado=" + iluminado + "]";
    }
    
    public void activar(){
        System.out.println("El boton se ha activado");
        iluminado = "encendido";
        System.out.println("El boton esta " + iluminado + " sonido de timbre");
        try {
            Thread.sleep(2000); // Espera 2 segundos
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        iluminado = "el boton esta apagado";
    }


}
