import java.util.Scanner;
public class ParImpar {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int num = scanner.nextInt();

        if (num % 2 == 0) { /* El % sirve para saber cual es el resto de la divisón. */
            System.out.println(num + " es para"); /* Si el resto es 0 es par. */
        } else {
            System.out.println(num + " es impar"); /* Si el resto no es 0 es impar. */
        }
        scanner.close();
    }
}