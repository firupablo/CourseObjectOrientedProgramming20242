package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Perfume perfume1 = new Perfume("Dior", "Sauvage", 200, 100);
        Perfume perfume2 = new Perfume("Chanel", "Coco", 150, 100);
        Perfume perfume3 = new Perfume("Dior", "J'adore", 300, 100);
        Perfume perfume4 = new Perfume("Chanel", "No. 5", 400, 100);
        Perfume perfume5 = new Perfume("Dior", "Miss Dior", 500, 100);
        Perfume perfume6 = new Perfume("Chanel", "Chance", 600, 100);

        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; // Guardaremos la opcion del usuario

        while (!salir) {
            System.out.println("1. aplicar perfume");
            System.out.println("2. cambiar precio");
            System.out.println("3. consultar estado del perfume");
            System.out.println("4. Salir");

            System.out.println("Escribe una de las opciones");
            opcion = sn.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("ingrese el numero del perfume que desea aplicar");
                    int numProducto = sn.nextInt();
                    switch (numProducto) {
                        case 1:
                            System.out.println(perfume1.aplicar());
                            break;
                        case 2:
                            System.out.println(perfume2.aplicar());
                            break;
                        case 3:
                            System.out.println(perfume3.aplicar());
                            break;
                        case 4:
                            System.out.println(perfume4.aplicar());
                            break;
                        case 5:
                            System.out.println(perfume5.aplicar());
                            break;
                        case 6:
                            System.out.println(perfume6.aplicar());
                            break;
                        default:
                            System.out.println("Solo números entre 1 y 6");
                    }
                    break;
                case 2:
                    System.out.println("Ingrese el numero del perfume que desea cambiar el precio");
                    int numProductoSolicitar = sn.nextInt();
                    System.out.println("Ingrese el nuevo precio");
                    int monto = sn.nextInt();
                    switch (numProductoSolicitar) {
                        case 1:
                            System.out.println(perfume1.cambiarPrecio(monto));
                            break;
                        case 2:
                            System.out.println(perfume2.cambiarPrecio(monto));
                            break;
                        case 3:
                            System.out.println(perfume3.cambiarPrecio(monto));
                            break;
                        case 4:
                            System.out.println(perfume4.cambiarPrecio(monto));
                            break;
                        case 5:
                            System.out.println(perfume5.cambiarPrecio(monto));
                            break;
                        case 6:
                            System.out.println(perfume6.cambiarPrecio(monto));
                            break;
                        default:
                            System.out.println("Solo números entre 1 y 6");
                    }
                    break;
                case 3:
                    System.out.println("Ingrese el numero del perfume que desea consultar");
                    int numProductoConsultar = sn.nextInt();
                    switch (numProductoConsultar) {
                        case 1:
                            System.out.println(perfume1.consultarEstado());
                            break;
                        case 2:
                            System.out.println(perfume2.consultarEstado());
                            break;
                        case 3:
                            System.out.println(perfume3.consultarEstado());
                            break;
                        case 4:
                            System.out.println(perfume4.consultarEstado());
                            break;
                        case 5:
                            System.out.println(perfume5.consultarEstado());
                            break;
                        case 6:
                            System.out.println(perfume6.consultarEstado());
                            break;
                        default:
                            System.out.println("Solo números entre 1 y 6");
                    }
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