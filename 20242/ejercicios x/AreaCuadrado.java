import java.util.Scanner;

public class AreaCuadrado {
    public void calcularArea() {
        Scanner scanner = new Scanner(System.in);
          
          System.out.println("Ingrese el valor del lado del cuadrado");
            int lado = scanner.nextInt();

            int area = lado * lado;

            System.out.println("El area del cuadrado es: " + area);
        
            scanner.close();
        
    }

    public static void main(String[] args) {
        AreaCuadrado objarea = new AreaCuadrado();
        objarea.calcularArea();
    }
}