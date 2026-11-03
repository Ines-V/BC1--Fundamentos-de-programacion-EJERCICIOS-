import java.util.Scanner;
public class GestorNotas { //Variables que se van a usar.
    String nombre;
    double promedio, nota;
    int cantidad, aprobado, suspenso;

    String[] alumnos; //Array de estrudiantes
    double[] notas; //Array de notas

    public void menuRegistro() { //Metodo: Añadir nombre y notas de los estudiantes.
        Scanner scanner=new Scanner(System.in);

        System.out.print("Introduce la cantidad de estudiantes: "); //Vantidad de alumnos que se desean introducir. Entre 1 y 10.
        cantidad=scanner.nextInt();

        alumnos= new String[cantidad]; //Array de estudiantes que tiene como limite la cantidad de estudiantes que el ususario quiera ingresar.
        notas= new double[cantidad]; //Array de notas que tiene como limite la cantidad de estudiantes que el ususario quiera ingresar.

        if(cantidad>0 && cantidad<=10) { //Si la cantidad de estudiantes es entre 0 y 10 se hace el bucle.
            for(int i=0; i<cantidad; i++) { //Bucle que se repite hasta que cantidad sea igaul a la cantidad introducida por el ususario.
                System.out.println("Introduce el nombre del estudiante: "); //Nombre estudiante.
                nombre=scanner.next();
                alumnos[i]=nombre;

                System.out.println("Introduce la nota del estudiante: "); //NOta estudiante
                nota=scanner.nextInt();
                notas[i]=nota;

                System.out.println();
                System.out.println("Estudiante "+alumnos[i]+" con nota "+notas[i]+" registrado correctamente."); //Mensaje con el nombre y nota del estudiante.
                System.out.println(); 
            }
        } else { //Si la cantidad es menor de 0 o mayor de 10.
            System.out.println("Cantidad no válida. Introduce la cantidad de estudiantes: ");
            cantidad=scanner.nextInt(); //Volver a introducir la cantidad de estudiantes.
        }
    }
    
    public void promedio() { //Metodo: Calcular el promedio de las notas.
        if (cantidad>0 && cantidad<=10) {
            double suma=0;
            for(int i=0; i<cantidad; i++) { //Bucle para ir sumando las notas mientras se introducen los datos del estudiante.
                suma=suma+notas[i];
            }
            promedio=suma/cantidad; //Dividir las notas entre la cantidad de estudiantes.
            System.out.println("El promedio es: "+promedio);
        }else {
            System.out.println("No hay estudiantes registrados."); //Sin usuarios no se da el promedio.
        }

    }

    public void estadistica() {  //Metodo: Ver las estadisticas de los estudiantes.
        aprobado=0;
        suspenso=0;

        if(cantidad>0 && cantidad<=10){ //Cantidad mayor de 0 y menor o igual de 10 para hacer el bucle.
            for(int i=0; i<cantidad; i++) {
                if (notas[i]>=5 && notas[i]<=10) { //Notas entre 5 y 10 aprobado
                    aprobado=aprobado+1;

                    System.out.println("El estudiante "+alumnos[i]+" ha aprobado con un "+notas[i]);
                } else { //Notas entre 0 y 4 suspenso
                    suspenso=suspenso+1;

                    System.out.println("El estudiante "+alumnos[i]+" ha suspendido con un "+notas[i]);
                }
            }
        } else {
            System.out.println("No hay estudiantes registrados."); //Sin usuarios no se dan las estadisticas.
        }
        System.out.println("Estudiantes aprobados: "+aprobado);

        System.out.println("Estudiantes suspensos: "+suspenso);
    }

    public int buscar() { //Metodo: Buscar estudiante en le registro.
        Scanner scanner=new Scanner(System.in);

        System.out.print("Introduce el nombre del estudiante que desea buscar: ");
        String buscar=scanner.next();

        boolean encontrado=false;

        for(int i=0; i<cantidad; i++) { //Bucle que pasa por cada uno de los nombres del array estudiante.
            if(alumnos[i].equalsIgnoreCase(buscar)) {
                System.out.println("El estudiante esta en la lista. ");
                encontrado=true;
                break;
            }
        }  
        if(!encontrado) { //Contrario al encotrado=false.
            System.out.println("El estudiante no esta en la lista. ");
        }
        return -1; //No vuelve a pedri el nombre del estudiante. Sino seria bucle infinito.
    }

    public void salir() {  //Metodo: Salir del programa.
        System.out.println("Fin del programa.");
    }

    public static void main(String[] args) { //Metodo donde se ejecutan todos los metodos anteriores.
        GestorNotas gestor=new GestorNotas();

        gestor.menuRegistro();
        gestor.estadistica();
        System.out.println();
        gestor.promedio();
        gestor.buscar();
        gestor.salir();
    }
}