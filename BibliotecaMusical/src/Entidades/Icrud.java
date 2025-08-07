
package Entidades;

import java.util.ArrayList;


public interface Icrud <T>{
    void agregar(T elemento);
    void actualizar(T elementoAnterior,T elementoModificado);
    void eliminar(T elemento);
    ArrayList<T> obtenerTodos();
}
