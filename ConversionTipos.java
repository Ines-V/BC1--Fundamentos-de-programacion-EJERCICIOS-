import java.util.Scanner;
public class ConversionTipos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /* El progrma imprime un mensaje, pidiendo al ususario que introduzca un número.. */
        System.out.print("Introduce un número: ");
        /* Double es usado para números decimales. */
        double num = scanner.nextDouble();

        /* Int almacena números enteros sin decimal. */
        int entero = (int) num;

        /* El programa imprime un mensaje con el número entero. */
        System.out.println("El num convertido a entero es: " + entero);

        scanner.close();
    }
}