public class Ejecutar {
    public static void main(String[] args) {
        // Crear un objeto de la clase Marcador
        Marcador marcador1 = new Marcador("Sharpie", "Azul", 0.5, true);
        // Llamar al metodo rayar
        marcador1.rayar();
        // Llamar al metodo recargar
        System.out.println(marcador1.recargar(0.5));
    }
}