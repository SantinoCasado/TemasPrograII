
package Entidades;

import java.util.ArrayList;


public abstract class Persona {
    private String nombre ,dni;
    private ArrayList<String> notificaciones;
    
    public Persona(){
    this.notificaciones = new ArrayList<>();
    }

    public Persona(String persona, String dni) {
        this();
        this.nombre = persona;
        this.dni = dni;
    }
    
    public abstract void notificar(String notificacion);

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public ArrayList<String> getNotificaciones() {
        return notificaciones;
    }
    
    
    protected void agregarNotificaciones(String mensaje){
    this.notificaciones.add(mensaje);
    }

    @Override
    public String toString() {
        return "nombre= " + nombre + ", DNI= " + dni ;
    }
    
    
}
