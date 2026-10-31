public class NumerosUnoADiezW {
    public static void main (String [] args) {
        int i=0; /* "i" empieza en 0 */
        while (i<10) { /* bucle hasta que i sea 10, pero no se incluye el 10. */
            System.out.println(i);
            i++;
        }
        System.out.println("Fuera del for: " + i); /* El bucle com es ahsta 10, y el 10 no se incluye y el programa lo imprime aqui. */
    }
}