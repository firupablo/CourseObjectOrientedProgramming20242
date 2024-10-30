package ascensor;

public class Ascensor  {
    private String estado;
    private String direccion;  
    private int pisoActual;

    public Ascensor(String estado, String dirrecion, int pisoActual) {
        this.estado = estado;
        this.direccion = dirrecion;
        this.pisoActual = pisoActual;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getPisoActual() {
        return pisoActual;
    }

    public void setPisoActual(int pisoActual) {
        this.pisoActual = pisoActual;
    }

    @Override
    public String toString() {
        return "Ascensor [estado=" + estado + ", direccion=" + direccion + ", pisoActual=" + pisoActual + "]";
    }

    public void mover(int pisoDestino) {
        System.out.println("El ascensor se mueve hacia el piso " + pisoDestino);
        estado = "moviendose";
        if (pisoDestino > pisoActual) {
            direccion = "arriba";
        } else {
            direccion = "abajo";
        }
        pisoActual = pisoDestino;
        
    }

    public void detener() {
        System.out.println("El ascensor se detiene");
        estado = "detenido";
    }

    public void cambiarDireccion() {
        if (direccion.equals("arriba")) {
            direccion = "abajo";
        } else {
            direccion = "arriba";
        }
    }

    
}