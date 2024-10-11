
public class persona {
    private int id;
    private String nombre;
    private int edad;
    private int faltas;

    public persona(int id, String nombre, int edad, int faltas) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.faltas = faltas;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getFaltas() {
        return faltas;
    }

    public String faltar() {
        return "";
    }

    public String salario() {
        return "";
    }

    public String info() {
        return "id: " + id + ", nombre: " + nombre + ", edad: " + edad + ", faltas: " + faltas;
    }






















}
