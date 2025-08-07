package Clase_10;

import java.util.ArrayList;
import java.util.Iterator;


public class Casa_Iterable implements Iterator <Persona>, Iterable <Persona> {
    private ArrayList <Persona> personas;
    private int posicion;
    
    public Casa_Iterable() {
        this.personas = new ArrayList<>(); // Inicialización del ArrayList
    }
    
    public void setPersonas(Persona persona) {
        this.personas.add(persona);
    }
    
    @Override
    public boolean hasNext(){                                               //Limita al tamaño del ArrayList
        return this.posicion < this.personas.size();        
    }
    
    @Override
    public Persona next(){
        Persona p= this.personas.get(this.posicion);
        this.posicion++;
        return p;
    }
    
    @Override
    public Iterator<Persona> iterator(){
        this.posicion = 0;
        return this;
    }
    
    public static void main(String[] args) {
        Casa_Iterable casa = new Casa_Iterable();
        
        casa.setPersonas(new Persona("Florencia", 22));
        casa.setPersonas(new Persona("Juan", 16));
        casa.setPersonas(new Persona("Pablo", 43));
        
        while (casa.hasNext()) {
            System.out.println(casa.next());
        }
    }
    
    
}
