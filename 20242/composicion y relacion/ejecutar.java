public class ejecutar {
    public static void main(String[] args) {
        Cuenta cuenta1  = new Cuenta("1234", "ahorros", 0);
        Cliente cliente1 = new Cliente(1234, "Juan", "Perez");
        banco banco1 = new banco("1234", "Banco de Bogota", cuenta1);
        System.out.println(banco1.toString());
        System.out.println(banco1.esCliente(cliente1));

        System.out.println(cuenta1.consignar(cuenta1.getNumCuenta(), 100000));
        System.out.println(banco1.toString());
    }
}
