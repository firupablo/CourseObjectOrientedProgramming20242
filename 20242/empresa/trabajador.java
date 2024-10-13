package empresa;
public class trabajador {
    private String nombre;
    private int edad;
    private int id; 
    private String puesto;
    private double salario;

    // Constructor
    public trabajador(String nombre, int edad, int id, String puesto, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.id = id;
        this.puesto = puesto;
        this.salario = salario;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }


    public int getEdad() {
        return edad;
    }

    public int getId() {
        return id;
    }

    public String getPuesto() {
        return puesto;
    }

    public double pagarSalario() {
        return salario;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "trabajador [nombre=" + nombre + ", edad=" + edad + ", id=" + id + ", puesto=" + puesto + ", salario="
                + salario + "]";
    }

   
    
}