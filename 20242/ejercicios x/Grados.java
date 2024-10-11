import java.util.Scanner;

public class Grados {
    public void calcularGrados() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de grados celcius");
        int c = scanner.nextInt();

        System.out.println("Ingrese la cantidad de grados farenheit");
        int f = scanner.nextInt();

        double cf = (c * (9.0/5.0)) +32;
        double fc = (f-32) /(9.0/5.0);

        System.out.println(c + " grados centigrados equivalen a "+cf+" grados farenheit");
        System.out.println(f + " grados farenheit equivalen a "+fc+" grados celcius"); 
        
        scanner.close();
        
    }

    public static void main(String[] args) {
        Grados objarea = new Grados();
        objarea.calcularGrados();
    }
}