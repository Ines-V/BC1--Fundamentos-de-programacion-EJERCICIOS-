import java.util.Scanner;
public class MayorDeTres {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);

        /* Introducir los tres números. */
        System.out.print("Introduce el primer número: ");
        int num1 = scanner.nextInt();

        System.out.print("Introduce el segundo número: ");
        int num2 = scanner.nextInt();

        System.out.print("Introduce el tercer número: ");
        int num3 = scanner.nextInt();

        /* Hacer las comparaciones de los números. */
        if (num1>num2 && num1>num3) {
            System.out.println("El número mayor es el primero: " + num1);
        } 
        if (num2>num1 && num2>num3) {
            System.out.println("El número mayor es el segundo: " + num2);
        } 
        if (num3>num2 && num3>num1) {
            System.out.println("El número mayor es el tercero: " + num3);
        } 
        if (num1==num2 && num1==num3 ) {
            System.out.println("Todos los números son iguales. ");
        } 
        if (num1==num2 && num1>num3) {
            System.out.println("El número mayor es el primero y el segundo: " + num1 + " y " + num2);
        } 
        if (num1==num2 && num1<num3) {
            System.out.println("El número mayor es el tercero" + num3);
        } 
        if (num1>num2 && num2==num3) {
            System.out.println("El número mayor es el primero: " + num1);
        } 
        if (num1<num2 && num2==num3) {
            System.out.println("El número mayor es el segundo y el tercero: " + num2 + " y " + num3);
        } 
        if (num1==num3 && num1>num2) {
            System.out.println("El número mayor es el primero y el tercero: " + num1 + " y " + num3);
        } 
        if (num1==num3 && num1<num2){
            System.out.println("El número mayor es el segundo: " + num2);
        }
        scanner.close();
    }
}