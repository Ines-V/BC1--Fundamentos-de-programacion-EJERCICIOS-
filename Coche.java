public class Coche { //Variables que se van a usar.
    String marca, modelo;
    int año,kilometros;
    double litros;

    public void encender() { //Metodo para encender el coche.
        System.out.println("Coche"+this.marca+"-"+this.modelo+"esta encendido.");
    }
    public void apagar() { //Metodo para apagar el coche.
        System.out.println("Coche"+this.marca+"-"+this.modelo+"esta apagado.");
    }
    public void conducir(int kilometrosRecorridos) { //Metodo para conducir el coche, calcular los litros gastados y nos quedan y los km conducidor.
        double litrosGastados=kilometrosRecorridos*0.07;
        this.litros=this.litros-litrosGastados;
        this.kilometros=this.kilometros+kilometrosRecorridos;

        System.out.println("Conduciendo"+kilometrosRecorridos+" km se han gastado "+litrosGastados);

        System.out.println("Nos quedan "+litros+" litros");
    }
    public void repostar(double litrosRepostados) { //Metodo para repostar el coche, calcular los litros repostados.
        this.litros=this.litros+litrosRepostados;

        System.out.println("Se han repostado "+litrosRepostados);
    }
    public void informacion(){
        System.out.println("Marca: "+this.marca+" - Modelo: "+this.modelo);
        System.out.println("Con: "+this.litros+" litros - kilometros: "+this.kilometros);
    }

    public static void main(String[] args) { /* Método */
        Coche coche=new Coche();
        coche.marca="Citroen";
        coche.modelo="C3";
        coche.año=2008;
        coche.kilometros=5;
        coche.litros=3.5;

        coche.encender();
        coche.repostar(50);
        coche.informacion();
        coche.conducir(250);
        coche.informacion();
        coche.apagar();
    }
}