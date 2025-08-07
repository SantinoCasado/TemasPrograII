package Clase_5;
import java.util.*;

public class Colecciones {
    public static void main(String[] args) {
        //STACK
        //LIFO      (Last in, First out)
        Stack <Integer> pila = new Stack <>();          //Creo un satack de nombre "pila" del tipo integer
        
        pila.push(10);      //Utilizo el push para agregar valores al stack
        pila.push(20);
        pila.push(100);
        
        pila.pop();             //Utlizo el pop para eliminar al ultimo en entrar
        
        System.out.println(pila.peek());        //Muestra el ultimo valor a salir, como el 100 fue eliminado queda el 20
        
        for (int entero : pila) {
           System.out.println(entero);
        }
        
       //QUEUE
       //FIFO   (Firs in, First out)
       Queue <String> cola = new LinkedList <>();
       
       cola.add("Primero");
       cola.add("Segundo");         //Utilizo add para agregar elementos a la cola
       cola.add("Tercero");
       
       cola.poll();                         //Elimina el primer elemento ingresado, "Primero"
       
       System.out.println(cola.peek());     //Muestra el primer elemento agregado, como se elimino "Primero" "Segundo" es el que le sigue
       System.out.println();
       
        for (String cadena : cola) {
            System.out.println(cadena);
        }
        
        //HASHSET
        //No se repiten valores
        
        HashSet <String> conjunto = new HashSet <>();
        
        conjunto.add("A");
        conjunto.add("B");
        conjunto.add("C");
        conjunto.add("A");
        
        for (String letra : conjunto) {
            System.out.println(letra);
        }
        
        //HasMap
        //Almacena pares clave-valor, a traves de claves accede a un valor
        
        Map <String, Integer> edades = new HashMap <>();
        
        edades.put("Ana", 25);
        edades.put("Juan", 30);
        edades.put("Maxi", 36);
        
        System.out.println(edades.get("Ana"));              //Accedo a la clave ana y me devuelve su edad
        System.out.println();
        
        for (Map.Entry<String, Integer> entry : edades.entrySet()) {        //Forma de recorrer el map
            String key = entry.getKey();            //Obtengo la key
            Integer value = entry.getValue();   //Obtengo su valor
            
            System.out.println("key: " + key);
            System.out.println("Value: " + value);
            System.out.println();
        }
        
        
        //ArrayList
        
        ArrayList <Alumno> alumnos = new ArrayList <>();
        Alumno a1 = new Alumno("santino", "casado", 20);
        Alumno a2 = new Alumno("facundo", "casado", 50);
        Alumno a3 = new Alumno("juan", "pedro", 21);
        
        alumnos.add(a1);
        alumnos.add(a2);
        alumnos.add(a3);
        
        alumnos.remove(0);
                
        for (Alumno alumno : alumnos){
            System.out.println(alumno.MostrarInfo());
        }

    }
}
