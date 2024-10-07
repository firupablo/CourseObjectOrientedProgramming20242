
public class consultor extends trabajador{
    public final double SALARIO_FIJO = 1600000;
    private double comision;

    public consultor(String nombre, int edad, int id, String puesto, double salario, double comision) {
        super(nombre, edad, id, puesto, salario);
        this.comision = comision;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    public double calcularSalario() {
        return SALARIO_FIJO + comision;
    }

    


    

    
    
}
