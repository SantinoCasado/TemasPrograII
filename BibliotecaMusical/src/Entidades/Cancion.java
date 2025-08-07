
package Entidades;


public class Cancion {
    private String nombre;
    private Double duracion;
    private int anioLanzamiento;

    public Cancion(String nombre, Double duracion, int anioLanzamiento) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.anioLanzamiento = anioLanzamiento;
    }
    
    public double getDuracion(){
    return this.duracion;
    }
    
    @Override
    public String toString(){
    StringBuilder sb = new StringBuilder();
    sb.append("Nombre: ").append(this.nombre).append("\n");
    sb.append("Duracion: ").append(this.duracion).append("\n");
    sb.append("Año Lanzamiento: ").append(this.anioLanzamiento);
    
    return sb.toString();
    }
}
