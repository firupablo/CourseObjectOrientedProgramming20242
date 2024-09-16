public class operador extends Trabajador{
    public final double VALOR_HORA = 60000;
    private double horasTrabajadas;

    public operador(int id, String nombre, String apellido, double horasTrabajadas) {
        super(id, nombre, apellido);
        this.horasTrabajadas = horasTrabajadas;
    }  

    public double getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public double salario() {
        return VALOR_HORA * horasTrabajadas;
    }

    
}
