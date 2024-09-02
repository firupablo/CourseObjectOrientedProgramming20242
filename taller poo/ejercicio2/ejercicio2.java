package ejercicio2;
import java.util.Scanner;
public class ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // crear libros
        Libro libro1 = new Libro("El principito", "Antoine de Saint-Exupéry", 15460, 200, false);
        Libro libro2 = new Libro("El alquimista", "Paulo Coelho", 56789, 150, false);
        Libro libro3 = new Libro("Cien años de soledad", "Gabriel García Márquez", 101112, 300, false);
        Libro libro4 = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", 131415, 400,    false);
        Libro libro5 = new Libro("La Odisea", "Homero", 161718, 500, false);
        // prestar libritos
        Scanner sn = new Scanner(System.in);
            boolean salir = false;
            int opcion; //Guardaremos la opcion del usuario
            
            while(!salir){
                
                System.out.println("1. cunsultar disponibilidad");
                System.out.println("2. solicitar un libro");
                System.out.println("3. devolver un libro");
                System.out.println("4. Salir");
                
                System.out.println("Escribe una de las opciones");
                opcion = sn.nextInt();
                
                switch(opcion){
                    case 1:
                        System.out.println("ingrese el numero del libro que desea consultar");
                        int numLibro = scanner.nextInt();
                        switch(numLibro){
                            case 1:
                                System.out.println(libro1.disponibilidad());
                                break;
                            case 2:
                                System.out.println(libro2.disponibilidad());
                                break;
                            case 3:
                                System.out.println(libro3.disponibilidad());
                                break;
                            case 4:
                                System.out.println(libro4.disponibilidad());
                                break;
                            case 5:
                                System.out.println(libro5.disponibilidad());
                                break;
                            default:
                                System.out.println("Solo números entre 1 y 5");
                        }

                        break;
                    case 2:
                        System.out.println("Ingrese el numero del libro que desea solicitar");
                        int numLibroSolicitar = scanner.nextInt();
                        switch(numLibroSolicitar){
                            case 1:
                                System.out.println(libro1.prestar());
                                break;
                            case 2:
                                System.out.println(libro2.prestar());
                                break;
                            case 3:
                                System.out.println(libro3.prestar());
                                break;
                            case 4:
                                System.out.println(libro4.prestar());
                                break;
                            case 5:
                                System.out.println(libro5.prestar());
                                break;
                            default:
                                System.out.println("Solo números entre 1 y 5");
                        }
                        
                        break;
                     case 3:
                        System.out.println("Ingrese el numero del libro que desea devolver");
                        int numLibroDevolver = scanner.nextInt();
                        switch(numLibroDevolver){
                            case 1:
                                System.out.println(libro1.devolver());
                                break;
                            case 2:
                                System.out.println(libro2.devolver());
                                break;
                            case 3:
                                System.out.println(libro3.devolver());
                                break;
                            case 4:
                                System.out.println(libro4.devolver());
                                break;
                            case 5:
                                System.out.println(libro5.devolver());
                                break;
                            default:
                                System.out.println("Solo números entre 1 y 5");
                        }
                        
                        break;
                     case 4:
                        salir=true;
                        break;
                     default:
                        System.out.println("Solo números entre 1 y 4");
                }
                sn.close();
                
            }
            scanner.close();
    }
    
}
