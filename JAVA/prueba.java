public class prueba {
   
public static void main(String[] args) {
    persona persona1 = new persona( "juan", "perez", "1234567",1988);
    System.out.println("Datos persona 1");
    persona1.imprimir();
    persona persona2 = new persona("maria", "lopez", "7654321",1993);
    System.out.println("Datos persona2");
    persona2.imprimir();
    System.out.println("la edad de la persona 2 es " +persona2.calcularEdad() + "años");

}

}
