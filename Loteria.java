import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class Loteria {
    public static void main(String[] args) {
        Random rand= new Random();
        Scanner scanner= new Scanner(System.in);

        int[] numeros=new int[6]; //Array donde se guardan 6 números.
        int colocados=0;

        while(colocados<6) { /*Bucle donde se almacenan numeros entre 1 y 49 y no termina hasta generarse 6 numeros aleatorios. */
            int newNum=rand.nextInt(49)+1; 
            boolean estaYa=false;
            /*Bucle para comprobar si ese numero es nuevo en el Array o ya estaba guardado. 
            Si ya estaba se elimina y se genera otro nuevo sin contarle como numero guardado */
            for(int i=0; i<numeros.length; i++) { 
                if(numeros[i]==newNum) {
                    estaYa=true;
                    break;
                }
            }
            if(!estaYa) { //Imprimir los numeros aleatorios del Array.
                numeros[colocados]=newNum;
                colocados++;
            }
        }
        for(int i=0; i<numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }

        Arrays.sort(numeros);
        System.out.println();
        System.out.println("Numeros ordenados de menor a mayor: "); //Ordenar de mayor a menor.
        for(int i=0; i<numeros.length; i++) {
            System.out.print(numeros[i]+ " ");
        }

        System.out.println(" ");

        /* El usuario introduce un número y si esta en los aleatorios acierta si no es incorrecto. */
        System.out.print("Introduce el número que crea que es que salió: ");
        int opcion=scanner.nextInt();

        boolean acertar=false;

        for (int i=0; i<6; i++) {
            if (opcion==numeros[i]) {
                acertar=true;
                break;
            }
        }

        if (acertar) { 
            System.out.print("Número correcto.");
        }else {
            System.out.print("Número incorrecto.");
        }
        scanner.close();
    }
}