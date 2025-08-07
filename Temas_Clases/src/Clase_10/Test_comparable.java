package Clase_10;
import java.util.ArrayList;
import java.util.Collections;

public class Test_comparable {
    public static void main(String[] args) {
        ArrayList <Persona> personas = new ArrayList<>();
        
        personas.add(new Persona("Florencia", 22));
        personas.add(new Persona("Juan", 16));
        personas.add(new Persona("Pablo", 43));
        
        //Internamente la clase Collections utiliza el compare to cuando quiere ordenar el sort, al modificar en Persona el compareTo ahora ordenara por edad
        Collections.sort(personas);                             

        
        for (Persona persona : personas) {
            System.out.println(persona.getNombre());        //Juan, Florencia, Pablo
        }
        
        Collections.reverse(personas);      //Los invierte
        
        for (Persona persona : personas) {
            System.out.println(persona.getNombre());        //Pablo, Florencia, Juan
        }
    }
}