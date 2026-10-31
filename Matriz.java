import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        
        int[][] numero= new int[3][3]; /* Números que se almacenan en un Array de 3x3. */

        for (int i=0; i<3; i++) { //Bucle para introducir filas y columnas. Se termina cuando se llege a 3 respectivamente como indica el Array.
            for(int j=0; j<3; j++){
                System.out.print("Introduce un número: ");
                numero[i][j]=scanner.nextInt();
            }
        }

        //Nombres de los metodos.
        int resultado=sumaElementos(numero);
        int maximo=maximoElemento(numero);
        int minimo=minimoElemento(numero);

        //Imprimir resultados.
        System.out.println("La suma es: " + resultado);
        System.out.println("El elemento máximo es: " + maximo);
        System.out.println("El elemento minimo es: " + minimo);

        scanner.close();
    }

    //Metodos para suma, máximo y mínimo.
    public static int sumaElementos(int[][] retorno) {
        int suma=0;
        
        for (int i=0; i<retorno.length; i++) { //Bucle que va sumadno los numeors del Array.
            for(int j=0; j<retorno.length; j++){
                suma+=retorno[i][j];
            }
        }
        return suma;
    }

    public static int maximoElemento(int[][] numeros) {
        int maximo=numeros[0][0];

        /* Buscar el mayor. 
        Comparar el primer numero con el siguietne y se van acumuladno el mayor en la variable máximo hasta que se temrine. */
        for(int i=0; i<numeros.length; i++) {
            for (int j=0; j<numeros[i].length; j++) { 
                if (numeros[i][j]>maximo) {
                    maximo=numeros[i][j];
                }
            }
        }
        return maximo;
    }

    public static int minimoElemento(int[][] num) {
        int minimo=num[0][0];

        /* Buscar el menor. 
        Comparar el primer numero con el siguietne y se van acumuladno el menor en la variable mínimo hasta que se temrine. */
        for(int i=0; i<num.length; i++) {
            for (int j=0; j<num[i].length; j++) {
                if (num[i][j]<minimo) {
                    minimo=num[i][j];
                }
            }
        }
        return minimo;
    }
}