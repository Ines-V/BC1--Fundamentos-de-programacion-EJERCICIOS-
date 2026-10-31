import java.util.Scanner;
import java.time.LocalDate;
public class EdadCien {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);

        int edad=0;
        int falta=0;

        System.out.println("Introduce el año de su nacimiento: ");
        int año = scanner.nextInt();

        scanner.nextLine();
        int actual = LocalDate.now().getYear(); /* La función sirve, en este caso, para extraer el AÑO en el que nos encontramos teneindo encuenta la fecha de hoy (dia, mes y año) */

        edad = actual - año; /* Edad actual */
        int cien = actual - año; /* Saber si tienes 100 años o no. */
        falta = 100 - edad; /* Años que galtan para llegar a 100. */


        if (cien == 100) { /* Si la variable cien es igual a 100 */
            System.out.println("Tu edad es: " + edad);
            System.out.println("Ha cumplido los 100 años.");
            System.out.println("Te faltan: " + falta + " años para cumplir los 100 años.");
        } else { /* Si la variable cien no es igual a 100 */
            System.out.println("La edad que tiene es: " + edad);
            System.out.println("No ha cumplido los 100 años.");
            System.out.println("Te faltan: " + falta + " año/s para cumplir los 100 años.");
        }
        scanner.close();
    }
}