import java.util.Scanner;
public class Fibonacci1 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce orden: "); //Pide al usuario introducir un numero, el cual son las posiciones que va a recorrer.
        int orden=scanner.nextInt();
        scanner.nextLine();

        int num1=0;
        int num2=1;
        int suma=0; //Acumulando las posiciones que recorre el programa.

        System.out.println("Secuencia Fibonacci");
        System.out.println(num1);
        System.out.println(num2);
        for(int i=3; i<=orden;i++) { //Bucle hasta que suma llege al numero de orden que hayan pedido el usuario.
            suma=num1+num2;
            System.out.println(suma);
            num1=num2;
            num2=suma;
        }
        scanner.close();
    }
}