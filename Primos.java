import java.util.Scanner;
public class Primos {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el número que desees: ");
        int num=scanner.nextInt();
        int divisores=0;

        for(int i=1; i<=num; i++) {
            if (num % i==0) { /* Resto del numero (si el resto es 0 es divisor el numero por el que se divide) */
                divisores ++; /* divisores=divisores+1 */
            }
        }
        System.out.println("Divisores: "+divisores);
        
        if (divisores==2) { /* Un número es primo cuando tiene solo 2 divisores. */
            System.out.println("El numero es primo. ");
        } else {
            System.out.println("El numero no es primo. ");
        }
        
        scanner.close();
    }
}