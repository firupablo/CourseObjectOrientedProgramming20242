public class operario extends trabajador {
    private final double VALOR_HORA = 50000;
    private int horasTrabajadas;

    public operario(String nombre, int edad, int id, String puesto, double salario, int horasTrabajadas) {
        super(nombre, edad, id, puesto, salario);
        this.horasTrabajadas = horasTrabajadas;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getSalario() {
        return VALOR_HORA * horasTrabajadas;
    }

    

    
    
}
