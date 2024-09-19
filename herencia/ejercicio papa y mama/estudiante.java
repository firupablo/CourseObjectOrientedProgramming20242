public class estudiante extends persona {
    private int grado;


    public estudiante(int id, String nombre, int edad, int faltas, int grado ) {
        super(id, nombre, edad, faltas);
        this.grado = grado;


    }

    public String info() {
        return super.info() + ", grado: " + grado;
    }


    public String faltar() {
        if (getFaltas() > 3) {
            return "El estudiante " + getNombre() + " ha sido expulsado por faltar " + getFaltas() + " veces";
            
        }else{
            return "El estudiante " + getNombre() + " ha faltado " + getFaltas() + " veces, le quedan " + (3 - getFaltas()) + " faltas";
        }

    }


    
    
}
