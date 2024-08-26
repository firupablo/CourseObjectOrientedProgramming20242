import java.util.Scanner;

public class AreaCirculo {
    public void calcularArea() {
        Scanner scanner = new Scanner(System.in);
          
          System.out.println("Ingrese el valor del radio del circulo");
          int r = scanner.nextInt();

          double area = Math.PI * Math.pow(r, 2);
  
          System.out.println("El area del ciruclo es: " + area);
        
            scanner.close();
        
    }

    public static void main(String[] args) {
        AreaCirculo objarea = new AreaCirculo();
        objarea.calcularArea();
    }
}