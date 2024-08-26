
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


        //salario de un empleado
        int sBruto = 1200000;
        int deducciones = 80000;
        int comision = 50000;
        int sNeto = (sBruto - deducciones) + comision;

        System.out.println("el salario final es de: " + sNeto);


        // pesos a dolares y euros

        final double dolar = 0.00025;
        final double euro = 0.00023;
        int peso = 50000;
        double pdolar = peso * dolar;
        double peuro = peso * euro;

        System.out.println(peso + " pesos colombianos equivalen a " + pdolar + " dolares");
        System.out.println(peso + " pesos colombianos equivalen a " + peuro + " euros");

        
        // pago parqueadero

        final int valorH = 2000;
        int hora = 5;
        double iva = 0.20;
        double valor = ((valorH * hora)*iva) + (valorH * hora);

        System.out.println("valor del parqueadero: $" + valor);
        
    }
}

