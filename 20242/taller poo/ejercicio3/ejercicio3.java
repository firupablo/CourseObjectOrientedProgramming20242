package ejercicio3;

import java.util.Scanner;

public class ejercicio3 {

    public static void main(String[] args) {
        productos producto1 = new productos("papitas", 5, 2500);
        productos producto2 = new productos("chocorramo", 5, 1500);
        productos producto3 = new productos("speed max", 5, 1800);
        productos producto4 = new productos("coca cola", 5, 3000);
        productos producto5 = new productos("salchi-papa", 5, 4500);
        productos producto6 = new productos("salchi-papa-queso", 5, 5000);

        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; // Guardaremos la opcion del usuario

        while (!salir) {

            System.out.println("1. añadir stock");
            System.out.println("2. restar stock");
            System.out.println("3. valor total del inventario");
            System.out.println("4. Salir");

            System.out.println("Escribe una de las opciones");
            opcion = sn.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("ingrese el numero del producto que desea añadir stock");
                    int numProducto = sn.nextInt();
                    switch (numProducto) {
                        case 1:
                            System.out.println("Ingrese la cantidad de unidades que desea añadir");
                            int monto = sn.nextInt();
                            System.out.println(producto1.añadir(monto));
                            break;
                        case 2:
                            System.out.println("Ingrese la cantidad de unidades que desea añadir");
                            monto = sn.nextInt();
                            System.out.println(producto2.añadir(monto));
                            break;
                        case 3:
                            System.out.println("Ingrese la cantidad de unidades que desea añadir");
                            monto = sn.nextInt();
                            System.out.println(producto3.añadir(monto));
                            break;
                        case 4:
                            System.out.println("Ingrese la cantidad de unidades que desea añadir");
                            monto = sn.nextInt();
                            System.out.println(producto4.añadir(monto));
                            break;
                        case 5:
                            System.out.println("Ingrese la cantidad de unidades que desea añadir");
                            monto = sn.nextInt();
                            System.out.println(producto5.añadir(monto));
                            break;
                        case 6:
                            System.out.println("Ingrese la cantidad de unidades que desea añadir");
                            monto = sn.nextInt();
                            System.out.println(producto6.añadir(monto));
                            break;
                        default:
                            System.out.println("Solo números entre 1 y 6");
                    }

                    break;
                case 2:
                    System.out.println("Ingrese el numero del producto que desea resar stock");
                    int numProductoSolicitar = sn.nextInt();
                    switch (numProductoSolicitar) {
                        case 1:
                            System.out.println("Ingrese la cantidad de unidades que desea quitar");
                            int monto = sn.nextInt();
                            System.out.println(producto1.quitar(monto));
                            break;
                        case 2:
                            System.out.println("Ingrese la cantidad de unidades que desea quitar");
                            monto = sn.nextInt();
                            System.out.println(producto2.quitar(monto));
                            break;
                        case 3:
                            System.out.println("Ingrese la cantidad de unidades que desea quitar");
                            monto = sn.nextInt();
                            System.out.println(producto3.quitar(monto));
                            break;
                        case 4:
                            System.out.println("Ingrese la cantidad de unidades que desea quitar");
                            monto = sn.nextInt();
                            System.out.println(producto4.quitar(monto));
                            break;
                        case 5:
                            System.out.println("Ingrese la cantidad de unidades que desea quitar");
                            monto = sn.nextInt();
                            System.out.println(producto5.quitar(monto));
                            break;
                        case 6:
                            System.out.println("Ingrese la cantidad de unidades que desea quitar");
                            monto = sn.nextInt();
                            System.out.println(producto6.quitar(monto));
                            break;
                        default:
                            System.out.println("Solo números entre 1 y 6");
                    }
                    break;
                case 3:
                    int totali = producto1.valorTotal() + producto2.valorTotal() + producto3.valorTotal()
                            + producto4.valorTotal() + producto5.valorTotal() + producto6.valorTotal();
                    System.out.println("el valor total del inventario es: " + totali);

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
