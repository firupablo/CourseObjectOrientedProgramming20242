import java.util.Scanner;

public class Ejecutos {
    public static void main(String[] args) {
        ReservaDeHotel objres1 = new ReservaDeHotel("", "", "", 101, false);         
        ReservaDeHotel objres2 = new ReservaDeHotel("", "", "", 102, false);
        ReservaDeHotel objres3 = new ReservaDeHotel("", "", "", 103, false);
        ReservaDeHotel objres4 = new ReservaDeHotel("", "", "", 104, false);

        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion;
        System.out.println("");
        System.out.println("///////////////////////////////////////////////");
        System.out.println("Bienvenido al sistema de reservas de hotel");
        System.out.println("");
        System.out.println("ofrecemos 4 habitaciones : 1, 2, 3, 4");
        System.out.println("///////////////////////////////////////////////");


        while (!salir) {
            System.out.println("1. Reservar habitacion");
            System.out.println("2. Cancelar reserva");
            System.out.println("3. Consultar reserva");
            System.out.println("4. Salir");

            System.out.println("Escribe una de las opciones");
            opcion = sn.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("ingrese el numero de la habitacion que desea reservar");
                    int NumDeHabitacion = sn.nextInt();
                    if (NumDeHabitacion <=4 && NumDeHabitacion >=1) {
                        System.out.println("Ingrese el nombre completo del cliente");
                        sn.nextLine();
                        String NombreDelCliente = sn.nextLine();
                        System.out.println("ingrese la fecha de ingreso");
                        String FechaDeIngreso = sn.nextLine();
                        System.out.println("ingrese la fecha de salida");
                        String FechaDeSalida = sn.nextLine();
                        System.out.println("Reserva exitosa...");
                        switch (NumDeHabitacion) {
                            case 1:
                                objres1 = new ReservaDeHotel(NombreDelCliente, FechaDeIngreso, FechaDeSalida, NumDeHabitacion, true);
                                break;
                            case 2:
                                objres2 = new ReservaDeHotel(NombreDelCliente, FechaDeIngreso, FechaDeSalida, NumDeHabitacion, true);
                                break;
                            case 3:
                                objres3 = new ReservaDeHotel(NombreDelCliente, FechaDeIngreso, FechaDeSalida, NumDeHabitacion, true);
                                break;
                            case 4:
                                objres4 = new ReservaDeHotel(NombreDelCliente, FechaDeIngreso, FechaDeSalida, NumDeHabitacion, true);
                                break;
                            default:
                                System.out.println("Solo habitaciones entre 1 y 4");
                        }
                        
                    }else{
                        System.out.println("Solo habitaciones entre 1 y 4");
                    }
                    
                    break;

                case 2:
                    System.out.println("ingrese el numero de la habitacion que desea cancelar la reserva");
                    int NumDeHabitacion2 = sn.nextInt();
                    switch (NumDeHabitacion2) {
                        case 1:
                            System.out.println(objres1.CancelarReserva());
                            break;
                        case 2:
                            System.out.println(objres2.CancelarReserva());
                            break;
                        case 3:
                            System.out.println(objres3.CancelarReserva());
                            break;
                        case 4:
                            System.out.println(objres4.CancelarReserva());
                            break;
                        default:
                            System.out.println("Solo habitaciones entre 1 y 4");

                    }
                    break;
                case 3:
                    System.out.println("ingrese el numero de la habitacion que desea consultar");
                    int NumDeHabitacion3 = sn.nextInt();
                    switch (NumDeHabitacion3) {
                        case 1:
                            System.out.println(objres1.ConsultarReserva());
                            break;
                        case 2:
                            System.out.println(objres2.ConsultarReserva());
                            break;
                        case 3:
                            System.out.println(objres3.ConsultarReserva());
                            break;
                        case 4:
                            System.out.println(objres4.ConsultarReserva());
                            break;
                        default:
                            System.out.println("Solo habitaciones entre 1 y 4");
                    }
                    break;
                case 4:
                    salir = true;
                    break;
                default:
                    System.out.println("Solo números entre 1 y 4");
                    break;

            }
        }
        sn.close();
    }

}