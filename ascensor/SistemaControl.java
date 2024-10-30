package ascensor;
import java.util.ArrayList;


public class SistemaControl {
    
    private Ascensor ascensor;
    private Puerta puerta;
    private ArrayList<BotonAscensor> botonesAscensor;
    private ArrayList<Piso> pisos;
    private ArrayList<BotonPiso> botonesPiso;

    //iniciar sistema :)
    public void iniciarSistema(){
        System.out.println("Sistema de control iniciado");

        //instanciar ascensor
        ascensor = new Ascensor("detenido", "arriba", 1);
        System.out.println(ascensor.toString());

        //instanciar puerta
        puerta = new Puerta("cerrada");
        System.out.println(puerta.toString());

        //instanciar botones del ascensor
        botonesAscensor = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            BotonAscensor botonAscensorn = new BotonAscensor("piso", "apagado", i);//botones de los pisos
            botonesAscensor.add(botonAscensorn);
            System.out.println(botonAscensorn.toString());
        }

        int numeroPiso = ascensor.getPisoActual(); //numero de piso actual

        BotonAscensor botonAscensore = new BotonAscensor("emergencia", "apagado", numeroPiso); //boton de emergencia
        botonesAscensor.add(botonAscensore);
        System.out.println(botonAscensore.toString());

        BotonAscensor botonAscensorp = new BotonAscensor("demorarCerrar", "apagado", numeroPiso);//boton de demorar cerrar puerta
        botonesAscensor.add(botonAscensorp);
        System.out.println(botonAscensorp.toString());

        //instanciar botones de los pisos
        pisos = new ArrayList<>();
        botonesPiso = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            Piso piso = new Piso(i, 0);
            pisos.add(piso);
            BotonPiso botonPiso = new BotonPiso("piso", "apagado", i);
            botonesPiso.add(botonPiso);
            System.out.println(botonPiso.toString());
            System.out.println(piso.toString());
        }
    }

    public static void detenerSistema(){
        System.out.println("Sistema de control detenido");
        System.exit(0);
    }

    //detectar falla :(
    public void detectarFalla(){

        boolean falla = false ; // Simula la detección de una falla aleatoria
        if (falla) {
            System.out.println("Falla detectada");
            SistemaControl.detenerSistema();
        } else {
            System.out.println("No hay falla");
        }
    }

    //notificar alerta
    public void notificarAlerta(){
        System.out.println("Alerta notificada en el piso " + ascensor.getPisoActual());
    }

    public void operarAscensor() {
        // Simula la operación del ascensor
        System.out.println("Ascensor operando...");
        detectarFalla();
        try {
            Thread.sleep(2000); // Espera 2 segundos antes de la siguiente operación
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SistemaControl sistemaControl = new SistemaControl();
        sistemaControl.iniciarSistema();

        // Mantener el sistema activo hasta detectar una falla
        while (true) {
            sistemaControl.operarAscensor();
        }
    }
}