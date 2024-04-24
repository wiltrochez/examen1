public class automovil {
   String marca;
   int modelo;
   int velocidadMaxima;
   int velocidadActual;
   enum tipoAuto{
        CIUDAD, SUBCOMPACTO, COMPACTO, FAMILIAR, EJECUTIVO, SUV
    }
    tipoAuto tipoAutomovil;
    enum tipoCom{
        GASOLINA, BIOETANOL, DIESEL, BIODIESEL, GAS_NATURAL
    }
    tipoCom tipoCombustible;
    public automovil(String marca, int modelo, int velocidadMaxima, int velocidadActual,
            automovil.tipoAuto tipoAutomovil, automovil.tipoCom tipoCombustible) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
        this.velocidadActual = velocidadActual;
        this.tipoAutomovil = tipoAutomovil;
        this.tipoCombustible = tipoCombustible;
    }
    public int getVelocidadActual() {
        return velocidadActual;
    }
    public void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }
    void acelerar(int aumentoVelocidad){
        if (velocidadActual+aumentoVelocidad>velocidadMaxima) {
            System.out.println("no se puede exceder la velocidad maxima");
        } else {
            velocidadActual=velocidadActual+aumentoVelocidad;
        }
    }
    void desacelerar(int disminucionVelocidad){
        if (velocidadActual-disminucionVelocidad<0) {
            System.out.println("no se puede disminuir la velocidad menor que cero");
        } else {
            velocidadActual=velocidadActual-disminucionVelocidad;
        }
    }
    void frenar(){
        velocidadActual=0;
    }
    double calcularTiempoLlegada(int distancia){
        return distancia/velocidadActual;
    }
    void imprimir(){
        System.out.println("marca = " + marca);
        System.out.println("modelo = " + modelo);
        System.out.println("velocidad Maxima = " + velocidadMaxima);
        System.out.println("tipo de combustible = " + tipoCombustible);
        System.out.println("tipo de automovil = " + tipoAutomovil);
        System.out.println("velocidad actual = " + velocidadActual);
    }
    public static void main(String[] args) {
        automovil automovil1 =new automovil("ford", 2024, 240, 0, tipoAuto.CIUDAD, tipoCom.GASOLINA );
        System.out.println("los datos del automovil 1 son los siguientes");
        automovil1.imprimir();
        automovil1.setVelocidadActual(100);
        System.out.println("la velocidad actual es igual a = " + automovil1.velocidadActual);
        automovil1.acelerar(20);
        System.out.println("la velocidad actual es igual a = " + automovil1.velocidadActual);
        automovil1.desacelerar(50);
        System.out.println("la velocidad actual es igual a = " + automovil1.velocidadActual);
        automovil1.frenar();
        System.out.println("la velocidad actual es igual a = " + automovil1.velocidadActual);
        automovil1.desacelerar(10);
    }
}
