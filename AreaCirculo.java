import java.util.Scanner;
public class AreaCirculo {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el radio del circulo: ");
        double radio = scanner.nextDouble(); /* Double permite introducir números con decimales. */
        
        //double PI = 3.14;
        //double area = PI *radio*radio;

        double area = Math.PI * Math.pow(radio, 2); /* Java en su memoria tiene en su memoria el valor de PI con el comando MATH(matematicas) */
        System.out.println("El area del circulo es: " + area);

        scanner.close();
    }
}