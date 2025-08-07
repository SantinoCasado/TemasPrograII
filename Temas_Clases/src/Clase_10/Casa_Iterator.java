package Clase_10;

import java.util.ArrayList;
import java.util.Iterator;


public class Casa_Iterator implements Iterator<Persona>{
    private ArrayList <Persona> personas;
    private int posicion;
    
    public Casa_Iterator() {
        this.personas = new ArrayList<>(); // Inicialización del ArrayList
    }
    
    public void setPersona(Persona persona) {
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
    
    public static void main(String[] args) {
        Casa_Iterator casa = new Casa_Iterator();
        
        casa.setPersona(new Persona("Florencia", 22));
        casa.setPersona(new Persona("Juan", 16));
        casa.setPersona(new Persona("Pablo", 43));
        
        while (casa.hasNext()) {
            System.out.println(casa.next());
        }
    }
}
