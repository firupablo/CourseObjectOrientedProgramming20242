package herencia.empresita;
public class operador extends Trabajador{
    public final double VALOR_HORA = 60000;
    private double horasTrabajadas;
    private double salario;

    public operador(int id, String nombre, String apellido, double horasTrabajadas) {
        super(id, nombre, apellido);
        this.horasTrabajadas = horasTrabajadas;
    }  

    public double getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public double salario() {
        salario = VALOR_HORA * horasTrabajadas;
        return salario;
    }

    
}
