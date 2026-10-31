import java.util.Scanner;
public class Suma {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int[] numeros=new int[5];
        
        int suma=0; /* Contador a cero. */

        for(int i=0; i<numeros.length; i++) {
            System.out.print("Dame el valor del array: ");
            numeros[i]=scanner.nextInt();
            suma+=numeros[i]; /* Se suman los valores ntroducidos por el usuario. */
        }

        System.out.println("Suma: "+suma); /* El programa imprime el resultado. */
        scanner.close();
    }
}