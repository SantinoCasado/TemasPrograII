
package Entidades;

public class Artista {
    private String nombre;
    private EstiloMusical estilo;

    public Artista(String nombre, EstiloMusical estilo) {
        this.nombre = nombre;
        this.estilo = estilo;
    }

    public String getNombre() {
        return nombre;
    }

    public EstiloMusical getEstilo() {
        return estilo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        sb.append("Nombre: ").append(this.nombre);
        sb.append("\n").append("Estilo: ").append(this.estilo);
        
        return sb.toString();
    }
    
    
}
