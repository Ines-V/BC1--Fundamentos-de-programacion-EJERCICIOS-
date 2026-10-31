import java.util.Scanner; 
public class CuentaBancaria { 
    String titular;
    int numeroCuenta;
    double saldo;

    public void ingresar(double cantidad) { //Dinero que se ingresara
        if (cantidad < 0) {
            System.out.println("No se puede ingresar una cantidad negativa.");
        } else {
            this.saldo = this.saldo + cantidad;
            System.out.println("Se ha ingresado " + cantidad + " euros.");
        }
    }

    public void retirar(double cantidad) { //Dinero que se retirara
        if (cantidad < 0) {
            System.out.println("No se puede retirar una cantidad negativa.");
        } else if (this.saldo >= cantidad) {
            this.saldo = this.saldo - cantidad;
            System.out.println("Se ha retirado " + cantidad + " euros.");
        } else {
            System.out.println("No hay suficiente saldo.");
        }
    }

    public void informacion() { //Informacion del programa.
        System.out.println("Titular: " + this.titular);
        System.out.println("Número de cuenta: " + this.numeroCuenta);
        System.out.println("Saldo actual: " + this.saldo + " euros");
    }

    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);

        CuentaBancaria cuenta = new CuentaBancaria();
        cuenta.titular = "Juan";
        cuenta.numeroCuenta = 123456789;
        cuenta.saldo = 1000;

        cuenta.informacion(); /*Datos que apareceran en pantalla. */

        System.out.print("Introduce la cantidad que quieres ingresar: "); // Introduce el ususrio lo que se ingresar.
        double cantidadIngreso = scanner.nextDouble();
        cuenta.ingresar(cantidadIngreso);

        System.out.print("Introduce la cantidad que quieres retirar: "); // Introduce el ususrio lo que se retira.
        double cantidadRetiro = scanner.nextDouble();
        cuenta.retirar(cantidadRetiro);

        cuenta.informacion();

        scanner.close();
    }
}