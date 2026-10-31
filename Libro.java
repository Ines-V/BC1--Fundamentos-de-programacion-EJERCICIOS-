public class Libro {
    /* Tipos de variables que tenemos. */
    String titulo, autor; /* String: Texto */
    int añoPublicacion; /* int: Número entero */
    
    public void informacion() { /* Información que se va a inprimir según los datos del método. */
        System.out.println("Título: "+this.titulo);
        System.out.println("Autor: "+this.autor);
        System.out.println("Año de publicación: "+this.añoPublicacion);
    }
    public static void main(String[] args) { /* Método */
        Libro libro=new Libro();
        libro.titulo="Harry Potter";
        libro.autor="J.K. Rowling";
        libro.añoPublicacion=1997;

        libro.informacion(); 
    }
}