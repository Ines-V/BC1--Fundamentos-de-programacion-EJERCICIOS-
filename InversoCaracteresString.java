public class InversoCaracteresString {
    public static void main(String[] args) {
        String cadena="hola";
        String cadenaInvertida=invertirString(cadena);
        System.out.println(cadenaInvertida);

    }

    public static String invertirString(String cadena) {
        char[] caracteres= cadena.toCharArray(); /* char=character. Se hace un Array para guardar cada letra del mensaje. */
        char[] caracteresInvertidos=new char[caracteres.length]; /* Array para guardar los caracters invertidos del mensaje. */
        int index=0;
        for(int i=caracteres.length-1; i>=0; i--) {
            caracteresInvertidos[index]=caracteres[i];
            index++;
        }
        String stringInvertido=new String(caracteresInvertidos);

        return stringInvertido;
    }
}