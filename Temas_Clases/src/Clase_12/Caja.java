package Clase_12;


public class Caja<T> {
    private T contenido;
    
    public void guardar(T item){
        contenido = item;
    }
    
    public T obtener(){
        return contenido;
    }
    
    public static <T> void imprimirArray(T[] array){
        for (T elem : array){
            System.out.println(elem);
        }
    }
}
