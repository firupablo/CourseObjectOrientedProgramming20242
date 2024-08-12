
public class Ejecutar {
    public static void main(String[] args){
        //Java la asignacion en con el =
        // a = 5
        // b = a
        // NOMBRE = "messi"
       // == es de comparacion
       // https://www.dit.upm.es/~pepe/libros/vademecum.pdf

       /*
        * tipos de datos
        numericos-int, log float y double
        booleanos-logicos
        cadena-char y string
        */

        //area cuadrado:

        int b = 2;
        int areaCuadrado = b * b;

        System.out.println("Area del cuadrado = " + areaCuadrado);

        // area circulo

        double r = 0.0;
        final double PI = 3.1416; 
        r = 3;
        double areaCirculo = Math.PI * Math.pow(r,2);
        
        System.out.println("el area del circulo es: " + areaCirculo);


        // celcius a fharengiens

        double f = 1;
        double c = 1;

     

        double gradosCentigrados = (f-32) /(9.0/5.0); //si es real entonces 0.0
        double gradosFarenheit = (c * (9.0/5.0)) +32; 
        
       

        System.out.println(c + "grados centigrados equivalen a fharengeins: " + gradosFarenheit);
        System.out.println(f + "grados farenheit equivalen a celcius: " + gradosCentigrados);
    }
}