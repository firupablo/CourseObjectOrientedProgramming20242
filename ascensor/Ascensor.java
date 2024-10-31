package ascensor;

public class Ascensor {
    private int pisoActual;
    private String direccion; // "subiendo" o "bajando"
    private boolean puertasAbiertas;
    private boolean enMovimiento;

    public Ascensor(int pisoInicial) {
        this.pisoActual = pisoInicial;
        this.direccion = "subiendo";
        this.puertasAbiertas = false;
        this.enMovimiento = true;
    }

    public void mover(int pisoDestino) {
        if (!enMovimiento) {
            System.out.println("Ascensor detenido por emergencia.");
            return;
        }

        if (pisoDestino > pisoActual) {
            direccion = "subiendo";
        } else if (pisoDestino < pisoActual) {
            direccion = "bajando";
        }
        pisoActual = pisoDestino;
        System.out.println("Ascensor movido al piso " + pisoActual);
    }

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

    public void reanudarMovimiento() {
        enMovimiento = true;
        System.out.println("Ascensor reanudado.");
    }
}
