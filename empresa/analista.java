public class analista extends trabajador {
    private final double salario = 2000000;

    public analista(String nombre, int edad, int id, String puesto, double salario) {
        super(nombre, edad, id, puesto, salario);
    }

    public double getSalario() {
        return salario;
    }

   

  
    
}
