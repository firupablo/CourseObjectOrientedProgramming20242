import java.util.Scanner;

public class pagoParqueadero {
    public void calcularPago() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ingrese la cantidad de horas en el parqueadero");
        int horas = scanner.nextInt();

        double valor = (horas * 2000) + ((horas * 2000) * 0.20);

        System.out.println("el oal a pagar es de: " + valor);
        
        scanner.close();
        
    }

    public static void main(String[] args) {
        pagoParqueadero objarea = new pagoParqueadero();
        objarea.calcularPago();
    }
}