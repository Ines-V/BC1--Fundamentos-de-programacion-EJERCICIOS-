import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int i=0;
        int j=1;
        
        System.out.print("Introduce hasta que numero deseas llegar: ");
        int num=scanner.nextInt();

        while (i<=num) {
            System.out.print(i + " ");
            int contador= i+j; //Se suman los numeors en orden en fibonnacci. Se termina el bucle cuando contador sea igual al numero que el usuario introdujo.
            i=j;
            j=contador;
        }
        System.out.println();
        scanner.close();
    }
}