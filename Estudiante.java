public class Estudiante {
    String nombre,carrera;
    int edad;
    
    public void informacion() { /* Información que se va a inprimir según los datos del método. */
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Carrera: "+this.carrera);
        System.out.println("Edad: "+this.edad);

        System.out.println("El estudiante "+this.nombre+" tienes "+this.edad+" años y estudias "+this.carrera+".");
    }
    public static void main(String[] args) { /* Método */
        Estudiante estudiante=new Estudiante();
        estudiante.nombre="Juan";
        estudiante.carrera="Ingeniería Informática";
        estudiante.edad=20;

        estudiante.informacion();
    }
}