import java.util.Scanner;
public class VocalMayuscula {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce una vocal: ");
        char vocal = scanner.next().charAt(0);

        vocal = Character.toLowerCase(vocal); /* el comando sirve para que el progrma sepa que la vocal (Character) introducida es minúscula (Lower). */

        if (vocal == 'a' || vocal == 'e'|| vocal == 'i' || vocal == 'o' || vocal == 'u') { /*El programa comprueba si la letra introducida es vocal. */
            System.out.println("La vocal en mayuscula es " + Character.toUpperCase(vocal)); /* Si la letra es vocal: el programa devuelve la vocal (Character) en mayúscula (Upper). */

        } else { /* Si no es vocalpasa al else. */
            System.out.println("El carácter introducido no es una vocal");
        }

        scanner.close();
    }
}