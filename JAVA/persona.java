public class persona{
    String nombre;
    String apellido;
    String identificacion;
    int anioNacimiento;

    public persona(String nombre, String apellido, String identificacion, int anioNacimiento) {
        this.nombre=nombre;
        this.apellido = apellido;
        this.identificacion = identificacion;
        this.anioNacimiento = anioNacimiento;

    }
    public void imprimir(){
        System.out.println("nombre = " +nombre);
        System.out.println("apellido" +apellido);
        System.out.println("cedula ciudadania" +identificacion);
        System.out.println("año de nacimiento" +anioNacimiento);

    }

    public double calcularEdad(){
        return 2024-anioNacimiento;
    }

}
