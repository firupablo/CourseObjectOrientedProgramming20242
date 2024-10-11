package empresa;
public class analista extends trabajador {
    private double salarioIntegral;
    private double lineasCodigo;
    private final double VALOR_LINEA = 1000;

    public analista(String nombre, int edad, int id, String puesto, double salario, double lineasCodigo, double salarioIntegral) {
        super(nombre, edad, id, puesto, salario);
        this.lineasCodigo = lineasCodigo;
        this.salarioIntegral = salarioIntegral;
    }

    public double pagarSalario() {
        return salarioIntegral + (lineasCodigo * VALOR_LINEA);
    }

   

  
    
}
