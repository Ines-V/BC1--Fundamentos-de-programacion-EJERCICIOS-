import java.util.InputMismatchException;
import java.util.Scanner;
 
public class DatosUsuario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int edad = 0;
        double altura = 0.0;
        boolean entradaValida = false;        
 

        System.out.print("Nombre completo: ");
        String nombreCompleto = scanner.nextLine();
 
        /* Leer edad */
        while (!entradaValida) {
            System.out.print("Introduce tu edad: ");
 
            try {
                edad = scanner.nextInt();
                entradaValida = true;            
            } 
            catch (InputMismatchException e) {
                System.out.println("Entrada no válida. Introduce un número entero.");
                scanner.nextLine();
            }
        }
 
        /* Leer altura */
        entradaValida = false;
        while (!entradaValida) {
            System.out.print("Introduce tu altura: ");
            try {
                altura = scanner.nextDouble();
                entradaValida = true;            
            } 
            catch (InputMismatchException e) {
                System.out.println("Entrada no válida. Introduce una altura correcta.");
                scanner.nextLine(); 
            }
        }
 
        /*Leer si estudia actualmente*/
        System.out.print("¿Estudias actualmente? (true/false): ");
        boolean estudia = scanner.nextBoolean();
 
        // Mostrar los datos con formato
        System.out.printf("\nNombre: %s\n", nombreCompleto.toUpperCase());
        System.out.printf("Edad: %d años\n", edad);
        System.out.printf("Altura: %.2f metros\n", altura);
        if (estudia){
            System.out.printf("Estudia");
        }
        else{
            System.out.printf("No Estudia");
        }
 
        scanner.close();
    }
}