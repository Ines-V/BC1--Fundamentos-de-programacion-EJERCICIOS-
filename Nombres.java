import java.util.Scanner;
public class Nombres {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String[] nombres=new String[3]; /* Array que alamcena 3 nombres. */
        
        for(int i=0; i<nombres.length; i++) { /*Bucle que termina cuando el usuario haya introducido  los 3 nombres. */
            System.out.print("Introduce el nombre: ");
            nombres[i]=scanner.next(); /* Se acumulan/guardan los nombres en la variable "i" */

            for(int j=0; j<=i; j++) { /* Bucle que permite al programa guardar los nombres introducidos */
                System.out.println(nombres[j] + " ");
            }
        }
        scanner.close();
    }
}