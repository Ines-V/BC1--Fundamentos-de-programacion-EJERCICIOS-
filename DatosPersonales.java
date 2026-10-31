import java.util.Scanner;
public class DatosPersonales {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in); 
        ;

        System.out.println("Introduce tu nombre: ");//Usuario introduce su nombre.
        String nombre=scanner.next();

        System.out.println("Introduce tu edad: "); //Usuario introduce su edad.
        int edad=scanner.nextInt();

        System.out.println("Hola, tu nombre es " + nombre+ " y tienes " + edad + " años.");
        scanner.close();
    }
}