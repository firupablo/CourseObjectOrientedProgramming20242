package ejercicio1;

/*  Cuenta Bancaria  */
import java.util.Scanner;

public class ejercicio1 {

    public static void main(String[] args) {
        // Crear un objeto de la clase CuentaBancaria
        CuentaBancaria objCuentaBancaria1 = new CuentaBancaria(1000, 123456, "Juan Perez");
        // Ingresar a la cuenta

        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; // Guardaremos la opcion del usuario

        while (!salir) {

            System.out.println("1. cunsultar Cuenta");
            System.out.println("2. retirar saldo");
            System.out.println("3. depositar saldo");
            System.out.println("4. Salir");

            System.out.println("Escribe una de las opciones");
            opcion = sn.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println(objCuentaBancaria1.consultarCuenta());
                    break;
                case 2:
                    System.out.println("Ingrese el monto a retirar");
                    double monto = sn.nextDouble();
                    System.out.println(objCuentaBancaria1.retirarSaldo(monto));
                    break;
                case 3:
                    System.out.println("Ingrese el monto a depositar");
                    double montoDeposito = sn.nextDouble();
                    System.out.println(objCuentaBancaria1.depositarSaldo(montoDeposito));
                    break;
                case 4:
                    salir = true;
                    break;
                default:
                    System.out.println("Solo números entre 1 y 4");
            }

        }
        sn.close();

    }
}