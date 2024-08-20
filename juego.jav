import java.util.Scanner;
import java.util.Random;

public class Juego {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numeroSecreto = random.nextInt(100) + 1;
        int intento = 0;
        int numeroUsuario = 0;

        System.out.println("¡Bienvenido al juego de adivinanza de números!");
        System.out.println("He escogido un número entre 1 y 100. ¡Intenta adivinarlo!");

        while (numeroUsuario != numeroSecreto) {
            System.out.print("Introduce tu adivinanza: ");
            numeroUsuario = scanner.nextInt();
            intento++;

            if (numeroUsuario < numeroSecreto) {
                System.out.println("El número es mayor.");
            } else if (numeroUsuario > numeroSecreto) {
                System.out.println("El número es menor.");
            } else {
                System.out.println("¡Felicidades! Has adivinado el número en " + intento + " intentos.");
            }
        }

        scanner.close();
    }
}