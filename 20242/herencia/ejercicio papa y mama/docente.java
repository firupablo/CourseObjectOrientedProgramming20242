public class docente extends persona {
    private String materia;
    public final double SALARIO = 1400000;


    public docente(int id, String nombre, int edad, int faltas, String materia) {
        super(id, nombre, edad, faltas);
        this.materia = materia;
        

    }

    public String info() {
        return super.info() + ", materia: " + materia;
    }

    public String salario() {
        double salario = SALARIO - (getFaltas() * 45000);
        return "El salario de " + getNombre() + " es de " + salario;

    }
    
}
