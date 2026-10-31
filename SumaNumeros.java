import java.util.Scanner;
public class SumaNumeros {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);
        boolean positivo=true;
        int contador=0;
        int suma=0;

        int almacenar[]=new int[100];

        while(positivo) { /* Si el numero es positivo se utiliza. */
            System.out.println("Introduce un número: ");
            int respuesta=scanner.nextInt();
            if (respuesta>0) {
                suma=suma+respuesta;
                almacenar[contador]=respuesta;
                contador++; /* contador=contador+1 */
            } else { /* Numero negativo. */
                positivo=false;
            }
        }

        System.out.println("La suma de los numeros es: " +suma);
        System.out.println("El array es: ");
        for(int i=0; i<10; i++) { /* El ususario introduce el número, el bucle termina cuando el ususario introduzca 10. */
            System.out.print(almacenar[i] + " ");
        }
        scanner.close();
    }
}