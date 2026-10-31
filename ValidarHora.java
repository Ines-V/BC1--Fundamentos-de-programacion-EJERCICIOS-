public class ValidarHora{
    public static void main(String[] args) {
        System.out.print("Introduce una hora: ");
        int hora = Integer.parseInt(System.console().readLine());
        if(hora>=0 && hora<=23){ /* Las horas son entre 0 y 23 (si fueran 24 sería 1 día) */
            System.out.println("La hora es correcta");
        }else{
            System.out.println("La hora es incorrecta.");
        }

        System.out.print("Introduce los minutos: ");
        int min = Integer.parseInt(System.console().readLine());
        if(min>=0 && min<=59){ /* Los minutos son entre 0 y 59 (si fueran 60 seria 1 hora) */
            System.out.println("Los minutos son correctos");
        }else{
            System.out.println("Los minutos son incorrectos.");
        }

        System.out.print("Introduce los segundos: ");
        int seg = Integer.parseInt(System.console().readLine());
        if(seg>=0 && seg<=59){ /* Los segundos son entre 0 y 59 (si fueran 60 seria 1 minuto) */
            System.out.println("Los segundos son correctos");
        }else{
            System.out.println("Los segundos son incorrectos.");
        }
    }
}