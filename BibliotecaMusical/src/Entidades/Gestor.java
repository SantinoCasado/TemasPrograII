
package Entidades;

import java.util.ArrayList;


public class Gestor<T> implements Icrud<T> {
    private ArrayList<T> elementos;
    
    
    public Gestor(){
    this.elementos = new ArrayList();
    }
    
    @Override
    public void agregar(T elemento) {
        this.elementos.add(elemento);
    }

    @Override
    public void actualizar(T elementoAnterior, T elementoModificado) {
        int indice = elementos.indexOf(elementoAnterior);
        
        if(indice >0 ){
        elementos.set(indice, elementoModificado);
            System.out.println("Reemplazado ");
        }
        
    }

    @Override
    public void eliminar(T elemento) {
          int indice = elementos.indexOf(elemento);
          this.elementos.remove(indice);
    }

    @Override
    public ArrayList<T> obtenerTodos() {
    return this.elementos;
    }

  
}
