package ascensor;

public class Ascensor {
    private int pisoActual; // este es el piso en el que se encuentra el ascensor
    private String direccion; // direccion a la que se dirige el ascensor; "subiendo" o "bajando"
    private boolean puertasAbiertas; // indica si las puertas del ascensor están abiertas
    private boolean enMovimiento; // indica si el ascensor está en movimiento

    //constructor que recibe el piso inicial del ascensor

    public Ascensor(int pisoInicial) {
        this.pisoActual = pisoInicial;
        this.direccion = "subiendo";
        this.puertasAbiertas = false;
        this.enMovimiento = true;
    }


    //metodo para mover el ascensor al piso destino
    public void mover(int pisoDestino) {
        if (!enMovimiento) { // si el ascensor está detenido por emergencia
            System.out.println("Ascensor detenido por emergencia.");
            return;
        }
        // si el ascensor está en movimiento ajustar la dirección y el piso actual
        if (pisoDestino > pisoActual) {
            direccion = "subiendo";
        } else if (pisoDestino < pisoActual) {
            direccion = "bajando";
        }
        pisoActual = pisoDestino;
        System.out.println("Ascensor movido al piso " + pisoActual);
    }

    //metodos para abrir y cerrar las puertas del ascensor y detenerlo
    public void abrirPuertas() {
        puertasAbiertas = true;
        System.out.println("Puertas abiertas en el piso " + pisoActual);
    }

    public void cerrarPuertas() {
        puertasAbiertas = false;
        System.out.println("Puertas cerradas en el piso " + pisoActual);
    }

    public void detenerAscensor() {
        enMovimiento = false;
        abrirPuertas();
        System.out.println("Ascensor detenido en el piso " + pisoActual + " por activación de emergencia.");
    }

    public int getPisoActual() {
        return pisoActual;
    }

    public int getPisoDestino() {
        return pisoActual;
    }

    public String getDireccion() {
        return direccion;
    }

    public boolean arePuertasAbiertas() { 
        return puertasAbiertas;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public boolean isEnMovimiento() {
        return enMovimiento;
    }



    public void reanudarMovimiento() { //metodo para reanudar el movimiento del ascensor
        enMovimiento = true;
        System.out.println("Ascensor reanudado.");
    }
}
