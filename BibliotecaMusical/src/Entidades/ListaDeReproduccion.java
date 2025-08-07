
package Entidades;

import java.util.ArrayList;

public class ListaDeReproduccion {
    private String nombre;
    private ArrayList<Cancion> canciones;
    private TipoTematica tematica;

    public ListaDeReproduccion(String nombre, TipoTematica tematica,ArrayList<Cancion> canciones) {
        this.nombre = nombre;
        this.tematica = tematica;
        this.canciones = canciones;
    }
    
    public double getDuracionTotal(){
    double duracionTotal = 0;
    
        for (Cancion cancione : canciones) {
            duracionTotal += cancione.getDuracion();
        }
     return duracionTotal;   
    }
    
    @Override 
    public String toString(){
    StringBuilder sb = new StringBuilder();
    
    sb.append("Nombre: ").append(this.nombre).append("\n");
    sb.append("Tematica: ").append(this.tematica).append("\n");
    for (Cancion cancione : canciones) {
            sb.append(cancione.toString()).append("\n");
    }
        
    return sb.toString();
    }
    
}
