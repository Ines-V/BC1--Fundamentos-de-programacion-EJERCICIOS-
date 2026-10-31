import java.util.Scanner;
public class DiasMes {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número del 1 al 12: "); /* Opciones uqe aparecerán en el SWITCH. */
        int num = scanner.nextInt();

        scanner.nextLine();

        switch (num) { /* Todos los casos posibles con sus respectivos resultados. */
            case 1:
                System.out.println("Es enero y tiene 31 días: ");
                break; /* Terminar cada caso/opcion. */
            case 2:
                System.out.println("Es febrero y tiene 28 días: ");
                break;
            case 3:
                System.out.println("Es marzo y tiene 31 días: ");
                break;
            case 4:
                System.out.println("Es abril y tiene 30 días: ");
                break;
            case 5:
                System.out.println("Es mayo y tiene 31 días: ");
                break;
            case 6:
                System.out.println("Es junio y tiene 30 días: ");
                break;
            case 7:
                System.out.println("Es julio y tiene 31 días: ");
                break;
            case 8:
                System.out.println("Es agosto y tiene 31 días: ");
                break;
            case 9:
                System.out.println("Es septiembre y tiene 30 días: ");
                break;
            case 10:
                System.out.println("Es octubre y tiene 31 días: ");
                break;
            case 11:
                System.out.println("Es noviembre y tiene 30 días: ");
                break;
            case 12:
                System.out.println("Es diciembre y tiene 31 días: ");
                break;
            default: /* Si la opcion introducida no esta entre los casos validos, pasa por todos los breaks y llega aqui, imprimienod el mensaje correspondiente. */
                System.out.println("Día no valido");
       }

        scanner.close();
    }
}