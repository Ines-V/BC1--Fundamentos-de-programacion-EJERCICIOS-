import java.util.Scanner;
public class PromedioTresNumeros {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);

        /* Double porque los numeros pueden ser decimales. */
        System.out.print("Introduce el primer numero: ");
        double num1 = scanner.nextDouble();

        System.out.print("Introduce el segundo numero: ");
        double num2 = scanner.nextDouble();

        System.out.print("Introduce el tercer numero: ");
        double num3 = scanner.nextDouble();

        double promedio = (num1 + num2 + num3)/3; /* Primero se hace la suma por eso esta entre parentesis y después se hace la división. */
        System.out.println("El promedio de sus tres numeros es: " + promedio);

        scanner.close();
    }
}