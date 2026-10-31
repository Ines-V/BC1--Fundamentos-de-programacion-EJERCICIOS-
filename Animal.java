public class Animal {
    String nombre,especie;
    int edad;
    
    public void informacion() { /* Información que se va a inprimir según los datos del método. */
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Especie: "+this.especie);
        System.out.println("Edad: "+this.edad);
    }
    public static void main(String[] args) { /* Método */
        Animal animal=new Animal();
        animal.nombre="Perro";
        animal.especie="Canino";
        animal.edad=15;

        animal.informacion();
    }

}