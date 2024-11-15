package ascensor;

import java.util.ArrayList;
import java.util.List;

/**
 * La clase SistemaControl gestiona el funcionamiento del ascensor, incluyendo
 * la gestión de solicitudes de pisos, detección de obstáculos y manejo de
 * emergencias.
 */
public class SistemaControl {
    private Ascensor ascensor;
    private List<Piso> pisos;
    private List<Integer> solicitudes;
    private List<BotonAscensor> botonAscensor;
    private boolean obstaculoDetectado = false;
    private boolean puertasAbiertas = false;
    private Boton botonSubida = new BotonPiso("subida");
    private Boton botonBajada = new BotonPiso("bajada");
    private Boton BotonEmergencia = new BotonEmergencia(false);
    private Boton BotonAbrir = new BotonAbrir(false);

    /**
     * Constructor de la clase SistemaControl.
     * 
     * Número de pisos que tiene el edificio.
     * Piso inicial en el que se encuentra el ascensor.
     * tambien se crean los botones del ascensor
     */
    public SistemaControl(int numPisos, int pisoInicial) {
        ascensor = new Ascensor(pisoInicial);
        pisos = new ArrayList<>();
        botonAscensor = new ArrayList<>();
        for (int i = 1; i <= numPisos; i++) {
            pisos.add(new Piso(i));
            botonAscensor.add(new BotonAscensor(i));
        }
        solicitudes = new ArrayList<>();
    }

    /**
     * Solicita el ascensor para un piso específico en una dirección dada.
     * 
     * El piso desde donde se solicita el ascensor.
     * La dirección en la que se desea ir ("subida" o "bajada").
     */
    public void solicitarAscensor(int piso, String direccion) {
        if (!solicitudes.contains(piso)) { // Evita duplicados
            solicitudes.add(piso);
            if (direccion.equals("subida")) {
                botonSubida.presionar();
            } else {
                botonBajada.presionar();
            }
            System.out.println("Solicitud registrada para el piso " + piso + " en dirección " + direccion);
        }
    }

    /**
     * Selecciona un piso específico desde dentro del ascensor.
     * 
     * El piso que se desea seleccionar.
     */
    public void seleccionarPiso(int piso) {
        if (!solicitudes.contains(piso)) {
            solicitudes.add(piso);
            botonAscensor.get(piso - 1).presionar();
            System.out.println("Piso seleccionado: " + piso);
            System.out.println("Solicitud registrada para el piso " + piso);
        }
    }

    /**
     * Detecta un obstáculo en la puerta del ascensor.
     * 
     * Indica si hay un obstáculo (true) o no (false).
     */
    public void detectarObstaculo(boolean obstaculo) {
        obstaculoDetectado = obstaculo;
        if (obstaculoDetectado) {
            ascensor.abrirPuertas();
            puertasAbiertas = true;
            System.out.println("Obstáculo detectado. Las puertas permanecerán abiertas hasta que se elimine el obstáculo.");
        } else {
            puertasAbiertas = false;
            ascensor.cerrarPuertas();
            System.out.println("Obstáculo eliminado. Las puertas se cierran.");
        }
    }

