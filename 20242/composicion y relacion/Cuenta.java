public class Cuenta {
    private String numCuenta;
    private String tipoCuenta;
    private double saldo;

    public Cuenta(String numCuenta, String tipoCuenta, double saldo) {
        this.numCuenta = numCuenta;
        this.tipoCuenta = tipoCuenta;
        this.saldo = saldo;
    }

    public String getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Cuenta [numCuenta=" + numCuenta + ", tipoCuenta=" + tipoCuenta + ", saldo=" + saldo + "]";
    }

    public String consignar(String numCuenta, double valor){
        String msg = "error en la transacion";
        if (numCuenta.equals(this.numCuenta)){
            this.saldo += valor;
            msg = "transacion exitosa....saldo actual : " + this.saldo;
        }
        return msg;
    }

}
