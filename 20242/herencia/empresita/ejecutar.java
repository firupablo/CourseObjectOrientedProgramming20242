package herencia.empresita;
public class ejecutar {
    public static void main(String[] args) {
        //vendedores
        Trabajador obj1 = new vendedor(1, "Juan", "textiles", 8, 20.0);
        Trabajador obj2 = new vendedor(2, "Pedro", "Electrodomesticos", 10, 10.0);
        //operadores
        Trabajador obj3 = new operador(3, "harold", "textiles", 200);
        Trabajador obj4 = new operador(4, "Luis", "Electrodomesticos", 230);

        System.out.println("salario de " + obj3.getNombre()+ " es: " + obj3.salario());

        Trabajador[] trabajadores = new Trabajador[4];
        trabajadores[0] = obj1;
        trabajadores[1] = obj2;
        trabajadores[2] = obj3;
        trabajadores[3] = obj4;

        for (int i = 0; i < trabajadores.length; i++) {
            System.out.println("salario de " + trabajadores[i].getNombre() + " es: " + trabajadores[i].salario());
        }
    }
}
