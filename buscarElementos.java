import java.util.Scanner;
public class buscarElementos{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int[] numeros = {1,2,3,4,5}; /* Elemtnos del array. */
        System.out.println("valor a buscar: ");
        int valor=scanner.nextInt();
        int pos=buscarElemento(numeros, valor); //Nombre del método.
        if(pos==0) {
            System.out.println("El valor no se encuentra.");
        }else {
            System.out.println("La posicion es: " + pos); /* Imprime la posición del numero encontrado. */
        }
    }

    public static int buscarElemento(int[] valores, int elemento) { //Metodo.
        int posicion=0;

        for(int i=0; i<valores.length; i++) {
            if(elemento==valores[i]) {
                posicion=i;
            }
        }
        return posicion;
    }
}