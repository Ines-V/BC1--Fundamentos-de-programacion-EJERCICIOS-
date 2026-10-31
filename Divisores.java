import java.util.Scanner;
public class Divisores {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el número que desees: ");
        int num=scanner.nextInt();
        
        for(int i=1; i<=num; i++) {
            if (num % i==0) { /* Resto igual a cero. */
                System.out.println("Los divisores son: " + i);

            }
        }
        
        scanner.close();
    }
}