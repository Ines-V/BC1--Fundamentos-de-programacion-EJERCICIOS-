import java.util.Scanner;
public class NombreEdad {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce tu nombre: ");
        String nombre = scanner.nextLine(); /* String se utiliza para introducir texto. */

        System.out.print("Introduce tu edad: ");
        int edad = scanner.nextInt(); /* Int se usa para introducir nuemros enteros sin decimal. */

        System.out.println("Hola, " + nombre + ".Tienes " + edad + "añas."); /* Programa imprime un mensaje con los datos introducidos por el usuario. */

        scanner.close();
    }
}