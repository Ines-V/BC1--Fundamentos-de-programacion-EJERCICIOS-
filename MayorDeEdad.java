import java.util.Scanner;
import java.time.LocalDate;
public class MayorDeEdad {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce tu edad: ");
        int fecha = scanner.nextInt();
        scanner.nextLine();
        int añoActual = LocalDate.now().getYear(); /* Sirve para extraer el AÑO, en este caso, de la fecha actual. */

        if ((añoActual - fecha) >= 18) { /* Restar el año actual con el año de nacimientos del usuario. */
            System.out.println("Eres mayor de edad.");
        } else {
            System.out.println("Eres menor de edad.");
        } 
        scanner.close();
    }
}