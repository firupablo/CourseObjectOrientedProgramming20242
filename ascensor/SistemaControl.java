package ascensor;

import java.util.ArrayList;
import java.util.List;

public class SistemaControl {
    private Ascensor ascensor;
    private List<Piso> pisos;
    private List<Integer> solicitudes;
    private boolean obstaculoDetectado = false;
    private boolean botonEmergencia = false;
    private boolean puertasAbiertas = false;
    private Boton boton = new Boton("piso");
    private Boton botonsub = new Boton("subida");
    private Boton botonbaj = new Boton("bajada");

    public SistemaControl(int numPisos, int pisoInicial) {
        ascensor = new Ascensor(pisoInicial);
        pisos = new ArrayList<>();
        for (int i = 1; i <= numPisos; i++) {
            pisos.add(new Piso(i));
        }
        solicitudes = new ArrayList<>();
    }

    public void solicitarAscensor(int piso, String direccion) {
        if (!solicitudes.contains(piso)) { // Evita duplicados
            solicitudes.add(piso);
            if (direccion.equals("subida")) {
                botonsub.presionar();
            } else {
                botonbaj.presionar();
            }
            System.out.println("Solicitud registrada para el piso " + piso + " en dirección " + direccion);

        }
    }

    public void seleccionarPiso(int piso) {
        if (!solicitudes.contains(piso)) {
            solicitudes.add(piso);
            boton.presionar();
            System.out.println("Piso seleccionado: " + piso);
            System.out.println("Solicitud registrada para el piso " + piso);

        }
    }

    public void detectarObstaculo(boolean obstaculo) {
        obstaculoDetectado = obstaculo;
        if (obstaculoDetectado) {
            ascensor.abrirPuertas();
            puertasAbiertas = true;
            System.out.println(
                    "Obstáculo detectado. Las puertas permanecerán abiertas hasta que se elimine el obstáculo.");
        } else {
            puertasAbiertas = false;
            ascensor.cerrarPuertas();
            System.out.println("Obstáculo eliminado. Las puertas se cierran.");
        }
    }

    public void mantenerPuertasAbiertas() {
        puertasAbiertas = true;
        ascensor.abrirPuertas();
        System.out.println("Manteniendo puertas abiertas por tiempo adicional.");
        try {
            Thread.sleep(3000); // Mantiene las puertas abiertas por 5 segundos adicionales
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        puertasAbiertas = false;
        if (!obstaculoDetectado && !botonEmergencia) {
            ascensor.cerrarPuertas();
            System.out.println("Las puertas se cierran después del tiempo adicional.");
        }
    }

    public void activarBotonEmergencia() {
        botonEmergencia = true;
        ascensor.detenerAscensor();
        ascensor.abrirPuertas();
        puertasAbiertas = true;
        System.out.println("Botón de emergencia activado. El ascensor se detiene y las puertas se abren.");
    }

    public void desactivarBotonEmergencia() {
        botonEmergencia = false;
        puertasAbiertas = false;
        System.out.println("Botón de emergencia desactivado. El ascensor se reanuda.");
        ascensor.reanudarMovimiento();
        if (!obstaculoDetectado) {
            ascensor.cerrarPuertas();
        }
    }

    public void detectarFallas(String componente) {
        System.out.println("Falla detectada en: " + componente);
        activarBotonEmergencia();
    }

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
            if (botonEmergencia || obstaculoDetectado || puertasAbiertas) {
                System.out.println("Ascensor detenido debido a una condición de emergencia.");
                while (botonEmergencia || obstaculoDetectado || puertasAbiertas) {
                    try {
                        Thread.sleep(1000); // Espera 1 segundo antes de verificar nuevamente
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

    public void ejemploFuncionamiento() {
        System.out.println("Inicio del ejemplo de funcionamiento del sistema de control de ascensores.");

        solicitarAscensor(5, "subida");

        new Thread(() -> {
            try {
                Thread.sleep(2000); // Espera 2 segundos
                seleccionarPiso(3);

                Thread.sleep(4000); // Espera 2 segundos
                mantenerPuertasAbiertas();

                Thread.sleep(2000); // Espera 2 segundos
                solicitarAscensor(1, "bajada");

                Thread.sleep(4000); // Espera 2 segundos
                detectarObstaculo(true);

                Thread.sleep(2000); // Espera 2 segundos
                detectarObstaculo(false);

                Thread.sleep(2000); // Espera 2 segundos
                seleccionarPiso(2);

                Thread.sleep(4000); // Espera 2 segundos
                activarBotonEmergencia();

                Thread.sleep(1000); // Espera 2 segundos
                desactivarBotonEmergencia();

                procesarSolicitudes();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        procesarSolicitudes();

    }

    public static void main(String[] args) {
        SistemaControl sistemaControl = new SistemaControl(5, 1);
        sistemaControl.ejemploFuncionamiento();
    }
}