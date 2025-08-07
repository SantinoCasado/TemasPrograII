
package Entidades;

import java.util.ArrayList;


public class Album {
    private String titulo;
    private int anioLanzamiento;
    private Artista artista;
    private ArrayList<Cancion> canciones;

    public Album(String titulo, int anioLanzamiento, Artista artista,ArrayList<Cancion> canciones) {
        this.titulo = titulo;
        this.anioLanzamiento = anioLanzamiento;
        this.artista = artista;
        this.canciones = canciones;
    }
    
    @Override
    public String toString(){
    StringBuilder sb = new StringBuilder();
    
    sb.append("titulo: ").append(this.titulo).append("\n");
    sb.append("Año Lanzamiento: ").append(this.anioLanzamiento).append("\n");
    sb.append("Artista: ").append(this.artista.toString());
        for (Cancion cancione : canciones) {
            sb.append(cancione.toString()).append("\n");
        }
    return sb.toString();
    }
    
}
