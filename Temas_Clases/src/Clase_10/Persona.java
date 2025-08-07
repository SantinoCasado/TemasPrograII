package Clase_10;

//Implemento para poder utilizar el Comparable
public class Persona implements Comparable <Persona>{           
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }
    
    //Comparable
    @Override
    public int compareTo(Persona p){                    //Modifico la clase defaoult compareTo para que compare por edad
        return Integer.compare(this.edad, p.edad);
    }

}
