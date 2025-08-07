package Clase_10;

import java.util.ArrayList;
import java.util.Comparator;

public class Comparator_comparing {
    public static void main(String[] args) {
        ArrayList <Persona> personas = new ArrayList<>();
        
        personas.add(new Persona("Florencia", 22));
        personas.add(new Persona("Juan", 16));
        personas.add(new Persona("Pablo", 43));
        
        
        personas.sort(Comparator.comparing (p -> p.getNombre()));               //Utilizando la clase comparator llamo al comparing para ordenar el Array a travez del nombre
        
        for (Persona persona : personas) {
            System.out.println(persona.getNombre());        //Florencia, Juan, Pablo
        }
        
        //Puedo ordenar comparando por mas de una condicion con Comparator.comparing()
        personas.sort(Comparator.comparing ((Persona p) -> p.getNombre()).thenComparingInt((Persona p) -> p.getEdad()));        //Ordeno comparando edad y nombre
        
        for (Persona persona : personas) {
            System.out.println(persona.getNombre());        //Florencia, Juan, Pablo
        }
    }
}
