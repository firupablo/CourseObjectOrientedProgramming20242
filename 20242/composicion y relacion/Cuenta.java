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

    public String consultarSaldo(String numCuenta){
        String msg = "error en la transacion";
        if (numCuenta.equals(this.numCuenta)){
            msg = "saldo actual : " + this.saldo;
        }     
        return msg;  
    }

    public String consignar(String numCuenta, double valor){
        String msg = "error en la transacion";
        if (numCuenta.equals(this.numCuenta)){
            this.saldo += valor;
            msg = "transacion exitosa....saldo actual : " + this.saldo;
        }
        return msg;
    }

    public String retirar(String numCuenta, double valor){
        if (numCuenta.equals(this.numCuenta)){
            if (this.saldo >= valor){
                this.saldo -= valor;
                return "retiso exitoso....saldo actual : ";
            }
        }   
        return "error en la transacion";
    }

    public String transferir(String numCuentaOrigen, Cuenta numCuentaDestino, double valor){
        if (retirar(numCuentaOrigen, valor)) {
            numCuentaDestino.consignar(numCuentaDestino.getNumCuenta(), valor);
            return "transferencia exitosa";
        } else {
            return "error en la transaccion";
        }
    }

}
