import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un numero: ");
        double num = scanner.nextDouble();

        String resultado = (num % 2 == 0) ? "Par" : "Impar";
        System.out.println("El número es: " + resultado);

        scanner.close();

    }

}
