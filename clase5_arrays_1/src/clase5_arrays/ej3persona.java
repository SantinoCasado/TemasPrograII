package clase5_arrays;

public class ej3persona {
    private String nombre;
    private String apellido;

    public ej3persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }
 
    @Override
    public String toString() {
        return nombre + " " + apellido;
    }
}
