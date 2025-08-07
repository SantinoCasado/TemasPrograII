package Clase_4;

public class Sobrecarga{
    String nombre;
    String nivelEstudio;
    int edad;

    public Sobrecarga() {
        this.nombre = null;
        this.nivelEstudio = null;
        this.edad = 0;
    }

    public Sobrecarga(String nombre) {
        this();
        this.nombre = nombre;
        
    }

    public Sobrecarga(String nombre, String nivelEstudio) {
        this(nombre);
        this.nivelEstudio = nivelEstudio;
    }

    public Sobrecarga(String nombre, String nivelEstudio, int edad) {
        this(nombre, nivelEstudio);
        this.edad = edad;
    }
}