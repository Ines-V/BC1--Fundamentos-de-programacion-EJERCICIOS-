import java.util.Scanner;
public class ContarCaracter{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String cadena="IES Rivera de Castilla";

        System.out.println("Introduce un caracter: "); //Pedir letra aleatoria.
        String caracterBuscar=scanner.nextLine();
        char caracter=caracterBuscar.charAt(0);
        int veces=contarVecesCaracter(cadena, caracter); //Nombre del metodo.
        System.out.print("El caracter " + caracter + " esta " + veces + " vez/veces ");
    }
    public static int contarVecesCaracter(String pal, char car) { //Metodo que cuenta las veces que se repite un caracter en una cadena.
        int contador = 0;

        for (int i = 0; i < pal.length(); i++) { /* Bucle para comprobar si esta la letra/caracter. */
            if (pal.charAt(i) == car) {
                contador+=1;
            }
        }
        return contador;
    }
}