public class ejecutar {
    public static void main(String[] args) {
        Cuenta cuenta1  = new Cuenta("1234", "ahorros", 0);
        Cuenta cuenta2  = new Cuenta("5678", "corriente", 0);
        Cliente cliente1 = new Cliente(1109117536, "Juan", "Perez");
        banco banco1 = new banco("1234", "Banco de Bogota", cuenta1);


        System.out.println(cuenta1.consignar(cuenta1.getNumCuenta(), 100000));
        System.out.println(banco1.toString());
        System.out.println(banco1.esCliente(cliente1));

        System.out.println(cuenta1.retirar(cuenta1.getNumCuenta(), 50000));

        System.out.println(cuenta1.consultarSaldo(cuenta1.getNumCuenta()));

        System.out.println(cuenta1.transferir(cuenta1.getNumCuenta(), cuenta2, 50000));
        System.out.println(cuenta1.consultarSaldo(cuenta1.getNumCuenta()));
        System.out.println(cuenta2.consultarSaldo(cuenta2.getNumCuenta()));



    }

    public static String transferir(String cuentaOrigen, double monto, String cuentaDestino) {
        // Implement the transfer logic here
        return "Transferencia realizada de " + cuentaOrigen + " a " + cuentaDestino + " por " + monto;
    }
}
