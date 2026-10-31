import java.util.Scanner;
public class SumaDiagonal {
    public static void main (String[] args) {
        Scanner scanner=new Scanner(System.in);

        int[][] numero=new int[3][3]; /* Array de 3x3, en [] se ponen los números que el usuario desea poner */

        for (int i=0; i<3; i++) { /* la i empieza desde 0 hasta 3 y no termina el FOR hasta que el usuario introduzca los 3 valores */
            for(int j=0; j<3; j++){ /* la j empieza desde 0 hasta 3 y no termina el FOR hasta que el usuario introduzca los 3 valores */
                System.out.print("Introduce un número: ");
                numero[i][j]=scanner.nextInt(); /* El programa muestra todos los números intorucidos por el ususario*/
            }
        }

        System.out.println();
        int resultado=sumaYretorno(numero); /* Nombrar la método. */
        System.out.println("La suma es: " +resultado); /* El programa imprime la solución del método. */
        scanner.close();
    }
    public static int sumaYretorno(int[][] retorno){ /* Método. */
        int suma=0;
        
        for (int i=0; i<retorno.length; i++) {
            for(int j=0; j<retorno.length; j++){
                /* Se introduce el primer valor de "i" y se suma a la variable "suma". 
                Se repite hasta el usuario haya introducido los 3 valores de i y los tres valores a continuación de "j" */
                suma+=retorno[i][j]; 
            }
        }
        return suma; /* Terminar método. */
    }
}