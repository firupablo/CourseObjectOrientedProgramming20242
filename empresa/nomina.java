public class nomina {
    public static void main(String[] args) {
        trabajador[] trabajadores = new trabajador[4];
        trabajadores[0] = new operario("Juan", 25, 1, "Operario", 0, 40);
        trabajadores[1] = new analista("Pedro", 30, 2, "Analista", 0, 100, 1000000);
        trabajadores[2] = new consultor("Maria", 35, 3, "consultor", 0, 45000);
        trabajadores[3] = new analista("Ana", 40, 4, "Analista", 0, 200, 1200000);

        double totalSalario = 0.0;
        for (int i = 0; i < trabajadores.length; i++) {
            totalSalario += trabajadores[i].pagarSalario();
        }

        System.out.println("Total de la nomina: " + totalSalario);

        for (int i = 0; i < trabajadores.length; i++) {
            System.out.println(trabajadores[i].getNombre() + " - " + trabajadores[i].pagarSalario());
        } 
    }
}
