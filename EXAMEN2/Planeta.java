package EXAMEN2;
public class Planeta{
    String nombre;
    int cantidadSatelite;
    double masa;
    double volumen;
    double diametro;
    double distanciaSol;
    Boolean esObservable;

    public Planeta(String nombre, int cantidadSatelite, double masa, double volumen, double diametro, double distanciaSol, Boolean esObservable){
        this.nombre = nombre;
        this. cantidadSatelite = cantidadSatelite;
        this.masa = masa;
        this.volumen = volumen;
        this.diametro = diametro;
        this.distanciaSol = distanciaSol;
        this.esObservable = esObservable;
    }
    public double calcularDensidad(){
        return masa / volumen;
    }
    public void imprimirDatos(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Cantidad de satélites: " + cantidadSatelite);
        System.out.println("Masa: " + masa);
        System.out.println("Volumen: " + volumen);
        System.out.println("Diámetro: " + diametro);
        System.out.println("Distancia al sol: " + distanciaSol);
        System.out.println("Es observable: " + esObservable);
        System.out.println("Densidad: " + calcularDensidad());
    }
public static void main(String[] args){
    Planeta planet1 = new Planeta("tierra", 1, 5.9736E24, 1.08321E12 , 12742, 150000000, true);
    System.out.println("Datos planeta 1");
    planet1.imprimirDatos();
    Planeta planet2 = new Planeta("jupiter", 1,  1.899E27, 1.4313E15, 139820, 750000000, true);
    System.out.println("Datos planeta 2");
    planet2.imprimirDatos();
 }
}
