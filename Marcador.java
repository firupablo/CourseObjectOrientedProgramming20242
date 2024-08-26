public class Marcador {
    //Atributos

    private String nombre;
    private String color;
    private double diametro;
    private boolean esBorrable;

    //Constructor
    public Marcador(String nombre, String color, double diametro, boolean esBorrable) {
        this.nombre = nombre;
        this.color = color;
        this.diametro = diametro;
        this.esBorrable = esBorrable;
    }

    //Metodos

       /*
     * Firma del metodo
     * publico 
     * el nombre del metodo es rayar
     * no retorna nada
     * no tiene parametros o argumentos
     */
    public void rayar() {
        System.out.println("Estoy escribiendo con el marcador ");
    }

 /*
  * Firma del metodo
    * publico
    * el nombre del metodo es recargar
    * retorna un valor de tipo string
    * tiene un parametro de tipo double llamado cantidad
  */
    public String recargar(double cantidad) {
        return "Recargando marcador con " + cantidad + " de tinta";
        
    }

    public String toString() {
        return "{ Marcador : Nombre = " + nombre + ", Color = " + color + ", Diametro = " + diametro + ", Es borrable = " + esBorrable +" }";
    }
}
