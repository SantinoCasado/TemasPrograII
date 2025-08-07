package Clase_5;

public class Alumno {
    private String nombre;
    private String apellido;
    private int edad;
    
    public Alumno(String nombre, String apellido, int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    
    public String MostrarInfo(){
        StringBuilder sb = new StringBuilder();
        sb.append("Nombre: " + this.nombre);
        sb.append("\n");
        sb.append("Apellido: " + this.apellido);
        sb.append("\n");
        sb.append("Edad: " + this.edad);
        
        return sb.toString();
    }
}
