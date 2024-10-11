package basico;
public class Ejecutar {
    public static void main(String[] args) {
        // Crear un objeto de la clase Marcador
        Marcador objmarcador1 = new Marcador("Sharpie", "Azul", 1.2, true);
        // Llamar al metodo rayar
        objmarcador1.rayar();
        // Llamar al metodo recargar
        System.out.println(objmarcador1.recargar(0.5));
        System.out.println(objmarcador1.toString());
    }
}