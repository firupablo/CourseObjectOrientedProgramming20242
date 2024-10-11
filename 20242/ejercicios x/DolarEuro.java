import java.util.Scanner;

public class DolarEuro {
    public void calcularPeso() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ingrese la cantidad de pesos colombianos");
        int pesos = scanner.nextInt();

        double dolar = pesos * 0.00023;
        double euro = pesos * 0.00025;

        System.out.println(pesos + "pesos colombianos equivalen a " + dolar+" dolares");
        System.out.println(pesos + "pesos colombianos equivalen a " + euro+" euros");
        
        scanner.close();
        
    }

    public static void main(String[] args) {
        DolarEuro objarea = new DolarEuro();
        objarea.calcularPeso();
    }
}