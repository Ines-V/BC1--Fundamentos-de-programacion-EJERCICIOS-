import java.util.Scanner;
public class GestorNotas { //Variables que se van a usar.
    String nombre;
    double promedio;
    int cantidad, nota, aprobado, suspenso;

    String[] alumnos;
    int[] notas;

    public void menuRegistro() { 
        Scanner scanner=new Scanner(System.in);

        System.out.print("Introduce la cantidad de estudiantes: ");
        cantidad=scanner.nextInt();

        alumnos= new String[cantidad];
        notas= new int[cantidad];

        if(cantidad>0 && cantidad<=10) {
            for(int i=0; i<cantidad; i++) {
                System.out.println("Introduce el nombre del estudiante: ");
                nombre=scanner.next();
                alumnos[i]=nombre;

                System.out.println("Introduce la nota del estudiante: ");
                nota=scanner.nextInt();
                notas[i]=nota;

                System.out.println();
                System.out.println("Estudiante "+alumnos[i]+" con nota "+notas[i]+" registrado correctamente.");
                System.out.println();

                scanner.nextLine(); 
            }
        } else {
            System.out.println("Cantidad no válida. Introduce la cantidad de estudiantes: ");
            cantidad=scanner.nextInt();
        }
    }
    
    public void promedio() { 
        promedio=0;

        if (cantidad>0 && cantidad<=10) {
            double suma=0;
            for(int i=0; i<cantidad; i++) {
                suma=suma+notas[i];
            }
            this.promedio=suma/cantidad;
            System.out.println("El promedio es: "+this.promedio);
        }else {
            System.out.println("No hay estudiantes registrados.");
        }

    }

    public void estadistica() { 
        aprobado=0;
        suspenso=0;

        if(cantidad>0 && cantidad<=10){
            for(int i=0; i<cantidad; i++) {
                if (notas[i]>=5 && notas[i]<=10) {
                    aprobado=aprobado+1;

                    System.out.println("El estudiante "+alumnos[i]+" ha aprobado con un "+notas[i]);
                } else {
                    suspenso=suspenso+1;

                    System.out.println("El estudiante "+alumnos[i]+" ha suspendido con un "+notas[i]);
                }
            }
        } else {
            System.out.println("No hay estudiantes registrados.");
        }
        System.out.println("Estudiantes aprobados: "+aprobado);

        System.out.println("Estudiantes suspensos: "+suspenso);
    }

    public int buscar() { 
        Scanner scanner=new Scanner(System.in);

        System.out.print("Introduce el nombre del estudiante que desea buscar: ");
        String buscar=scanner.next();

        boolean encontrado=false;

        for(int i=0; i<cantidad; i++) {
            if(alumnos[i].equalsIgnoreCase(buscar)) {
                System.out.println("El estudiante esta en la lista. ");
                encontrado=true;
                break;
            }
        }  
        if(!encontrado) {
            System.out.println("El estudiante no esta en la lista. ");
        }
        return -1;
    }

    public void salir() { 
        System.out.println("Fin del programa.");
    }

    public static void main(String[] args) { 
        GestorNotas gestor=new GestorNotas();

        gestor.menuRegistro();
        gestor.estadistica();
        System.out.println();
        gestor.promedio();
        gestor.buscar();
        gestor.salir();
    }
}