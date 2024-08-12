/*
public: El método es accesible desde cualquier parte del programa.
private: El método es accesible solo dentro de la clase donde está definido.
protected: El método es accesible desde la misma clase, clases derivadas y clases del mismo paquete.



 * tipos de metodos
 * 
 * sin retorno sin paramettros
 * sin retorno con paramettros
 * con retorno sin paramettros
 * con retorno sin paramettros
 */

 import java.util.Scanner;

 public class Metodos {
 
     public static void main(String[] args) {
        System.out.println("------ AREA CUADRADO ------");
        areaCuadrado(); // invocacion super sonica de un metodo
        System.out.println("///////////////////////////");
        System.out.println("------ AREA CIRCULO ------");
        areaCirculo();
        System.out.println("///////////////////////////");
        System.out.println("------ CONVERSION DE GRADOS ------");
        grados();
        System.out.println("///////////////////////////");
        System.out.println("------ SALARIO NETO ------");
        salario();
        System.out.println("///////////////////////////");
        System.out.println("------ CONVERSION DE MONEDAS ------");
        dolarEuro();
        System.out.println("///////////////////////////");
        System.out.println("------ PAGO PARQUEADERO ------");
        pagoParqueadero();
     }
 
     //sin retorno sin paramettros
     public static void areaCuadrado() {
         Scanner scanner = new Scanner(System.in);
 
         System.out.println("Ingrese el valor del lado del cuadrado");
         int lado = scanner.nextInt();
 
 
         int area = lado * lado;

         System.out.println("El area del cuadrado es: " + area);
 
        
     }

     public static void areaCirculo() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el valor del radio del circulo");
        int r = scanner.nextInt();


        double area = Math.PI * Math.pow(r, 2);

        System.out.println("El area del ciruclo es: " + area);  
    }


    public static void grados() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de grados celcius");
        int c = scanner.nextInt();

        System.out.println("Ingrese la cantidad de grados farenheit");
        int f = scanner.nextInt();

        double cf = (c * (9.0/5.0)) +32;
        double fc = (f-32) /(9.0/5.0);

        System.out.println(c + " grados centigrados equivalen a "+cf+" grados farenheit");
        System.out.println(f + " grados farenheit equivalen a "+fc+" grados celcius"); 
    }

    public static void salario() {
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
    }

    public static void dolarEuro() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ingrese la cantidad de pesos colombianos");
        int pesos = scanner.nextInt();

        double dolar = pesos * 0.00023;
        double euro = pesos * 0.00025;

        System.out.println(pesos + "pesos colombianos equivalen a " + dolar+" dolares");
        System.out.println(pesos + "pesos colombianos equivalen a " + euro+" euros");
    }

    public static void pagoParqueadero() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ingrese la cantidad de horas en el parqueadero");
        int horas = scanner.nextInt();

        double valor = (horas * 2000) + ((horas * 2000) * 0.20);

        System.out.println("el oal a pagar es de: " + valor);

    }
 }


 
