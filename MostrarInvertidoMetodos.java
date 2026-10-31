import java.util.Scanner;
public class MostrarInvertidoMetodos {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int[] numeros=new int[5]; //Numeros que se almacenan en el array.
        
        for(int i=0; i<numeros.length; i++) {
            System.out.print("Dame el valor del array: "); // Pedir numeros en bucle hasta que se llege al numero del arrary (5).
            numeros[i]=scanner.nextInt();
        }    
        System.out.println("El contador del array es:");

        int[] numerosInvertido=invertirArray(numeros); /* Para el método. */

        for(int numero:numerosInvertido) {
            System.out.print(numero+ " "); /* Imprime los números del array invertido. */
        }
        scanner.close();
    }

    public static int[] invertirArray(int[] numeros) {
        int[] numerosInvertidos=new int[numeros.length];
        int key=0;

        for(int i=numeros.length-1; i>=0; i--){
            numerosInvertidos[key]=numeros[i];
            key++;
        }
        return numerosInvertidos;
    }
}