
package clase5_arrays;

import java.util.HashSet;


public class ej4hash {
    private Integer[] numeros;
    private HashSet<Integer> hash= new HashSet<>();
        
        
    
    public ej4hash(Integer[] numero) {
        this.numeros = numero;
       
    }
    
    public void mostrarArray(){
        for(Integer numero : this.numeros ){
            hash.add(numero);
        }
        for (Integer numero:this.hash){
            
        System.out.println(numero);
        
        }
    }
    
    
    
}
