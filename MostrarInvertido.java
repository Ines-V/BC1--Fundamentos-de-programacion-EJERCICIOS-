import java.util.Scanner;
public class MostrarInvertido {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int[] numeros=new int[5]; /* Array de 5 números. */
        
        for(int i=0; i<numeros.length; i++) {
            System.out.print("Dame el valor del array: ");
            numeros[i]=scanner.nextInt(); /* Númeors se van acumulando en el array [i] */
        }

        System.out.println("El contador del array es:");

        for(int i=numeros.length-1; i>=0; i--) {
            System.out.print(numeros[i]+" "); /* Muestra todos los números del array. */
        }
        scanner.close();
    }
}