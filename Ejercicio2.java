import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el primer numero: ");
        double num1 = scanner.nextDouble();

        System.out.print("Introduce el segundo numero: ");
        double num2 = scanner.nextDouble();

        System.out.print("Introduce el tercer numero: ");
        double num3 = scanner.nextDouble();

        double mayor;

        if (num1 > num2 && num1 > num3) {
            mayor = num1;
        } else if (num2 > num1 && num2 > num3) {
                mayor = num2;
            } else {
                mayor = num3;
            }
            scanner.close();
        System.out.println("El mayor es: " + mayor);
    }

}
