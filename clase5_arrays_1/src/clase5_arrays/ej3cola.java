
package clase5_arrays;

import java.util.LinkedList;
import java.util.Queue;

public class ej3cola {
    
    private int cantidadDisponible ;
    private Queue<ej3persona> cola = new LinkedList();

    public ej3cola(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }
    
    public void añadirGente(ej3persona persona){
    
        cola.add(persona);
    }
    
    
    public void comprobarComproEntrada(){
        
        for (int i = 0; i < this.cantidadDisponible; i++) {
            System.out.println("Tiene su entrada: "+ this.cola.poll());
        }
        
    }
 
    
    
}
