import java.util.Scanner;

public class SumaArray {
    public static void main (String[] args) {
        Scanner scanner=new Scanner(System.in);
        
        int[] numero=new int[10]; /* Array para almacenar los datos que introduce el usuario. */

        for (int i=0; i<10; i++) { /* Bucle el cual termina cuando se hayan introducido los 10 numeros. */
            System.out.print("Introduce un número: ");
            numero[i]=scanner.nextInt(); /* Se almacenan los númeors introducidods por el usuario. */
        }

        for (int i=0; i<numero.length; i++) { /* Mostrar los números introducidos por el ussuario una vez que se hayan introducido todos. */
            System.out.println(numero[i]+ " ");
        }

        int resultado=sumaYretorno(numero); /* Variable por la que se sustituye otra variable para poder empezar un método. */
        System.out.println("La suma es: " +resultado); /* Una vez terminado el método el nombre de la variable del metodo se iguala a la sustituida y se imprime el resultado. */
        scanner.close();
    }
    public static int sumaYretorno(int[] retorno) { /* Método. */
        int suma=0;

        for(int i=0; i<retorno.length; i++) {
            suma+=retorno[i];
        }
        return suma; /* Fin/Cerrar método. */
    }
}