package Entidades;
import java.util.ArrayList;

/**
Crear clase Taller.

■ Atributos privados: coleccionDeHerramientas: ArrayList<Herramienta>,
cantidadMaxima: int.
■ Método agregarHerramienta(Herramienta): Boolean : Permite agregar una
herramienta sólo si no se alcanza la cantidad máxima.
■ Método getCantidadHerramientas(): int : Devuelve la cantidad actual de
herramientas en el taller.
■ Método mostrarHerramientas(): String : Devuelve
 */

public class Taller {
    // Atributos privados
    private ArrayList<Herramienta> coleccionDeHerramientas;
    private int cantidadMaxima;

    // Constructor
    public Taller(int cantidadMaxima) {
        this.coleccionDeHerramientas = new ArrayList<>();
        this.cantidadMaxima = cantidadMaxima;
    }

    // Método agregarHerramienta
    public boolean agregarHerramienta(Herramienta herramienta) {
        if (coleccionDeHerramientas.size() < cantidadMaxima) {
            coleccionDeHerramientas.add(herramienta);
            return true; // Se pudo agregar
        } else {
            return false; // No se pudo agregar
        }
    }

    // Método getCantidadHerramientas
    public int getCantidadHerramientas() {
        return coleccionDeHerramientas.size();
    }

    // Método mostrarHerramientas
    public String mostrarHerramientas() {
        StringBuilder detalles = new StringBuilder("Herramientas en el taller:\n");     //Creo el StringBuiklder
        
        //Recorro la coleccion de herramientas
        for (Herramienta herramienta : coleccionDeHerramientas) {
            
            //Si la HERRAMIENTA esta instanciada en Taladro
            if (herramienta instanceof Taladro) {
                Taladro taladro = (Taladro) herramienta;
                detalles.append(taladro.mostrarTaladro()).append("\n");    
            } 
            //Si la HERRAMIENTA esta instanciada en LlaveInglesa
            else if (herramienta instanceof LlaveInglesa) {
                LlaveInglesa llave = (LlaveInglesa) herramienta;
                detalles.append(llave.mostrarLlaveIngles()).append("\n");
            } 
            
            //Sino simplemente Mustro lo que tengo
            else {
                detalles.append(herramienta.MostrarHerramienta()).append("\n");
            }
        }
        return detalles.toString();

}
}