    /**
     * Mantiene las puertas del ascensor abiertas por un tiempo adicional.
     */
    public void mantenerPuertasAbiertas() {
        BotonAbrir.presionar();
        if (ascensor.getPisoActual() == ascensor.getPisoDestino()) {
            System.out.println("Para abrir las puertas el ascensor debe estar en el piso destino");
            return;
        } else {
            puertasAbiertas = true;
            ascensor.abrirPuertas();
            System.out.println("Manteniendo puertas abiertas por tiempo adicional.");
            try {
                Thread.sleep(3000); // Mantiene las puertas abiertas por 3 segundos adicionales
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            puertasAbiertas = false;
            if (!obstaculoDetectado && !((BotonEmergencia) BotonEmergencia).getEmergencia()) {
                System.out.println("Las puertas se cierran después del tiempo adicional.");
                ascensor.cerrarPuertas();
            }
        }
    }

    /**
     * Activa el botón de emergencia, deteniendo el ascensor y abriendo las puertas.
     */
    public void activarBotonEmergencia() {
        BotonEmergencia.presionar();
        ascensor.detenerAscensor();
        ascensor.abrirPuertas();
        puertasAbiertas = true;
        System.out.println("Botón de emergencia activado. El ascensor se detiene y las puertas se abren.");
    }

    /**
     * Desactiva el botón de emergencia, reanudando el movimiento del ascensor.
     */
    public void desactivarBotonEmergencia() {
        ((BotonEmergencia) BotonEmergencia).setEmergencia(false);
        puertasAbiertas = false;
        System.out.println("Botón de emergencia desactivado. El ascensor se reanuda.");
        ascensor.reanudarMovimiento();
        if (!obstaculoDetectado) {
            ascensor.cerrarPuertas();
        }
    }

    /**
     * Detecta fallas en un componente específico del ascensor.
     * 
     * El componente en el que se ha detectado la falla.
     */
    public void detectarFallas(String componente) {
        System.out.println("Falla detectada en: " + componente);
        activarBotonEmergencia();
    }

    /**
     * Procesa las solicitudes de pisos pendientes.
     */
    public void procesarSolicitudes() {
        while (!solicitudes.isEmpty()) {
            int pisoActual = ascensor.getPisoActual();
            String direccion = ascensor.getDireccion();
            Integer destino = encontrarProximoDestino(pisoActual, direccion);
            if (destino != null) {
                moverAscensor(destino);
            } else {
                direccion = direccion.equals("subiendo") ? "bajando" : "subiendo";
                ascensor.setDireccion(direccion);
                System.out.println("Cambiando dirección a " + direccion);
            }
        }
        System.out.println("No quedan solicitudes pendientes.");
    }

    /**
     * Encuentra el próximo destino del ascensor basado en las solicitudes y la dirección actual.
     * 
     * El piso actual del ascensor.
     * La dirección actual del ascensor ("subiendo" o "bajando").
     * El próximo piso destino, o null si no hay solicitudes en esa dirección.
     */
    private Integer encontrarProximoDestino(int pisoActual, String direccion) {
        if (direccion.equals("subiendo")) {
            for (int solicitud : solicitudes) {
                if (solicitud > pisoActual) {
                    return solicitud;
                }
            }
        } else {
            for (int solicitud : solicitudes) {
                if (solicitud < pisoActual) {
                    return solicitud;
                }
            }
        }
        return null;
    }

    /**
     * Mueve el ascensor al piso destino.
     * 
     * El piso destino al que se desea mover el ascensor.
     */
    private void moverAscensor(int destino) {
        int pisoActual = ascensor.getPisoActual();
        String direccion = ascensor.getDireccion();
        if (pisoActual < destino) {
            direccion = "subiendo";
        } else if (pisoActual > destino) {
            direccion = "bajando";
        }
        ascensor.setDireccion(direccion);
        while (pisoActual != destino) {
            if (((BotonEmergencia) BotonEmergencia).getEmergencia() || obstaculoDetectado || puertasAbiertas) {
                System.out.println("Ascensor detenido debido a una condición de emergencia.");
                while (((BotonEmergencia) BotonEmergencia).getEmergencia() || obstaculoDetectado || puertasAbiertas) {
                    try {
                        Thread.sleep(1500); // Espera 1.5 segundos antes de verificar nuevamente
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("Condición de emergencia resuelta. Ascensor reanudando movimiento.");
            }
            if (direccion.equals("subiendo")) {
                pisoActual++;
            } else {
                pisoActual--;
            }
            ascensor.mover(pisoActual);
            System.out.println("Ascensor en piso " + pisoActual);
            if (solicitudes.contains(pisoActual)) {
                ascensor.abrirPuertas();
                puertasAbiertas = true;
                System.out.println("Ascensor detenido en el piso " + pisoActual + " para atender solicitud.");
                solicitudes.remove((Integer) pisoActual);
                botonAscensor.get(pisoActual - 1).apagar();
                ascensor.cerrarPuertas();
                puertasAbiertas = false;
            }
            pisoActual = ascensor.getPisoActual();
            try {
                Thread.sleep(1000); // Espera 1 segundo antes de moverse al siguiente piso
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * Ejemplo de funcionamiento del sistema de control de ascensores.
     */
    public void ejemploFuncionamiento() {
        System.out.println("Inicio del ejemplo de funcionamiento del sistema de control de ascensores.");
        solicitarAscensor(8, "subida");
        new Thread(() -> {
            try {
                Thread.sleep(1000); // Espera 1 segundo
                seleccionarPiso(4);
                Thread.sleep(4000); // Espera 4 segundos
                mantenerPuertasAbiertas();
                Thread.sleep(2000); // Espera 2 segundos
                solicitarAscensor(10, "bajada");
                Thread.sleep(4000); // Espera 4 segundos
                detectarObstaculo(true);
                Thread.sleep(2000); // Espera 2 segundos
                detectarObstaculo(false);
                Thread.sleep(2000); // Espera 2 segundos
                seleccionarPiso(2);
                Thread.sleep(4000); // Espera 4 segundos
                activarBotonEmergencia();
                Thread.sleep(1000); // Espera 1 segundo
                desactivarBotonEmergencia();
                Thread.sleep(2000); // Espera 2 segundos
                seleccionarPiso(5);
                procesarSolicitudes();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
        procesarSolicitudes();
    }

    /**
     * Método principal para ejecutar el ejemplo de funcionamiento del sistema de control de ascensores.
     */
    public static void main(String[] args) {
        SistemaControl sistemaControl = new SistemaControl(10, 1);
        sistemaControl.ejemploFuncionamiento();
    }
}