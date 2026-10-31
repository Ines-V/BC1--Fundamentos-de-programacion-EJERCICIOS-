import java.util.Scanner;
public class EncontrarMaximo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int[] numeros=new int[3]; /* Array que guarda 3 numeros. */
        int maximo=numeros [0]; /* Numero maximo es igaul numero introducido, el primer mayor es 0 poruqe todavi no se ha introducido ningun dato. */

        for(int i=0; i<numeros.length; i++) { /* Bucle para introducir numeros del Array. */
            System.out.print("Introduce el numero: ");
            numeros[i]=scanner.nextInt();
        }

        for(int i=0; i<numeros.length; i++) { /* Bucle para almacenar el numero mayor. */
            if (numeros[i]>maximo) {
                maximo=numeros[i];
            }
        }
        System.out.print("Numero máximo: " + maximo);
        scanner.close();
    }
}