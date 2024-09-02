package ejercicio1;
public class CuentaBancaria {
    private double saldo;
    private int numeroCuenta;
    private String titular;

    public CuentaBancaria(double saldo, int numeroCuenta, String titular) {
        this.saldo = saldo;
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
    }

    /*metodos */

    public String consultarCuenta() {
        System.out.println("Titular: " + titular);
        System.out.println("Numero de cuenta: " + numeroCuenta);
        return "Saldo: " + saldo;
    }

    public String retirarSaldo(double monto) {

        if (saldo >= monto) {

            saldo -= monto;
            System.out.println();
            return "Retiro exitoso";

        } else {

            System.out.println("Saldo insuficiente");

            return "error";

        }

    }

    public String depositarSaldo(double monto) {
        saldo += monto;
        return "Deposito exitoso";
    }


}
