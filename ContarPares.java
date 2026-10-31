import java.util.Scanner;
public class ContarPares {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int[] numeros=new int[5];
        
        int suma=0; /* Suma inicializada a cero. */
        int contador=0; /* Contador inicializado a cero. */

        for(int i=0; i<numeros.length; i++) {
            System.out.print("Dame el valor del array: ");
            numeros[i]=scanner.nextInt();
            if (numeros[i]%2==0) { /* Si es resto de dividir entre 2 es 0, los números son pares... */
                suma+=numeros[i];/* ...se suman los números pares. */
                contador++; /* al contador se añade o suma 1. */
            }
        }

        System.out.println("Suma de los pares: "+suma);
        System.out.println("Total de pares: "+contador);
        
        scanner.close();
    }
}