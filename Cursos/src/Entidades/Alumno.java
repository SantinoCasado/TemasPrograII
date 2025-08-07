package Entidades;


public class Alumno {
    private String nombre;
    private String apellido;
    private int edad;
    
    public Alumno(String nombre, String apellido, int edad)
    {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    
    
    public int getEdad() {
        return edad;
    }
    
    public String getNombreCompleto()
    {
        StringBuilder sb = new StringBuilder();
        sb.append(this.nombre);
        sb.append(System.lineSeparator());
        sb.append("Apellido: ").append(this.apellido);
        
        return sb.toString();
    }
}
