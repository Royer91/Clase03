import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un numero: ");
        double num = scanner.nextDouble();

        if (num > 0) {
            System.out.println("El número es positivo");
        } else if (num < 0) {
                System.out.println("El número es negativo");
            } else {
                System.out.println("El número es cero");
            }
            scanner.close();
    
    }

}
