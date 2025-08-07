package Clase_10;

import java.util.ArrayList;

public class Integer_compare {
    public static void main(String[] args) {
        ArrayList <Persona> personas = new ArrayList<>();
        
        personas.add(new Persona("Florencia", 22));
        personas.add(new Persona("Juan", 16));
        personas.add(new Persona("Pablo", 43));
        
        //Esta forma es util cuando SOLO hay que comparar una sola cosa en este caso la edad que es un int
        personas.sort((p1, p2) -> Integer.compare(p1.getEdad(), p2.getEdad()));         //Ordena dos personas del array a travez del compare que trae Integer por defoult a partir de la edad
        
        for (Persona persona : personas) {
            System.out.println(persona.getNombre());        //Juan, Florenciaa, Pablo
        }
    }
}
