
    import java.util.Scanner;

public class Salario {
    public void calcularSalario() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ingrese el valor de las horas");
        int valorHora = scanner.nextInt();

        System.out.println("ingrese la cantidad de las horas laburadas");
        int totalHora = scanner.nextInt();

        System.out.println("ingrese el valor de las deducciones");
        int deducciones = scanner.nextInt();

        System.out.println("ingrese el valor de las comisiones");
        int comisiones = scanner.nextInt();

        int salario = ((valorHora*totalHora)-deducciones)+comisiones;

        System.out.println("el salario neto final es de: "+salario);
        
        scanner.close();
        
    }



    public static void main(String[] args) {
        Salario objarea = new Salario();
        objarea.calcularSalario();
    }
}

