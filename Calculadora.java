import java.util.Scanner;
public class Calculadora {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);

        /* Los operadores a usar. */
        double suma=0;
        double restar=0;
        double multiplicacion=0;
        double division=0;
        double resto=0;

        /* Opciones */
        System.out.println("1.Suma. ");
        System.out.println("2.Resta. ");
        System.out.println("3.Multiplicacion. ");
        System.out.println("4.División. ");

        System.out.println("Introduce la opcion: "); /* Las opciones se piden para hacer un SWITCH. */
        int opcion = scanner.nextInt();

        System.out.println("Introduce el primer número: ");
        int num1 = scanner.nextInt();

        System.out.println("Introduce el segundo número: ");
        int num2 = scanner.nextInt();
    
        switch (opcion) {
            case 1:
                suma = num1 + num2;
                System.out.println("La suma es: " + suma);
                break; /* Fin de la opción. */

            case 2:
                restar = num1 - num2;
                System.out.println("La resta es: " + restar);
                break;

            case 3:
                multiplicacion = num1 * num2;
                System.out.println("La multiplicacion es: " + multiplicacion);
                break;

            case 4:
                division = num1/num2; /* Cociente. */
                resto = num1%num2; /* Resto. */
                System.out.println("La división es: " + division + " y su resto es: " + resto);
                break;

            default:/* Opción introducida no esta entre los casos. */
                System.out.println("Opcion incorrecta. ");
                break;
        }

        scanner.close();
    }
}