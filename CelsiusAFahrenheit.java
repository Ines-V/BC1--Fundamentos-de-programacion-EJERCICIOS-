import java.util.Scanner;
public class CelsiusAFahrenheit {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la temperatura en grados Celsius: ");
        double Celsius = scanner.nextDouble(); /* Double para poder introducir la temperatura en decimales. */

        double fahrenheit = (Celsius * 9/5)+32; /* Double porque el resultaod de la operación puede ser con decimal. */
        System.out.println(Celsius + "Grados celsius son: " + fahrenheit + " grados fahrenheit");

        scanner.close();
    }
}