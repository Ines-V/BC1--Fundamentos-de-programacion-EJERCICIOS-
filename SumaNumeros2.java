import java.util.Scanner;
public class SumaNumeros2 {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in); 
        int suma=0;

        System.out.println("Introduce un número: ");
        int num=scanner.nextInt();

        while (num>=0) { //Bucle que termina cuando el usuario introduce un número negativo.
            suma=suma+num;
            System.out.println("Introduce un número: ");
            num=scanner.nextInt();
        }
        
        System.out.println("La suma es: " + suma);
        scanner.close();
    }
}