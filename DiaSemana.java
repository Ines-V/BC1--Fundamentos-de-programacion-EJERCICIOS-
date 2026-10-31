import java.util.Scanner;
public class DiaSemana {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número entre 1 y 7: ");
        int dia = scanner.nextInt();

        scanner.nextLine();

        switch (dia) { /* Switch se utiliza en el caso del que el usuario tenga varias opciones entre las que elegir y cada una tenga una función distinta. */
            case 1:
                System.out.println("Lunes");
                break; /* Todos los casos deben de terminar en BREAk para que cuando el usuario inrtoduzca ese valor termine en ese y no pase al siguiente si no es necesario. */
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Día no valido");
        }
        scanner.close();
    }
}