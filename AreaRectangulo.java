import java.util.Scanner;
public class AreaRectangulo {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la base del rectangulo: ");
        double base = scanner.nextDouble(); /* Double porque la base puede ser decimal. */

        System.out.print("Introduce la altura del rectangulo: ");
        double altura = scanner.nextDouble(); /* Double poruqe la altura puede ser decimal. */

        double area = base*altura; /* Double porque la operación puede ser decimal. */
        System.out.println("El area del rectangulo es: " + area);

        scanner.close();
    }
}